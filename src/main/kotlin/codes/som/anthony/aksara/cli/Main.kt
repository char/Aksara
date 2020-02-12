@file:JvmName("Main")
package codes.som.anthony.aksara.cli

import codes.som.anthony.aksara.assembler.assembleAST
import codes.som.anthony.aksara.assembler.conversion.toAST
import codes.som.anthony.aksara.assembler.parser.AksaraLexer
import codes.som.anthony.aksara.assembler.parser.AksaraParser
import codes.som.anthony.aksara.disassembler.disassembleClassNode
import codes.som.anthony.aksara.disassembler.writeAST
import codes.som.anthony.aksara.output.BasicOutput
import codes.som.anthony.aksara.output.Output
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.tree.ClassNode
import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: aksara.jar [FILE]")
        println(" To disassemble a class file:")
        println("  aksara.jar path/to/classfile.class")
        println(" To assemble an assembly file:")
        println("  aksara.jar path/to/assembly.aks")

        return
    }

    val path = Paths.get(args.first())
    if (!Files.exists(path)) {
        println("File does not exist.")
        return
    }

    if (path.toString().toLowerCase().endsWith(".aks")) {
        val lexer = AksaraLexer(CharStreams.fromPath(path))
        val parser = AksaraParser(CommonTokenStream(lexer))
        val prog = parser.aksaraFile().toAST()

        for (node in assembleAST(prog)) {
            val classBuffer = ClassWriter(ClassWriter.COMPUTE_FRAMES).let {
                node.accept(it)
                it.toByteArray()
            }

            val classPath = Paths.get("classes/${node.name}.class")
            Files.createDirectories(classPath.parent)
            Files.write(classPath, classBuffer)
        }
    } else if (path.toString().toLowerCase().endsWith(".class")) {
        val node = ClassNode()
        Files.newInputStream(Paths.get(args.first())).use {
            ClassReader(it).accept(node, 0)
        }

        val prog = disassembleClassNode(node)

        writeAST(prog, ColouredOutput(object : Output {
            override fun write(content: String) {
                print(content)
            }

            override fun close() {}
        }))
    } else error("Unsupported file type.")
}
