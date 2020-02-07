package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.AssemblyContext
import codes.som.anthony.aksara.assembler.parser.AksaraParser.*
import codes.som.anthony.aksara.ast.AnnotationASTNode
import codes.som.anthony.aksara.ast.AnnotationType
import codes.som.anthony.aksara.ast.ConstantASTNode
import codes.som.anthony.aksara.ast.ImportDeclaration

fun AnnotationTypeContext.toAST(): AnnotationType {
    return BINARY()?.let { AnnotationType.BINARY }
            ?: RUNTIME().let { AnnotationType.RUNTIME }
}

fun AnnotationContext.toAST(ctx: AssemblyContext): AnnotationASTNode {
    val type = type().toAST(ctx)
    val annotationType = annotationType().toAST()
    val args = annotationArgument().map { it.toAST(ctx) }

    return AnnotationASTNode(type, annotationType, args)
}

fun AnnotationArgumentContext.toAST(ctx: AssemblyContext): Pair<String, ConstantASTNode> {
    val name = identifier().toAST()
    val argument = literal().toAST(ctx)

    return Pair(name, argument)
}

