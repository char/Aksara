package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.AssemblyContext
import codes.som.anthony.aksara.assembler.parser.AksaraParser.*
import codes.som.anthony.aksara.ast.ConstantASTNode
import codes.som.anthony.aksara.ast.ImportDeclaration

fun IdentifierContext.toAST(): String {
    return simpleIdentifier()?.joinToString(".") { it.text }
            ?: lineStringLiteral().toAST()
}

fun unescape(escapeSequence: String): String {
    TODO()
}

fun LineStringLiteralContext.toAST(): String {
    return lineStringContent().joinToString {
        it.LineStrText()?.text ?: unescape(it.LineStrEscapedChar().text)
    }
}

fun MultiLineStringLiteralContext.toAST(): String {
    return multiLineStringContent().joinToString {
        it.MultiLineStrText()?.text ?: unescape(it.MultiLineStrEscapedChar().text)
    }
}

fun StringLiteralContext.toAST(): String {
    return lineStringLiteral()?.toAST() ?: multiLineStringLiteral().toAST()
}

fun IntLiteralContext.toAST() =
        IntegerLiteral()?.text?.toInt() ?:
        HexLiteral()?.text?.drop("0x".length)?.toInt(16) ?:
        BinLiteral().text.drop("0b".length).toInt(2)

fun LongLiteralContext.toAST(): Long =
        IntegerLiteral()?.text?.toLong() ?:
        HexLiteral()?.text?.drop("0x".length)?.toLong(16) ?:
        BinLiteral().text.drop("0b".length).toLong(2)

fun FloatLiteralContext.toAST() =
        Identifier()?.let { identifier ->
            when (identifier.text.toLowerCase()) {
                "inf" -> Float.POSITIVE_INFINITY
                "neginf" -> Float.NEGATIVE_INFINITY
                "nan" -> Float.NaN
                "max" -> Float.MAX_VALUE
                "min" -> Float.MIN_VALUE
                else -> error("Unknown special float literal value '${identifier.text}'")
            }
        } ?:
        RealLiteral()?.text?.toFloat() ?:
        IntegerLiteral().text.toFloat()

fun DoubleLiteralContext.toAST() =
        Identifier()?.let { identifier ->
            when (identifier.text.toLowerCase()) {
                "inf" -> Double.POSITIVE_INFINITY
                "neginf" -> Double.NEGATIVE_INFINITY
                "nan" -> Double.NaN
                "max" -> Double.MAX_VALUE
                "min" -> Double.MIN_VALUE
                else -> error("Unknown special double literal value '${identifier.text}'")
            }
        } ?:
        RealLiteral()?.text?.toDouble() ?:
        IntegerLiteral().text.toDouble()

fun CharacterLiteralContext.toAST() =
        CharacterLiteral()?.text?.toCharArray()?.get(1) ?:
        EscapedCharacterLiteral().text.let { it.substring(1, it.length - 1) }
            .let { unescape(it).first() }

fun LiteralContext.toAST(ctx: AssemblyContext): ConstantASTNode {
    return ConstantASTNode.from(
            stringLiteral()?.toAST() ?:
            intLiteral()?.toAST() ?:
            longLiteral()?.toAST() ?:
            floatLiteral()?.toAST() ?:
            doubleLiteral()?.toAST() ?:
            characterLiteral()?.toAST() ?:
            type().toAST(ctx)
    )
}
