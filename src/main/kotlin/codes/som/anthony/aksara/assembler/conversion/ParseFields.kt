package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.AssemblyContext
import codes.som.anthony.aksara.assembler.parser.AksaraParser.FieldDeclarationContext
import codes.som.anthony.aksara.ast.FieldASTNode
import codes.som.anthony.aksara.ast.ImportDeclaration

fun FieldDeclarationContext.toAST(ctx: AssemblyContext): FieldASTNode {
    val access = modifierList().toAST()
    val name = identifier().toAST()
    val type = type().toAST(ctx)

    return FieldASTNode(access, name, type).apply {
        annotationList()?.annotation()?.map { it.toAST(ctx) }?.let { annotations ->
            this.annotations.addAll(annotations)
        }
    }
}
