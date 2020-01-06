package codes.som.anthony.aksara.ast

import org.objectweb.asm.Type

class FieldASTNode(val access: Int, val name: String, val type: Type) : AnnotatableElement()
