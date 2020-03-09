package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.AssemblyContext
import codes.som.anthony.aksara.assembler.conversion.data.opcodeNameToValue
import codes.som.anthony.aksara.assembler.parser.AksaraParser
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*

// TODO: Switch instructions, invokedynamic, CONSTANT_Dynamic
fun AksaraParser.BlockContext.toAST(ctx: AssemblyContext): Pair<InsnList, List<TryCatchBlockNode>> {
    val instructions = InsnList()
    val tryCatchBlocks = mutableListOf<TryCatchBlockNode>()

    val labels = mutableMapOf<String, LabelNode>()

    // First, do a pass to define all the labels
    for (statement in statement()) {
        if (statement.label() != null) {
            val name = statement.label().identifier().toAST()
            labels[name] = LabelNode()
        }
    }

    for (statement in statement()) {
        statement.label()?.let { label ->
            val name = label.identifier().toAST()
            assert(name in labels)
            instructions.add(labels.getValue(name))
        }

        statement.instruction()?.let { insn ->
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

            if (insn.LocalVariableAccessInstruction() != null) {
                val mnemonic = insn.LocalVariableAccessInstruction().text
                val slot = insn.intLiteral(0).toAST()
                instructions.add(convertLocalVariableAccessInstruction(mnemonic, slot))
            }

            if (insn.JumpInstruction() != null) {
                val mnemonic = insn.JumpInstruction().text
                val labelName = insn.identifier().toAST()
                val label = labels[labelName] ?: error("Label '$labelName' is not defined in this block")
                instructions.add(convertJumpInstruction(mnemonic, label))
            }

            if (insn.IntIncrementInstruction() != null) {
                val slot = insn.intLiteral(0).toAST()
                val value = insn.intLiteral(1)?.toAST() ?: 1
                instructions.add(IincInsnNode(slot, value))
            }

            if (insn.TypeInstruction() != null) {
                val mnemonic = insn.TypeInstruction().text
                val type = insn.type(0).toAST(ctx)
                instructions.add(convertTypeInstruction(mnemonic, type))
            }

            if (insn.TableSwitchInstruction() != null) {
                val (default, matchLabels) = insn.switchLabel().toAST(labels)

                instructions.add(convertTableSwitchInstruction(default, matchLabels))
            }
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

private fun convertJumpInstruction(mnemonic: String, label: LabelNode): AbstractInsnNode {
    val opcode = opcodeNameToValue[mnemonic] ?: error("Unknown opcode: $mnemonic")
    return JumpInsnNode(opcode, label)
}

private fun convertTypeInstruction(mnemonic: String, type: Type): AbstractInsnNode {
    val opcode = opcodeNameToValue[mnemonic] ?: error("Unknown opcode: $mnemonic")
    return TypeInsnNode(opcode, type.internalName)
}

private fun convertTableSwitchInstruction(default: LabelNode, matches: Map<Int, LabelNode>): AbstractInsnNode {
    val min = matches.keys.min() ?: error("Could not calculate minimum for tableswitch instruction")
    val max = matches.keys.max() ?: error("Could not calculate maximum for tableswitch instruction")

    val sequentialLabels = (min .. max).map {
        matches[it] ?: default
    }.toTypedArray()

    return TableSwitchInsnNode(min, max, default, *sequentialLabels)
}
