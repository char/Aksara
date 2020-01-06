package codes.som.anthony.aksara.output

class IndentedOutput(val child: Output) : Output by child {
    private var currentLineCol = 0
    var indentLevel = 0

    override fun write(content: String) {
        if (currentLineCol == 0) {
            currentLineCol += indentLevel
            child.write(IndentationElement, " ".repeat(indentLevel))
        }

        child.write(content)

        if (content.contains('\n')) {
            currentLineCol = content.lastIndex - content.lastIndexOf('\n')
        } else {
            currentLineCol += content.length
        }
    }
}
