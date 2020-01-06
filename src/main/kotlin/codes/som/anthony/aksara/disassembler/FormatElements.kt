package codes.som.anthony.aksara.disassembler

import codes.som.anthony.aksara.ast.ConstantASTNode
import codes.som.anthony.aksara.ast.ConstantASTNode.*
import codes.som.anthony.aksara.ast.AksaraASTProgram
import codes.som.anthony.aksara.disassembler.AccessContext.*
import org.objectweb.asm.Opcodes.*
import org.objectweb.asm.Type

enum class AccessContext {
    MODULE,
    CLASS,
    METHOD,
    FIELD
}

fun formatAccess(access: Int, accessContext: AccessContext): String {
    val accessFlags: Map<Int, String> = when (accessContext) {
        MODULE ->  mapOf(
                ACC_OPEN to "open",
                ACC_TRANSITIVE to "transitive",
                ACC_STATIC_PHASE to "static_phase",
                ACC_MANDATED to "mandated"
        )

        CLASS -> mapOf(
                ACC_PUBLIC to "public",
                ACC_PRIVATE to "private",
                ACC_PROTECTED to "protected",
                ACC_FINAL to "final",
                ACC_SUPER to "super",
                ACC_INTERFACE to "interface",
                ACC_ABSTRACT to "abstract",
                ACC_SYNTHETIC to "synthetic",
                ACC_ANNOTATION to "annotation",
                ACC_ENUM to "enum",
                ACC_MODULE to "module"
        )

        METHOD -> mapOf(
                ACC_PUBLIC to "public",
                ACC_PRIVATE to "private",
                ACC_PROTECTED to "protected",
                ACC_STATIC to "static",
                ACC_FINAL to "final",
                ACC_SYNCHRONIZED to "synchronized",
                ACC_BRIDGE to "bridge",
                ACC_VARARGS to "varargs",
                ACC_NATIVE to "native",
                ACC_ABSTRACT to "abstract",
                ACC_STRICT to "strict",
                ACC_SYNTHETIC to "synthetic"
        )

        FIELD -> mapOf(
                ACC_PUBLIC to "public",
                ACC_PRIVATE to "private",
                ACC_PROTECTED to "protected",
                ACC_STATIC to "static",
                ACC_FINAL to "final",
                ACC_VOLATILE to "volatile",
                ACC_TRANSIENT to "transient",
                ACC_SYNTHETIC to "synthetic",
                ACC_ENUM to "enum"
        )
    }

    return accessFlags
            .mapNotNull { (value, name) ->
                if ((access and value) != 0) name else null
            }
            .joinToString(" ")
}

fun formatType(prog: AksaraASTProgram, type: Type, useImports: Boolean = true): String {
    if (type.sort == Type.ARRAY)
        return formatType(prog, type.elementType, useImports) + "[]"

    if (type.sort == Type.OBJECT) {
        return (if (useImports) {
            prog.imports.firstOrNull { it.type == type }?.alias ?: type.internalName
        } else type.internalName).replace('/', '.')
    } else {
        return when (type) {
            Type.VOID_TYPE -> "void"
            Type.BOOLEAN_TYPE -> "bool"
            Type.CHAR_TYPE -> "char"
            Type.BYTE_TYPE -> "byte"
            Type.SHORT_TYPE -> "short"
            Type.INT_TYPE -> "int"
            Type.FLOAT_TYPE -> "float"
            Type.LONG_TYPE -> "long"
            Type.DOUBLE_TYPE -> "double"

            else -> error("Unknown type $type")
        }
    }
}

// TODO: Format integral values by base (bin, hex, dec) for best ratio of repeated digits
// TODO: Potentially format values using D/F.raw(integral)
fun formatConstant(prog: AksaraASTProgram, constant: ConstantASTNode): String {
    return when (constant) {
        is IntConstantASTNode -> constant.value.toString()

        is FloatConstantASTNode -> {
            when {
                constant.value.isNaN() -> "F.NaN"

                constant.value.isInfinite() && constant.value > 0 -> "F.Inf"
                constant.value.isInfinite() && constant.value < 0 -> "F.InfNeg"

                else -> constant.value.toString() + "F"
            }
        }

        is LongConstantASTNode -> constant.value.toString() + "L"

        is DoubleConstantASTNode -> {
            when {
                constant.value.isNaN() -> "D.NaN"

                constant.value.isInfinite() && constant.value > 0 -> "D.Inf"
                constant.value.isInfinite() && constant.value < 0 -> "D.InfNeg"

                else -> constant.value.toString()
            }
        }

        is StringConstantASTNode -> "\"${constant.value}\""
        is TypeConstantASTNode -> formatType(prog, constant.value)
        is HandleConstantASTNode -> TODO()
        is DynamicConstantASTNode -> TODO()
    }
}
