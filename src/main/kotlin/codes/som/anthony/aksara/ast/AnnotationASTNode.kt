package codes.som.anthony.aksara.ast

import org.objectweb.asm.Type

class AnnotationASTNode(val type: Type, val args: Array<Pair<String, ConstantASTNode>>)
