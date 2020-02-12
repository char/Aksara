package codes.som.anthony.aksara.assembler

import codes.som.anthony.aksara.ast.ImportDeclaration
import org.objectweb.asm.Type

data class AssemblyContext(
        val imports: List<ImportDeclaration>,
        val selfType: Type?
)
