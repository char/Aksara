package codes.som.anthony.aksara.assembler

import codes.som.anthony.aksara.assembler.conversion.toAST
import codes.som.anthony.aksara.assembler.parser.AksaraLexer
import codes.som.anthony.aksara.assembler.parser.AksaraParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.objectweb.asm.ClassWriter
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    val lexer = AksaraLexer(CharStreams.fromString("""
        import java.lang.System
        import java.io.PrintStream
        
        public com/example/HelloWorld {
            public static main void(String[]) {
                getstatic java/lang/System out java/lang/PrintStream
                ldc "Hello world!"
                invokevirtual java/lang/PrintStream println void(java/lang/String)
                return
            }
        }
    """.trimIndent()))

    val parser = AksaraParser(CommonTokenStream(lexer))
    val file = parser.aksaraFile()
    val prog = file.toAST()

    for (node in assembleAST(prog)) {
        val classBuffer = ClassWriter(ClassWriter.COMPUTE_FRAMES).let {
            node.accept(it)
            it.toByteArray()
        }

        val path = Paths.get("out/${node.name}.class")
        Files.createDirectories(path.parent)
        Files.write(path, classBuffer)
    }
}
