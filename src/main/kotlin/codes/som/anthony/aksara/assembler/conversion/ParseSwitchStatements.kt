package codes.som.anthony.aksara.assembler.conversion

import codes.som.anthony.aksara.assembler.parser.AksaraParser.SwitchLabelContext
import org.objectweb.asm.tree.LabelNode

fun List<SwitchLabelContext>.toAST(labels: Map<String, LabelNode>): Pair<LabelNode, Map<Int, LabelNode>> {
    var default: LabelNode? = null
    val matches = mutableMapOf<Int, LabelNode>()

    for (switchLabel in this) {
        val labelName = switchLabel.identifier().toAST()
        val label = labels[labelName] ?: error("Label '$labelName' is not defined in this block")

        if (switchLabel.DEFAULT() != null) {
            if (default != null)
                error("Multiple default labels defined for switch construct")

            default = label
        } else {
            val match = switchLabel.intLiteral().toAST()
            if (match in matches)
                error("Multiple labels matching $match defined for switch construct")

            matches[match] = label
        }
    }

    if (default == null)
        error("No default label defined for switch construct")

    return Pair(default, matches)
}
