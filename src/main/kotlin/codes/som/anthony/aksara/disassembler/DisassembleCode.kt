package codes.som.anthony.aksara.disassembler

import codes.som.anthony.aksara.ast.AksaraASTProgram
import codes.som.anthony.aksara.ast.ConstantASTNode
import codes.som.anthony.aksara.ast.ConstantASTNode.IntConstantASTNode
import codes.som.anthony.aksara.ast.MethodASTNode
import codes.som.anthony.aksara.disassembler.data.opcodeNameMap
import codes.som.anthony.aksara.output.*
import org.objectweb.asm.Label
import org.objectweb.asm.Type
import org.objectweb.asm.tree.*

private fun disassembleLabel(prog: AksaraASTProgram, labels: List<Label>, label: Label, output: Output) {
    output.write(LabelElement, "L${labels.indexOf(label)}")
}

// TODO: We should probably escape quotes too
private fun formatIdentifier(prog: AksaraASTProgram, identifier: String): String {
    return if (" " in identifier) "\"${identifier}\"" else identifier
}

private fun disassembleInstruction(prog: AksaraASTProgram, labels: List<Label>, insn: AbstractInsnNode, output: IndentedOutput) {
    if (insn is LabelNode) {
        if (insn.label in labels) {
            output.indentLevel -= 2
            output.write("\n")
            disassembleLabel(prog, labels, insn.label, output)
            output.write(":\n")
            output.indentLevel += 2
        }

        return
    }

    if (insn is LineNumberNode || insn is FrameNode)
        return

    val opcodeName = opcodeNameMap[insn.opcode]

    output.begin(InstructionElement)

    if (opcodeName == null) {
        output.write("// unknown opcode ${insn.opcode}")
        return
    }

    output.write(OpcodeElement(insn.opcode), opcodeName)

    when (insn) {
        is InsnNode -> {}

        is VarInsnNode -> {
            output.write(" ")
            output.write(SlotElement(insn.`var`), insn.`var`.toString())
        }

        is LdcInsnNode -> {
            output.write(" ")

            val cst = ConstantASTNode.from(insn.cst)
            output.write(ConstantElement.from(cst), formatConstant(prog, cst))
        }

        is FieldInsnNode -> {
            output.write(" ")
            output.writeType(prog, Type.getObjectType(insn.owner))
            output.write(" ")
            output.write(IdentifierElement, formatIdentifier(prog, insn.name))
            output.write(" ")
            output.writeType(prog, Type.getType(insn.desc))
        }

        is MethodInsnNode -> {
            output.write(" ")
            output.writeType(prog, Type.getObjectType(insn.owner))
            output.write(" ")
            output.write(IdentifierElement, formatIdentifier(prog, insn.name))
            output.write(" ")
            output.writeType(prog, Type.getReturnType(insn.desc))
            output.write("(")
            for ((index, argType) in Type.getArgumentTypes(insn.desc).withIndex()) {
                if (index != 0)
                    output.write(", ")

                output.writeType(prog, argType)
            }
            output.write(")")
        }

        is JumpInsnNode -> {
            output.write(" ")
            disassembleLabel(prog, labels, insn.label.label, output)
        }

        is TypeInsnNode -> {
            output.write(" ")
            output.writeType(prog, Type.getObjectType(insn.desc))
        }

        is IincInsnNode -> {
            output.write(" ")
            val varCst = IntConstantASTNode(insn.`var`)
            output.write(ConstantElement.from(varCst), formatConstant(prog, varCst))
            if (insn.incr != 1) {
                output.write(" ")
                val incrCst = IntConstantASTNode(insn.incr)
                output.write(ConstantElement.from(incrCst), formatConstant(prog, incrCst))
            }
        }

        is TableSwitchInsnNode -> {
            output.write(" {\n")
            output.indentLevel += 4

            for ((i, label) in insn.labels.withIndex()) {
                if (label == insn.dflt)
                    continue

                val value = IntConstantASTNode(insn.min + i)
                output.write(ConstantElement.from(value), formatConstant(prog, value))
                output.write(": ")
                disassembleLabel(prog, labels, label.label, output)
                output.write("\n")
            }

            output.write(KeywordElement.Default, "default") // TODO: What kind of highlighting do we want here?
            output.write(": ")
            disassembleLabel(prog, labels, insn.dflt.label, output)
            output.write("\n")

            output.indentLevel -= 4
            output.write("}")
        }

        // TODO: LookupSwitch
        // TODO: InvokeDynamic

        is IntInsnNode -> {
            output.write(" ")
            val cst = IntConstantASTNode(insn.operand)
            output.write(ConstantElement.from(cst), formatConstant(prog, cst))
        }

        else -> output.write(" // <cannot disassemble>")
    }

    output.end()
    output.write("\n")
}

fun disassembleCode(prog: AksaraASTProgram, method: MethodASTNode, output: IndentedOutput) {
    val code = method.code ?: error("Method has no code!")
    val labels = mutableListOf<LabelNode>()
    fun addLabel(l: LabelNode) { if (!labels.contains(l)) labels.add(l) }

    for (insn in code) {
        if (insn is JumpInsnNode)
            addLabel(insn.label)

        if (insn is TableSwitchInsnNode) {
            insn.labels.forEach(::addLabel)
            addLabel(insn.dflt)
        }
    }

    method.tryCatchBlocks?.forEach { tcb ->
        addLabel(tcb.start)
        addLabel(tcb.end)
        addLabel(tcb.handler)
    }

    for (insn in code) {
        disassembleInstruction(prog, labels.sortedBy { code.indexOf(it) }.map { it.label }, insn, output)
    }
}
