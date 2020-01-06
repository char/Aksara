package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.parser.AksaraParser.ModifierListContext
import org.objectweb.asm.Opcodes.*

val accessMap = mapOf(
        "public" to ACC_PUBLIC,
        "private" to ACC_PRIVATE,
        "protected" to ACC_PROTECTED,
        "static" to ACC_STATIC,
        "final" to ACC_FINAL,
        "super" to ACC_SUPER,
        "synchronized" to ACC_SYNCHRONIZED,
        "open" to ACC_OPEN,
        "transitive" to ACC_TRANSITIVE,
        "volatile" to ACC_VOLATILE,
        "bridge" to ACC_BRIDGE,
        "static_phase" to ACC_STATIC_PHASE,
        "varargs" to ACC_VARARGS,
        "transient" to ACC_TRANSIENT,
        "native" to ACC_NATIVE,
        "interface" to ACC_INTERFACE,
        "abstract" to ACC_ABSTRACT,
        "strict" to ACC_STRICT,
        "synthetic" to ACC_SYNTHETIC,
        "annotation" to ACC_ANNOTATION,
        "enum" to ACC_ENUM,
        "mandated" to ACC_MANDATED,
        "module" to ACC_MODULE
)

fun ModifierListContext.toAST(): Int {
    var access = 0

    for (modifier in modifier()) {
        access = access or accessMap.getValue(modifier.text)
    }

    return access
}
