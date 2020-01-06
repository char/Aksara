package codes.som.anthony.aksara.disassembler

import codes.som.anthony.aksara.ast.AnnotatableElement
import codes.som.anthony.aksara.ast.AksaraASTProgram
import codes.som.anthony.aksara.ast.AnnotationASTNode
import codes.som.anthony.aksara.output.*
import codes.som.anthony.aksara.output.AnnotationElement.AnnotationType
import codes.som.anthony.aksara.output.AnnotationElement.AnnotationType.BINARY
import codes.som.anthony.aksara.output.AnnotationElement.AnnotationType.RUNTIME

fun writeAnnotation(prog: AksaraASTProgram, anno: AnnotationASTNode, annotationType: AnnotationType, output: Output) {
    output.begin(AnnotationElement(annotationType))
    output.write("@")
    output.writeType(prog, anno.type)
    output.write("(")
    output.write(KeywordElement.BinaryAnnotation, when (annotationType) {
        BINARY -> "BINARY"
        RUNTIME -> "RUNTIME"
    })

    for ((name, cst) in anno.args) {
        output.write(", ")
        output.write(name)
        output.write("=")
        output.write(ConstantElement.from(cst), formatConstant(prog, cst))
    }
    output.write(")")
    output.end()
}

fun writeAnnotations(prog: AksaraASTProgram, elem: AnnotatableElement, output: Output) {
    for (anno in elem.binaryAnnotations)
        writeAnnotation(prog, anno, BINARY, output)

    for (anno in elem.runtimeAnnotations)
        writeAnnotation(prog, anno, RUNTIME, output)
}

fun writeAST(prog: AksaraASTProgram, output: Output) {
    @Suppress("NAME_SHADOWING")
    val output = IndentedOutput(output)

    for (import in prog.imports) {
        output.write(KeywordElement.Import, "import")
        output.write(" ")
        output.write(TypeElement(import.type), formatType(prog, import.type, useImports = false))
        output.write("\n")
    }

    if (prog.imports.isNotEmpty())
        output.write("\n")

    for (classNode in prog.classes) {
        output.begin(ClassElement)
        writeAnnotations(prog, classNode, output)
        output.write(AccessElement, formatAccess(classNode.access, AccessContext.CLASS))
        output.write(" ")
        output.writeType(prog, classNode.type)
        output.write(" {")
        output.indentLevel += 4

        for (fieldNode in classNode.fields) {
            output.write("\n")
            output.begin(FieldElement)
            output.write(AccessElement, formatAccess(fieldNode.access, AccessContext.FIELD))
            output.write(" ")
            output.write(IdentifierElement, fieldNode.name)
            output.write(" ")
            output.writeType(prog, fieldNode.type)
            output.end()
        }

        for (methodNode in classNode.methods) {
            output.write("\n")

            output.begin(MethodElement)
            output.begin(MethodSignature)
            output.write(AccessElement, formatAccess(methodNode.access, AccessContext.METHOD))
            output.write(" ")
            output.write(IdentifierElement, methodNode.name)
            output.write(" ")
            output.writeType(prog, methodNode.returnType)

            if (methodNode.parameterTypes.isNotEmpty()) {
                output.write("(")
                for ((index, type) in methodNode.parameterTypes.withIndex()) {
                    if (index != 0) output.write(", ")
                    output.writeType(prog, type)
                }
                output.write(")")
            }

            output.end()

            if (methodNode.code != null) {
                output.write(" {\n")
                output.indentLevel += 4

                disassembleCode(prog, methodNode, output)

                output.indentLevel -= 4
                output.write("}")
            }

            output.end()
            output.write("\n")
        }

        output.indentLevel -= 4
        output.write("}")
        output.write("\n")
        output.end()
    }

    output.close()
}
