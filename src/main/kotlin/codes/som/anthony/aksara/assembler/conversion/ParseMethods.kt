package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.parser.AksaraParser.*
import codes.som.anthony.aksara.ast.ImportDeclaration
import codes.som.anthony.aksara.ast.MethodASTNode
import org.objectweb.asm.Type
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.TryCatchBlockNode

fun MethodSignatureContext.toAST(imports: List<ImportDeclaration>): Pair<Type, Array<Type>> {
    val returnType = type(0).toAST(imports)
    val parameterTypes = type().drop(1).map { it.toAST(imports) }.toTypedArray()
    return Pair(returnType, parameterTypes)
}

fun MethodDeclarationContext.toAST(imports: List<ImportDeclaration>): MethodASTNode {
    val access = modifierList().toAST()
    val name = identifier().toAST()
    val (returnType, parameterTypes) = methodSignature().toAST(imports)

    return MethodASTNode(access, name, returnType, parameterTypes).apply {
        val (code, tryCatchBlocks) = methodBody().toAST()
        this.code = code
        this.tryCatchBlocks.addAll(tryCatchBlocks)
    }
}

fun MethodBodyContext.toAST(): Pair<InsnList, List<TryCatchBlockNode>> {
    TODO()
}
