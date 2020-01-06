package codes.som.anthony.aksara.ast

import org.objectweb.asm.Type

private fun Type.simpleName(): String {
    return internalName.let { it.substring(internalName.lastIndexOf('/') + 1, it.length) }
}

fun Collection<ImportDeclaration>.resolve(identifier: String): Type? {
    return firstOrNull { it.alias == identifier }?.type
}

class ImportDeclaration(val type: Type, val alias: String = type.simpleName())
