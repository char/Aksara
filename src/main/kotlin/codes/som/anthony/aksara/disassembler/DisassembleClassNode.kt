package codes.som.anthony.aksara.disassembler

import codes.som.anthony.aksara.ast.*
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldInsnNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.TypeInsnNode

fun disassembleClassNode(node: ClassNode): AksaraASTProgram {
    val prog = AksaraASTProgram()

    val self = Type.getObjectType(node.name)
    val referencedTypes = mutableSetOf<Type>()

    fun Type.import(): Type {
        if (this.sort == Type.OBJECT && this != self)
            referencedTypes.add(this)

        return this
    }

    val classASTNode = ClassASTNode(self, node.access)
    classASTNode.fields.addAll(node.fields.map {
        FieldASTNode(it.access, it.name, Type.getType(it.desc).import())
    })

    classASTNode.methods.addAll(node.methods.map {
        MethodASTNode(it.access, it.name, Type.getReturnType(it.desc).import(), Type.getArgumentTypes(it.desc).map { it.import() }.toTypedArray()).apply {
            code = it.instructions

            for (insn in it.instructions) {
                when (insn) {
                    is TypeInsnNode -> {
                        Type.getObjectType(insn.desc).import()
                    }

                    is MethodInsnNode -> {
                        Type.getObjectType(insn.owner).import()

                        Type.getReturnType(insn.desc).import()
                        Type.getArgumentTypes(insn.desc).forEach { it.import() }
                    }

                    is FieldInsnNode -> {
                        Type.getType(insn.desc).import()
                    }
                }
            }

            tryCatchBlocks = it.tryCatchBlocks
        }
    })

    prog.classes.add(classASTNode)
    prog.imports.addAll(referencedTypes.sortedBy { it.descriptor }.map { ImportDeclaration(it) })

    return prog
}
