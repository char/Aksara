package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.parser.AksaraParser.IdentifierContext
import codes.som.anthony.aksara.assembler.parser.AksaraParser.LineStringLiteralContext

fun IdentifierContext.toAST(): String {
    return simpleIdentifier()?.joinToString(".") { it.text }
            ?: lineStringLiteral().toAST()
}

fun LineStringLiteralContext.toAST(): String {
    fun unescape(escapeSequence: String): String {
        TODO()
    }

    return lineStringContent().joinToString {
        it.LineStrText()?.text ?: unescape(it.LineStrEscapedChar().text)
    }
}
