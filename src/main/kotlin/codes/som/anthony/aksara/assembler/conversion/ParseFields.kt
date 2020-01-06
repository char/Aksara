package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.parser.AksaraParser.FieldDeclarationContext
import codes.som.anthony.aksara.ast.FieldASTNode
import codes.som.anthony.aksara.ast.ImportDeclaration

fun FieldDeclarationContext.toAST(imports: List<ImportDeclaration>): FieldASTNode {
    val access = modifierList().toAST()
    val name = identifier().toAST()
    val type = type().toAST(imports)

    return FieldASTNode(access, name, type)
}
