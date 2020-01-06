package codes.som.anthony.aksara.cli

import codes.som.anthony.aksara.output.*
import codes.som.anthony.aksara.output.ConstantElement.StringConstantElement
import org.objectweb.asm.Type
import java.util.*

class ColouredOutput(private val child: Output) : Output {
    val stack: Deque<OutputElement> = LinkedList()

    override fun begin(elem: OutputElement) {
        stack.push(elem)
        child.begin(elem)
    }

    override fun end() {
        stack.pop()
        write(Colours.RESET)
        child.end()
    }

    override fun write(content: String) {
        val elem: OutputElement? = stack.peek()
        if (elem != null) {
            when (elem) {
                is AccessElement -> child.write(Colours.GRAY)
                is KeywordElement, is OpcodeElement -> child.write(Colours.YELLOW)
                is StringConstantElement -> child.write(Colours.GREEN)
                is ConstantElement, is SlotElement -> child.write(Colours.BRIGHT_BLUE)
                is IdentifierElement -> child.write(Colours.PURPLE)
                is TypeElement -> {
                    if (elem.type.sort in Type.VOID .. Type.DOUBLE) {
                        child.write(Colours.BRIGHT_CYAN)
                    } else {
                        child.write(Colours.RESET)
                    }
                }
            }
        }

        child.write(content)
        child.write(Colours.RESET)
    }

    override fun close() {
        child.close()
    }
}
