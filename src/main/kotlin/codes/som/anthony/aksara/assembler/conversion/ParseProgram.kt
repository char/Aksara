package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.parser.AksaraParser.*
import codes.som.anthony.aksara.ast.*
import org.objectweb.asm.Type

fun AksaraFileContext.toAST(): AksaraASTProgram {
    val prog = AksaraASTProgram()

    prog.imports.addAll(importList().toAST())
    prog.classes.addAll(classDeclarations().toAST(prog.imports))

    return prog
}

fun ImportListContext.toAST(): List<ImportDeclaration> {
    val imports = mutableListOf<ImportDeclaration>()

    for (child in children) {
        if (child !is ImportHeaderContext)
            continue

        imports.add(ImportDeclaration(Type.getObjectType(child.identifier().toAST().replace('.', '/'))))
    }

    return imports
}

fun ClassDeclarationsContext.toAST(imports: List<ImportDeclaration>): List<ClassASTNode> {
    val declarations = mutableListOf<ClassASTNode>()

    for (decl in classDeclaration()) {
        declarations.add(decl.toAST(imports))
    }

    return declarations
}

fun ClassDeclarationContext.toAST(imports: List<ImportDeclaration>): ClassASTNode {
    val access = modifierList().toAST()
    val type = type().toAST()

    return ClassASTNode(type, access).apply {
        annotationList()?.annotation()?.map { it.toAST(imports) }?.let { annotations ->
            this.annotations.addAll(annotations)
        }

        val (fields, methods) = classBody().toAST(imports)

        this.fields.addAll(fields)
        this.methods.addAll(methods)
    }
}

fun ClassBodyContext.toAST(imports: List<ImportDeclaration>): Pair<List<FieldASTNode>, List<MethodASTNode>> {
    val fields = mutableListOf<FieldASTNode>()
    val methods = mutableListOf<MethodASTNode>()

    for (field in fieldDeclaration())
        fields.add(field.toAST(imports))

    for (method in methodDeclaration())
        methods.add(method.toAST(imports))

    return Pair(fields, methods)
}
