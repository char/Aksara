package codes.som.anthony.aksara.output

import codes.som.anthony.aksara.ast.AnnotationType
import codes.som.anthony.aksara.ast.ConstantASTNode
import codes.som.anthony.aksara.ast.ConstantASTNode.*
import org.objectweb.asm.Type

sealed class OutputElement

object IndentationElement : OutputElement()
class TypeElement(val type: Type) : OutputElement()

object AccessElement : OutputElement()

object ClassElement : OutputElement()
object MethodElement : OutputElement()
object MethodSignature : OutputElement()
object FieldElement: OutputElement()

class AnnotationElement(val annotationType: AnnotationType) : OutputElement()

sealed class KeywordElement : OutputElement() {
    object Import : KeywordElement()
    object BinaryAnnotation : KeywordElement()
    object RuntimeAnnotation : KeywordElement()
}

object InstructionElement : OutputElement()
class OpcodeElement(val opcode: Int) : OutputElement()
class SlotElement(val slot: Int) : OutputElement()

object IdentifierElement : OutputElement()

sealed class ConstantElement : OutputElement() {
    // TODO: We should probably pass values
    object IntConstantElement : ConstantElement()
    object FloatConstantElement : ConstantElement()
    object LongConstantElement : ConstantElement()
    object DoubleConstantElement : ConstantElement()
    object StringConstantElement : ConstantElement()
    object TypeConstantElement : ConstantElement()
    object HandleConstantElement : ConstantElement()
    object DynamicConstantElement : ConstantElement()

    companion object {
        fun from(node: ConstantASTNode): ConstantElement = when (node) {
            is IntConstantASTNode -> IntConstantElement
            is FloatConstantASTNode -> FloatConstantElement
            is LongConstantASTNode -> LongConstantElement
            is DoubleConstantASTNode -> DoubleConstantElement
            is StringConstantASTNode -> StringConstantElement
            is TypeConstantASTNode -> TypeConstantElement
            is HandleConstantASTNode -> HandleConstantElement
            is DynamicConstantASTNode -> DynamicConstantElement
        }
    }
}
