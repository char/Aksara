package codes.som.anthony.aksara.ast

import org.objectweb.asm.Type

enum class AnnotationType {
    BINARY,
    RUNTIME
}

class AnnotationASTNode(val type: Type, val annotationType: AnnotationType, val args: List<Pair<String, ConstantASTNode>>)
