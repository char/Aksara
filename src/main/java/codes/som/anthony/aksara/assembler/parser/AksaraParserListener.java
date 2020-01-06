// Generated from /home/half-kh-hacker/Documents/Development/Projects/Paramorphism/Aksara/src/main/resources/parser/AksaraParser.g4 by ANTLR 4.7.2
package codes.som.anthony.aksara.assembler.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AksaraParser}.
 */
public interface AksaraParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AksaraParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(AksaraParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(AksaraParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#anysemi}.
	 * @param ctx the parse tree
	 */
	void enterAnysemi(AksaraParser.AnysemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#anysemi}.
	 * @param ctx the parse tree
	 */
	void exitAnysemi(AksaraParser.AnysemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#aksaraFile}.
	 * @param ctx the parse tree
	 */
	void enterAksaraFile(AksaraParser.AksaraFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#aksaraFile}.
	 * @param ctx the parse tree
	 */
	void exitAksaraFile(AksaraParser.AksaraFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#importList}.
	 * @param ctx the parse tree
	 */
	void enterImportList(AksaraParser.ImportListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#importList}.
	 * @param ctx the parse tree
	 */
	void exitImportList(AksaraParser.ImportListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void enterImportHeader(AksaraParser.ImportHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#importHeader}.
	 * @param ctx the parse tree
	 */
	void exitImportHeader(AksaraParser.ImportHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#classDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarations(AksaraParser.ClassDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#classDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarations(AksaraParser.ClassDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AksaraParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AksaraParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(AksaraParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(AksaraParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(AksaraParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(AksaraParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AksaraParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AksaraParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AksaraParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AksaraParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(AksaraParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(AksaraParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AksaraParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AksaraParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AksaraParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AksaraParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIdentifier(AksaraParser.SimpleIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#simpleIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIdentifier(AksaraParser.SimpleIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#arrayIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterArrayIdentifier(AksaraParser.ArrayIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#arrayIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitArrayIdentifier(AksaraParser.ArrayIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AksaraParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AksaraParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AksaraParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AksaraParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterLineStringLiteral(AksaraParser.LineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#lineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitLineStringLiteral(AksaraParser.LineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterLineStringContent(AksaraParser.LineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#lineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitLineStringContent(AksaraParser.LineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringLiteral(AksaraParser.MultiLineStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#multiLineStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringLiteral(AksaraParser.MultiLineStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineStringContent(AksaraParser.MultiLineStringContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#multiLineStringContent}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineStringContent(AksaraParser.MultiLineStringContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void enterModifierList(AksaraParser.ModifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#modifierList}.
	 * @param ctx the parse tree
	 */
	void exitModifierList(AksaraParser.ModifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AksaraParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(AksaraParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AksaraParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(AksaraParser.ModifierContext ctx);
}