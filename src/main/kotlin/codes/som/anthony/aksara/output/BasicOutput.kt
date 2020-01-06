package codes.som.anthony.aksara.output

import java.lang.StringBuilder

class BasicOutput : Output {
    private val sb = StringBuilder()
    private var _contents: String? = null
    val contents: String get() =
        _contents ?: throw IllegalStateException("Attempted to access BasicOutput's contents before output close()")

    override fun write(content: String) {
        sb.append(content)
    }

    override fun close() {
        _contents = sb.toString()
    }
}
