package codes.som.anthony.aksara.ast

abstract class AnnotatableElement {
    val runtimeAnnotations = mutableListOf<AnnotationASTNode>()
    val binaryAnnotations = mutableListOf<AnnotationASTNode>()
}
