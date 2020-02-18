package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.AssemblyContext
import codes.som.anthony.aksara.assembler.conversion.data.opcodeNameToValue
import codes.som.anthony.aksara.assembler.parser.AksaraParser
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*

fun AksaraParser.InstructionsContext.toAST(ctx: AssemblyContext): Pair<InsnList, List<TryCatchBlockNode>> {
    val instructions = InsnList()
    val tryCatchBlocks = mutableListOf<TryCatchBlockNode>()

    for (insn in instruction()) {
        if (insn.SimpleInstruction() != null) {
            instructions.add(convertSimpleInstruction(insn.SimpleInstruction().text))
        }

        if (insn.ImmediateIntPushInstruction() != null) {
            val mnemonic = insn.ImmediateIntPushInstruction().text
            val operand = insn.intLiteral().toAST()

            instructions.add(convertImmediateIntPushInstruction(mnemonic, operand))
        }

        if (insn.FieldAccessInstruction() != null) {
            val mnemonic = insn.FieldAccessInstruction().text
            val owner = insn.type(0).toAST(ctx)
            val name = insn.identifier().toAST()
            val returnType = insn.type(1).toAST(ctx)

            instructions.add(convertFieldAccessInstruction(mnemonic, owner, name, returnType))
        }

        if (insn.MethodInvocationInstruction() != null) {
            val mnemonic = insn.MethodInvocationInstruction().text
            val owner = insn.type(0).toAST(ctx)
            val name = insn.identifier().toAST()
            val (returnType, parameterTypes) = insn.methodSignature().toAST(ctx)

            instructions.add(convertMethodInvocationInstruction(mnemonic, owner, name, returnType, parameterTypes))
        }

        if (insn.LoadConstantInstruction() != null) {
            val literal = insn.literal().toAST(ctx).to()
            instructions.add(convertLoadConstantInstruction(literal))
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
