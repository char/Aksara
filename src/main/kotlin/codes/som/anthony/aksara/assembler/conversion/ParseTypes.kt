package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.AssemblyContext
import codes.som.anthony.aksara.assembler.parser.AksaraParser.TypeContext
import codes.som.anthony.aksara.ast.ImportDeclaration
import codes.som.anthony.aksara.ast.resolve
import org.objectweb.asm.Type

fun TypeContext.toAST(ctx: AssemblyContext): Type {
    val (imports, selfType) = ctx

    fun resolveIdentifier(identifier: String): Type {
        if (selfType != null && identifier == "self")
            return selfType

        return when (identifier) {
            "void" -> Type.VOID_TYPE
            "bool" -> Type.BOOLEAN_TYPE
            "char" -> Type.CHAR_TYPE
            "byte" -> Type.BYTE_TYPE
            "short" -> Type.SHORT_TYPE
            "int" -> Type.INT_TYPE
            "float" -> Type.FLOAT_TYPE
            "long" -> Type.LONG_TYPE
            "double" -> Type.DOUBLE_TYPE

            else -> imports.resolve(identifier)
                    ?: Type.getObjectType(identifier.replace('.', '/'))
        }
    }

    return identifier()?.toAST()?.let(::resolveIdentifier)
            ?: arrayIdentifier()?.let { Type.getType('[' + resolveIdentifier(it.identifier().text).descriptor) }
            ?: Type.getObjectType(lineStringLiteral().toAST().replace('.', '/'))
}
