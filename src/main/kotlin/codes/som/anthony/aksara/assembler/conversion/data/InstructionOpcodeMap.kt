package codes.som.anthony.aksara.assembler.conversion.data

import org.objectweb.asm.Opcodes.*

fun constantInsns() = arrayOf(
    "aconst_null" to ACONST_NULL,
    "iconst_m1" to ICONST_M1,
    "iconst_0" to ICONST_0,
    "iconst_1" to ICONST_1,
    "iconst_2" to ICONST_2,
    "iconst_3" to ICONST_3,
    "iconst_4" to ICONST_4,
    "iconst_5" to ICONST_5,
    "lconst_0" to LCONST_0,
    "lconst_1" to LCONST_1,
    "fconst_0" to FCONST_0,
    "fconst_1" to FCONST_1,
    "fconst_2" to FCONST_2,
    "dconst_0" to DCONST_0,
    "dconst_1" to DCONST_1
)

fun immediateIntPushInsns() = arrayOf(
    "bipush" to BIPUSH,
    "sipush" to SIPUSH
)

fun arrayLoadInsns() = arrayOf(
    "iaload" to IALOAD,
    "laload" to LALOAD,
    "faload" to FALOAD,
    "daload" to DALOAD,
    "aaload" to AALOAD,
    "baload" to BALOAD,
    "caload" to CALOAD,
    "saload" to SALOAD
)

fun arrayStoreInsns() = arrayOf(
    "iastore" to IASTORE,
    "lastore" to LASTORE,
    "fastore" to FASTORE,
    "dastore" to DASTORE,
    "aastore" to AASTORE,
    "bastore" to BASTORE,
    "castore" to CASTORE,
    "sastore" to SASTORE
)

fun stackManipulationInsns() = arrayOf(
    "pop" to POP,
    "pop2" to POP2,
    "dup" to DUP,
    "dup_x1" to DUP_X1,
    "dup_x2" to DUP_X2,
    "dup2" to DUP2,
    "dup2_x1" to DUP2_X1,
    "dup2_x2" to DUP2_X2,
    "swap" to SWAP
)

fun arithmeticInsns() = arrayOf(
    "iadd" to IADD,
    "ladd" to LADD,
    "fadd" to FADD,
    "dadd" to DADD,
    "isub" to ISUB,
    "lsub" to LSUB,
    "fsub" to FSUB,
    "dsub" to DSUB,
    "imul" to IMUL,
    "lmul" to LMUL,
    "fmul" to FMUL,
    "dmul" to DMUL,
    "idiv" to IDIV,
    "ldiv" to LDIV,
    "fdiv" to FDIV,
    "ddiv" to DDIV,
    "irem" to IREM,
    "lrem" to LREM,
    "frem" to FREM,
    "drem" to DREM,
    "ineg" to INEG,
    "lneg" to LNEG,
    "fneg" to FNEG,
    "dneg" to DNEG,
    "ishl" to ISHL,
    "lshl" to LSHL,
    "ishr" to ISHR,
    "lshr" to LSHR,
    "iushr" to IUSHR,
    "lushr" to LUSHR,
    "iand" to IAND,
    "land" to LAND,
    "ior" to IOR,
    "lor" to LOR,
    "ixor" to IXOR,
    "lxor" to LXOR
)

fun conversionInsns() = arrayOf(
    "i2l" to I2L,
    "i2f" to I2F,
    "i2d" to I2D,
    "l2i" to L2I,
    "l2f" to L2F,
    "l2d" to L2D,
    "f2i" to F2I,
    "f2l" to F2L,
    "f2d" to F2D,
    "d2i" to D2I,
    "d2l" to D2L,
    "d2f" to D2F,
    "i2b" to I2B,
    "i2c" to I2C,
    "i2s" to I2S
)

fun returnInsns() = arrayOf(
    "ireturn" to IRETURN,
    "lreturn" to LRETURN,
    "freturn" to FRETURN,
    "dreturn" to DRETURN,
    "areturn" to ARETURN,
    "return" to RETURN
)

fun comparisonInsns() = arrayOf(
    "lcmp" to LCMP,
    "fcmpl" to FCMPL,
    "dcmpl" to DCMPL,
    "dcmpg" to DCMPG
)

fun fieldAccessInsns() = arrayOf(
    "getstatic" to GETSTATIC,
    "putstatic" to PUTSTATIC,
    "getfield" to GETFIELD,
    "putfield" to PUTFIELD
)

fun methodInvocationInsns() = arrayOf(
    "invokestatic" to INVOKESTATIC,
    "invokespecial" to INVOKESPECIAL,
    "invokevirtual" to INVOKEVIRTUAL,
    "invokeinterface" to INVOKEINTERFACE
)

fun loadConstantInsns() = arrayOf(
    "ldc" to LDC,
    "ldc_w" to LDC,
    "ldc2_w" to LDC
)

fun localVariableAccessInsns() = arrayOf(
    "iload" to ILOAD,
    "lload" to LLOAD,
    "fload" to FLOAD,
    "dload" to DLOAD,
    "aload" to ALOAD,
    "istore" to ISTORE,
    "lstore" to LSTORE,
    "fstore" to FSTORE,
    "dstore" to DSTORE,
    "astore" to ASTORE
)

fun jumpInsns() = arrayOf(
    "ifeq" to IFEQ,
    "ifne" to IFNE,
    "iflt" to IFLT,
    "ifge" to IFGE,
    "ifgt" to IFGT,
    "ifle" to IFLE,
    "if_icmpeq" to IF_ICMPEQ,
    "if_icmpne" to IF_ICMPNE,
    "if_icmplt" to IF_ICMPLT,
    "if_icmpge" to IF_ICMPGE,
    "if_icmpgt" to IF_ICMPGT,
    "if_icmple" to IF_ICMPLE,
    "if_acmpeq" to IF_ACMPEQ,
    "if_acmpne" to IF_ACMPNE,
    "goto" to GOTO,
    "jsr" to JSR,
    "ifnull" to IFNULL,
    "ifnonnull" to IFNONNULL
)

fun typeInsns() = arrayOf(
    "new" to NEW,
    "anewarray" to ANEWARRAY,
    "checkcast" to CHECKCAST,
    "instanceof" to INSTANCEOF
)

val opcodeNameToValue = mutableMapOf(
    "nop" to NOP,
    *constantInsns(),
    *immediateIntPushInsns(),
    *arrayLoadInsns(),
    *arrayStoreInsns(),
    *stackManipulationInsns(),
    *arithmeticInsns(),
    *conversionInsns(),
    *returnInsns(),
    *comparisonInsns(),
    *fieldAccessInsns(),
    *methodInvocationInsns(),
    *loadConstantInsns(),
    *localVariableAccessInsns(),
    *jumpInsns(),
    "iinc" to IINC,
    *typeInsns()
)
