package codes.som.anthony.aksara.assembler

import codes.som.anthony.aksara.ast.AnnotationASTNode
import codes.som.anthony.aksara.ast.ConstantASTNode.*
import codes.som.anthony.aksara.ast.AksaraASTProgram
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FieldNode
import org.objectweb.asm.tree.MethodNode

fun convertAnnotations(annos: List<AnnotationASTNode>) =
    annos.map {
        AnnotationNode(it.type.descriptor).apply {
            values = it.args.flatMap { (name, cst) ->
                listOf(name, when (cst) {
                    is IntConstantASTNode -> cst.value
                    is FloatConstantASTNode -> cst.value
                    is LongConstantASTNode -> cst.value
                    is DoubleConstantASTNode -> cst.value
                    is StringConstantASTNode -> cst.value
                    is TypeConstantASTNode -> cst.value
                    is HandleConstantASTNode -> cst.value
                    is DynamicConstantASTNode -> cst.value
                })
            }
        }
    }

fun assembleAST(prog: AksaraASTProgram): List<ClassNode> {
    val classes = mutableListOf<ClassNode>()

    for (progClass in prog.classes) {
        val node = ClassNode()

        node.access = progClass.access
        node.name = progClass.type.internalName

        node.invisibleAnnotations = convertAnnotations(progClass.binaryAnnotations)
        node.visibleAnnotations = convertAnnotations(progClass.runtimeAnnotations)

        node.fields = progClass.fields.map {
            FieldNode(it.access, it.name, it.type.descriptor, null, null).apply {
                invisibleAnnotations = convertAnnotations(it.binaryAnnotations)
                visibleAnnotations = convertAnnotations(it.runtimeAnnotations)
            }
        }

        node.methods = progClass.methods.map {
            MethodNode(it.access, it.name, Type.getMethodDescriptor(it.returnType, *it.parameterTypes), null, null).apply {
                invisibleAnnotations = convertAnnotations(it.binaryAnnotations)
                visibleAnnotations = convertAnnotations(it.runtimeAnnotations)

                instructions = it.code
                tryCatchBlocks = it.tryCatchBlocks
            }
        }

        classes.add(node)
    }

    return classes
}
