package codes.som.anthony.aksara.ast

import org.objectweb.asm.Type

class ClassASTNode(val type: Type, val access: Int) : AnnotatableElement() {
    val fields = mutableListOf<FieldASTNode>()
    val methods = mutableListOf<MethodASTNode>()
}
