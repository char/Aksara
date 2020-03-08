package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.AssemblyContext
import codes.som.anthony.aksara.assembler.parser.AksaraParser.*
import codes.som.anthony.aksara.ast.ImportDeclaration
import codes.som.anthony.aksara.ast.MethodASTNode
import org.objectweb.asm.Type
import org.objectweb.asm.tree.InsnList
import org.objectweb.asm.tree.TryCatchBlockNode

fun MethodSignatureContext.toAST(ctx: AssemblyContext): Pair<Type, Array<Type>> {
    val returnType = type(0).toAST(ctx)
    val parameterTypes = type().drop(1).map { it.toAST(ctx) }.toTypedArray()
    return Pair(returnType, parameterTypes)
}

fun MethodDeclarationContext.toAST(ctx: AssemblyContext): MethodASTNode {
    val access = modifierList().toAST()
    val name = identifier().toAST()
    val (returnType, parameterTypes) = methodSignature().toAST(ctx)

    return MethodASTNode(access, name, returnType, parameterTypes).apply {
        annotationList()?.annotation()?.map { it.toAST(ctx) }?.let { annotations ->
            this.annotations.addAll(annotations)
        }

        methodBody()?.toAST(ctx)?.let { (code, tryCatchBlocks) ->
            this.code = code
            this.tryCatchBlocks.addAll(tryCatchBlocks)
        }
    }
}

fun MethodBodyContext.toAST(ctx: AssemblyContext): Pair<InsnList, List<TryCatchBlockNode>> {
    return block().toAST(ctx)
}
