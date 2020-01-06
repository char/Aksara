package codes.som.anthony.aksara.ast

import org.objectweb.asm.ConstantDynamic
import org.objectweb.asm.Handle
import org.objectweb.asm.Type

sealed class ConstantASTNode {
    abstract fun to(): Any

    class IntConstantASTNode(val value: Int) : ConstantASTNode() {
        override fun to() = value
    }

    class FloatConstantASTNode(val value: Float) : ConstantASTNode() {
        override fun to() = value
    }

    class LongConstantASTNode(val value: Long) : ConstantASTNode() {
        override fun to() = value
    }

    class DoubleConstantASTNode(val value: Double) : ConstantASTNode() {
        override fun to() = value
    }

    class StringConstantASTNode(val value: String) : ConstantASTNode() {
        override fun to() = value
    }

    class TypeConstantASTNode(val value: Type) : ConstantASTNode() {
        override fun to() = value
    }

    class HandleConstantASTNode(val value: Handle) : ConstantASTNode() {
        override fun to() = value
    }

    class DynamicConstantASTNode(val value: ConstantDynamic) : ConstantASTNode() {
        override fun to() = value
    }

    companion object {
        fun from(cst: Any) =
            when (cst) {
                is Int -> IntConstantASTNode(cst)
                is Float -> FloatConstantASTNode(cst)
                is Long -> LongConstantASTNode(cst)
                is Double -> DoubleConstantASTNode(cst)
                is String -> StringConstantASTNode(cst)
                is Type -> TypeConstantASTNode(cst)
                is Handle -> HandleConstantASTNode(cst)
                is ConstantDynamic -> DynamicConstantASTNode(cst)

                else -> error("Unsupported constant type ${cst.javaClass}")
            }
    }
}
