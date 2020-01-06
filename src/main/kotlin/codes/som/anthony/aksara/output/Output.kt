package codes.som.anthony.aksara.output

import codes.som.anthony.aksara.ast.AksaraASTProgram
import codes.som.anthony.aksara.disassembler.formatType
import org.objectweb.asm.Type

interface Output {
    fun begin(elem: OutputElement) {}
    fun end() {}

    fun write(content: String)
    fun close()
}

fun Output.write(elem: OutputElement, content: String) {
    begin(elem)
    write(content)
    end()
}

fun Output.writeType(prog: AksaraASTProgram, type: Type) {
    write(TypeElement(type), formatType(prog, type))
}
