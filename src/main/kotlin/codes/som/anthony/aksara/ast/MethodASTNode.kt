package codes.som.anthony.aksara.ast

import org.objectweb.asm.Type
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.TryCatchBlockNode

class MethodASTNode(val access: Int, val name: String, val returnType: Type, val parameterTypes: Array<Type>) : AnnotatableElement() {
    var code: InsnList? = null
    var tryCatchBlocks: MutableList<TryCatchBlockNode>? = null
}
