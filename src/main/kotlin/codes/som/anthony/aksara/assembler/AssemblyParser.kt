package codes.som.anthony.aksara.assembler

import codes.som.anthony.aksara.assembler.conversion.toAST
import codes.som.anthony.aksara.assembler.parser.AksaraLexer
import codes.som.anthony.aksara.assembler.parser.AksaraParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val lexer = AksaraLexer(CharStreams.fromString("""
        import java.lang.String
        import java.io.PrintStream
        
        // Comment
        
        public com/example/HelloWorld {
            private static message : String
        
            public static <clinit> void()
            public static main void(String[])
        }
    """.trimIndent()))

    val parser = AksaraParser(CommonTokenStream(lexer))
    val file = parser.aksaraFile()
    val prog = file.toAST()
    println(prog)
}
