package codes.som.anthony.aksara.disassembler

import codes.som.anthony.aksara.ast.AksaraASTProgram
import codes.som.anthony.aksara.ast.ClassASTNode
import codes.som.anthony.aksara.ast.FieldASTNode
import codes.som.anthony.aksara.ast.MethodASTNode
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode

fun disassembleClassNode(node: ClassNode): AksaraASTProgram {
    val prog = AksaraASTProgram()
    val referencedTypes = mutableListOf<Type>()

    val classASTNode = ClassASTNode(Type.getObjectType(node.name), node.access)
    classASTNode.fields.addAll(node.fields.map {
        FieldASTNode(it.access, it.name, Type.getType(it.desc))
    })

    classASTNode.methods.addAll(node.methods.map {
        MethodASTNode(it.access, it.name, Type.getReturnType(it.desc), Type.getArgumentTypes(it.desc)).apply {
            code = it.instructions
            tryCatchBlocks = it.tryCatchBlocks
        }
    })

    prog.classes.add(classASTNode)

    return prog
}
