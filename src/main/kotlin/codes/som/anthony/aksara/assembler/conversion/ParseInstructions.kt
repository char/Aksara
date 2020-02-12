package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.conversion.data.opcodeNameToValue
import codes.som.anthony.aksara.assembler.parser.AksaraParser
import codes.som.anthony.aksara.ast.ImportDeclaration
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*

// TODO: Jump instructions, switch instructions, newarray, type-receiving instructions
fun AksaraParser.InstructionsContext.toAST(imports: List<ImportDeclaration>): Pair<InsnList, List<TryCatchBlockNode>> {
    val instructions = InsnList()
    val tryCatchBlocks = mutableListOf<TryCatchBlockNode>()

    for (insn in instruction()) {
        if (insn.SimpleInstruction() != null) {
            instructions.add(convertSimpleInstruction(insn.SimpleInstruction().text))
        }

        if (insn.ImmediateIntPushInstruction() != null) {
            val mnemonic = insn.ImmediateIntPushInstruction().text
            val operand = insn.intLiteral(0).toAST()

            instructions.add(convertImmediateIntPushInstruction(mnemonic, operand))
        }

        if (insn.FieldAccessInstruction() != null) {
            val mnemonic = insn.FieldAccessInstruction().text
            val owner = insn.type(0).toAST(imports)
            val name = insn.identifier().toAST()
            val returnType = insn.type(1).toAST(imports)

            instructions.add(convertFieldAccessInstruction(mnemonic, owner, name, returnType))
        }

        if (insn.MethodInvocationInstruction() != null) {
            val mnemonic = insn.MethodInvocationInstruction().text
            val owner = insn.type(0).toAST(imports)
            val name = insn.identifier().toAST()
            val (returnType, parameterTypes) = insn.methodSignature().toAST(imports)

            instructions.add(convertMethodInvocationInstruction(mnemonic, owner, name, returnType, parameterTypes))
        }

        if (insn.LoadConstantInstruction() != null) {
            val literal = insn.literal().toAST(imports).to()
            instructions.add(convertLoadConstantInstruction(literal))
        }

        if (insn.LocalVariableAccessInstruction() != null) {
            val mnemonic = insn.LocalVariableAccessInstruction().text
            val slot = insn.intLiteral(0).toAST()

            instructions.add(convertLocalVariableAccessInstruction(mnemonic, slot))
        }

        if (insn.IincInstruction() != null) {
            val operands = insn.intLiteral()

            instructions.add(convertIincInstruction(operands[0]!!.toAST(), operands[1]?.toAST() ?: 1))
        }

        if (insn.TypeReceivingInstruction() != null) {
            val mnemonic = insn.TypeReceivingInstruction().text
            val type = insn.type(0).toAST(imports)

            instructions.add(convertTypeReceivingInstruction(mnemonic, type))
        }
    }

    return Pair(instructions, tryCatchBlocks)
}


private fun convertSimpleInstruction(mnemonic: String): AbstractInsnNode {
    val opcode = opcodeNameToValue[mnemonic] ?: error("Unknown opcode: $mnemonic")
    return InsnNode(opcode)
}

private fun convertImmediateIntPushInstruction(mnemonic: String, operand: Int): AbstractInsnNode {
    val opcode = opcodeNameToValue[mnemonic] ?: error("Unknown opcode: $mnemonic")
    return IntInsnNode(opcode, operand)
}

private fun convertFieldAccessInstruction(mnemonic: String, owner: Type, name: String, returnType: Type): AbstractInsnNode {
    val opcode = opcodeNameToValue[mnemonic] ?: error("Unknown opcode: $mnemonic")
    return FieldInsnNode(opcode, owner.internalName, name, returnType.descriptor)
}

private fun convertMethodInvocationInstruction(mnemonic: String, owner: Type, name: String, returnType: Type, parameterTypes: Array<Type>): AbstractInsnNode {
    val opcode = opcodeNameToValue[mnemonic] ?: error("Unknown opcode: $mnemonic")
    return MethodInsnNode(opcode, owner.internalName, name, Type.getMethodDescriptor(returnType, *parameterTypes))
}

private fun convertLoadConstantInstruction(value: Any): AbstractInsnNode {
    return LdcInsnNode(value)
}

private fun convertLocalVariableAccessInstruction(mnemonic: String, slot: Int): AbstractInsnNode {
    val opcode = opcodeNameToValue[mnemonic] ?: error("Unknown opcode: $mnemonic")
    return VarInsnNode(opcode, slot)
}

private fun convertIincInstruction(slot: Int, incr: Int): AbstractInsnNode {
    return IincInsnNode(slot, incr)
}

private fun convertTypeReceivingInstruction(mnemonic: String, type: Type): AbstractInsnNode {
    val opcode = opcodeNameToValue[mnemonic] ?: error("Unknown opcode: $mnemonic")
    return TypeInsnNode(opcode, type.internalName)
}
