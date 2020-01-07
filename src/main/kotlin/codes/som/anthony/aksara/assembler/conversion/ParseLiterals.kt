package codes.som.anthony.aksara.assembler.conversion

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
        RealLiteral()?.text?.toFloat() ?:
        IntegerLiteral().text.toFloat()

fun DoubleLiteralContext.toAST() =
        RealLiteral()?.text?.toDouble() ?:
        IntegerLiteral().text.toDouble()

fun CharacterLiteralContext.toAST() =
        CharacterLiteral()?.text?.toCharArray()?.get(1) ?:
        EscapedCharacterLiteral().text.let { it.substring(1, it.length - 1) }
            .let { unescape(it).first() }

fun LiteralContext.toAST(imports: List<ImportDeclaration>): ConstantASTNode {
    return ConstantASTNode.from(
            stringLiteral()?.toAST() ?:
            intLiteral()?.toAST() ?:
            longLiteral()?.toAST() ?:
            floatLiteral()?.toAST() ?:
            doubleLiteral()?.toAST() ?:
            characterLiteral()?.toAST() ?:
            type().toAST(imports)
    )
}
