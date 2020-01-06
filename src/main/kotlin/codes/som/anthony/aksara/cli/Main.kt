@file:JvmName("Main")
package codes.som.anthony.aksara.cli

import codes.som.anthony.aksara.disassembler.disassembleClassNode
import codes.som.anthony.aksara.disassembler.writeAST
import codes.som.anthony.aksara.output.BasicOutput
import codes.som.anthony.aksara.output.Output
import org.objectweb.asm.ClassReader
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

    val node = ClassNode()
    Files.newInputStream(Paths.get(args.first())).use {
        ClassReader(it).accept(node, 0)
    }

    val prog = disassembleClassNode(node)

    writeAST(prog, ColouredOutput(object: Output {
        override fun write(content: String) {
            print(content)
        }

        override fun close() {}
    }))
}
