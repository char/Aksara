package codes.som.anthony.aksara.ast

abstract class AnnotatableElement {
    val annotations = mutableListOf<AnnotationASTNode>()

    val binaryAnnotations
        get() = annotations.filter { it.annotationType == AnnotationType.BINARY }

    val runtimeAnnotations
        get() = annotations.filter { it.annotationType == AnnotationType.RUNTIME }
}
