package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.parser.AksaraParser.*
import codes.som.anthony.aksara.ast.AnnotationASTNode
import codes.som.anthony.aksara.ast.AnnotationType
import codes.som.anthony.aksara.ast.ConstantASTNode
import codes.som.anthony.aksara.ast.ImportDeclaration

fun AnnotationTypeContext.toAST(): AnnotationType {
    return BINARY()?.let { AnnotationType.BINARY }
            ?: RUNTIME().let { AnnotationType.RUNTIME }
}

fun AnnotationContext.toAST(imports: List<ImportDeclaration>): AnnotationASTNode {
    val type = type().toAST(imports)
    val annotationType = annotationType().toAST()
    val args = annotationArgument().map { it.toAST(imports) }

    return AnnotationASTNode(type, annotationType, args)
}

fun AnnotationArgumentContext.toAST(imports: List<ImportDeclaration>): Pair<String, ConstantASTNode> {
    val name = identifier().toAST()
    val argument = literal().toAST(imports)

    return Pair(name, argument)
}

