// Generated from /home/half-kh-hacker/Documents/Development/Projects/Paramorphism/Aksara/src/main/resources/parser/AksaraParser.g4 by ANTLR 4.7.2
package codes.som.anthony.aksara.assembler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AksaraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DelimitedComment=1, LineComment=2, WS=3, NL=4, DOT=5, COMMA=6, SINGLE_QUOTE=7, 
		COLON=8, SEMICOLON=9, EQUALS=10, LPAREN=11, RPAREN=12, LSQUARE=13, RSQUARE=14, 
		LCURL=15, RCURL=16, LANG=17, RANG=18, AT_SYMBOL=19, IMPORT=20, BINARY=21, 
		RUNTIME=22, PUBLIC=23, PRIVATE=24, PROTECTED=25, STATIC=26, FINAL=27, 
		SUPER=28, SYNCHRONIZED=29, OPEN=30, TRANSITIVE=31, VOLATILE=32, BRIDGE=33, 
		STATIC_PHASE=34, VARARGS=35, TRANSIENT=36, NATIVE=37, INTERFACE=38, ABSTRACT=39, 
		STRICT=40, SYNTHETIC=41, ANNOTATION=42, ENUM=43, MANDATED=44, MODULE=45, 
		QUOTE_OPEN=46, TRIPLE_QUOTE_OPEN=47, FLOAT_TRAILER=48, LONG_TRAILER=49, 
		DOUBLE_TRAILER=50, RealLiteral=51, IntegerLiteral=52, HexLiteral=53, BinLiteral=54, 
		BooleanLiteral=55, CharacterLiteral=56, EscapedCharacterLiteral=57, SimpleInstruction=58, 
		ImmediateIntPushInstruction=59, FieldAccessInstruction=60, MethodInvocationInstruction=61, 
		LoadConstantInstruction=62, LocalVariableAccessInstruction=63, IincInstruction=64, 
		TypeReceivingInstruction=65, Identifier=66, UNICODE_CLASS_LL=67, UNICODE_CLASS_LM=68, 
		UNICODE_CLASS_LO=69, UNICODE_CLASS_LT=70, UNICODE_CLASS_LU=71, UNICODE_CLASS_ND=72, 
		UNICODE_CLASS_NL=73, Inside_Comment=74, Inside_WS=75, Inside_NL=76, QUOTE_CLOSE=77, 
		LineStrText=78, LineStrEscapedChar=79, TRIPLE_QUOTE_CLOSE=80, MultiLineStringQuote=81, 
		MultiLineStrText=82, MultiLineStrEscapedChar=83, MultiLineNL=84;
	public static final int
		RULE_semi = 0, RULE_anysemi = 1, RULE_aksaraFile = 2, RULE_importList = 3, 
		RULE_importHeader = 4, RULE_classDeclarations = 5, RULE_classDeclaration = 6, 
		RULE_fieldDeclaration = 7, RULE_methodSignature = 8, RULE_methodDeclaration = 9, 
		RULE_methodBody = 10, RULE_instruction = 11, RULE_instructions = 12, RULE_classBody = 13, 
		RULE_identifier = 14, RULE_simpleIdentifier = 15, RULE_arrayIdentifier = 16, 
		RULE_type = 17, RULE_stringLiteral = 18, RULE_lineStringLiteral = 19, 
		RULE_lineStringContent = 20, RULE_multiLineStringLiteral = 21, RULE_multiLineStringContent = 22, 
		RULE_modifierList = 23, RULE_modifier = 24, RULE_intLiteral = 25, RULE_longLiteral = 26, 
		RULE_floatLiteral = 27, RULE_doubleLiteral = 28, RULE_characterLiteral = 29, 
		RULE_literal = 30, RULE_annotationList = 31, RULE_annotationType = 32, 
		RULE_annotationArgument = 33, RULE_annotation = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"semi", "anysemi", "aksaraFile", "importList", "importHeader", "classDeclarations", 
			"classDeclaration", "fieldDeclaration", "methodSignature", "methodDeclaration", 
			"methodBody", "instruction", "instructions", "classBody", "identifier", 
			"simpleIdentifier", "arrayIdentifier", "type", "stringLiteral", "lineStringLiteral", 
			"lineStringContent", "multiLineStringLiteral", "multiLineStringContent", 
			"modifierList", "modifier", "intLiteral", "longLiteral", "floatLiteral", 
			"doubleLiteral", "characterLiteral", "literal", "annotationList", "annotationType", 
			"annotationArgument", "annotation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'.'", "','", "'''", "':'", "';'", "'='", 
			"'('", null, "'['", null, "'{'", "'}'", "'<'", "'>'", "'@'", "'import'", 
			"'BINARY'", "'RUNTIME'", "'public'", "'private'", "'protected'", "'static'", 
			"'final'", "'super'", "'synchronized'", "'open'", "'transitive'", "'volatile'", 
			"'bridge'", "'static_phase'", "'varargs'", "'transient'", "'native'", 
			"'interface'", "'abstract'", "'strict'", "'synthetic'", "'annotation'", 
			"'enum'", "'mandated'", "'module'", null, "'\"\"\"'", "'F'", "'L'", "'D'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DelimitedComment", "LineComment", "WS", "NL", "DOT", "COMMA", 
			"SINGLE_QUOTE", "COLON", "SEMICOLON", "EQUALS", "LPAREN", "RPAREN", "LSQUARE", 
			"RSQUARE", "LCURL", "RCURL", "LANG", "RANG", "AT_SYMBOL", "IMPORT", "BINARY", 
			"RUNTIME", "PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "SUPER", 
			"SYNCHRONIZED", "OPEN", "TRANSITIVE", "VOLATILE", "BRIDGE", "STATIC_PHASE", 
			"VARARGS", "TRANSIENT", "NATIVE", "INTERFACE", "ABSTRACT", "STRICT", 
			"SYNTHETIC", "ANNOTATION", "ENUM", "MANDATED", "MODULE", "QUOTE_OPEN", 
			"TRIPLE_QUOTE_OPEN", "FLOAT_TRAILER", "LONG_TRAILER", "DOUBLE_TRAILER", 
			"RealLiteral", "IntegerLiteral", "HexLiteral", "BinLiteral", "BooleanLiteral", 
			"CharacterLiteral", "EscapedCharacterLiteral", "SimpleInstruction", "ImmediateIntPushInstruction", 
			"FieldAccessInstruction", "MethodInvocationInstruction", "LoadConstantInstruction", 
			"LocalVariableAccessInstruction", "IincInstruction", "TypeReceivingInstruction", 
			"Identifier", "UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", 
			"UNICODE_CLASS_LT", "UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", 
			"Inside_Comment", "Inside_WS", "Inside_NL", "QUOTE_CLOSE", "LineStrText", 
			"LineStrEscapedChar", "TRIPLE_QUOTE_CLOSE", "MultiLineStringQuote", "MultiLineStrText", 
			"MultiLineStrEscapedChar", "MultiLineNL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AksaraParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AksaraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SemiContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(AksaraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AksaraParser.NL, i);
		}
		public TerminalNode SEMICOLON() { return getToken(AksaraParser.SEMICOLON, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitSemi(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_semi);
		int _la;
		try {
			int _alt;
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(70);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(73); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(75);
					match(NL);
					}
					}
					setState(80);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(81);
				match(SEMICOLON);
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(82);
						match(NL);
						}
						} 
					}
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnysemiContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(AksaraParser.NL, 0); }
		public TerminalNode SEMICOLON() { return getToken(AksaraParser.SEMICOLON, 0); }
		public AnysemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anysemi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterAnysemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitAnysemi(this);
		}
	}

	public final AnysemiContext anysemi() throws RecognitionException {
		AnysemiContext _localctx = new AnysemiContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_anysemi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !(_la==NL || _la==SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AksaraFileContext extends ParserRuleContext {
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public ClassDeclarationsContext classDeclarations() {
			return getRuleContext(ClassDeclarationsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AksaraParser.EOF, 0); }
		public List<TerminalNode> NL() { return getTokens(AksaraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AksaraParser.NL, i);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public AksaraFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aksaraFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterAksaraFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitAksaraFile(this);
		}
	}

	public final AksaraFileContext aksaraFile() throws RecognitionException {
		AksaraFileContext _localctx = new AksaraFileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aksaraFile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(NL);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(98);
			importList();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL || _la==SEMICOLON) {
				{
				{
				setState(99);
				anysemi();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			classDeclarations();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(106);
				match(NL);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportListContext extends ParserRuleContext {
		public List<ImportHeaderContext> importHeader() {
			return getRuleContexts(ImportHeaderContext.class);
		}
		public ImportHeaderContext importHeader(int i) {
			return getRuleContext(ImportHeaderContext.class,i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitImportList(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(114);
				importHeader();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportHeaderContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AksaraParser.IMPORT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public ImportHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterImportHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitImportHeader(this);
		}
	}

	public final ImportHeaderContext importHeader() throws RecognitionException {
		ImportHeaderContext _localctx = new ImportHeaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(IMPORT);
			setState(121);
			identifier();
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122);
				semi();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationsContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ClassDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterClassDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitClassDeclarations(this);
		}
	}

	public final ClassDeclarationsContext classDeclarations() throws RecognitionException {
		ClassDeclarationsContext _localctx = new ClassDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				classDeclaration();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT_SYMBOL) | (1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << FINAL) | (1L << SUPER) | (1L << SYNCHRONIZED) | (1L << OPEN) | (1L << TRANSITIVE) | (1L << VOLATILE) | (1L << BRIDGE) | (1L << STATIC_PHASE) | (1L << VARARGS) | (1L << TRANSIENT) | (1L << NATIVE) | (1L << INTERFACE) | (1L << ABSTRACT) | (1L << STRICT) | (1L << SYNTHETIC) | (1L << ANNOTATION) | (1L << ENUM) | (1L << MANDATED) | (1L << MODULE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public TerminalNode LCURL() { return getToken(AksaraParser.LCURL, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(AksaraParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(AksaraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AksaraParser.NL, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_SYMBOL) {
				{
				setState(130);
				annotationList();
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131);
					match(NL);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
			}

			setState(138);
			modifierList();
			setState(139);
			type();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURL) {
				{
				setState(140);
				match(LCURL);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(141);
					match(NL);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				classBody();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(148);
					match(NL);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154);
				match(RCURL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AksaraParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AksaraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AksaraParser.NL, i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_SYMBOL) {
				{
				setState(158);
				annotationList();
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159);
					match(NL);
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
			}

			setState(166);
			modifierList();
			setState(167);
			identifier();
			setState(168);
			match(COLON);
			setState(169);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodSignatureContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(AksaraParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AksaraParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AksaraParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AksaraParser.COMMA, i);
		}
		public MethodSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterMethodSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitMethodSignature(this);
		}
	}

	public final MethodSignatureContext methodSignature() throws RecognitionException {
		MethodSignatureContext _localctx = new MethodSignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			type();
			setState(172);
			match(LPAREN);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (LANG - 17)) | (1L << (QUOTE_OPEN - 17)) | (1L << (Identifier - 17)))) != 0)) {
				{
				setState(173);
				type();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(174);
					match(COMMA);
					setState(175);
					type();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(183);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
		}
		public AnnotationListContext annotationList() {
			return getRuleContext(AnnotationListContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<TerminalNode> NL() { return getTokens(AksaraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AksaraParser.NL, i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_SYMBOL) {
				{
				setState(185);
				annotationList();
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					match(NL);
					}
					}
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
			}

			setState(193);
			modifierList();
			setState(194);
			identifier();
			setState(195);
			methodSignature();
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(196);
				methodBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(AksaraParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(AksaraParser.RCURL, 0); }
		public List<TerminalNode> NL() { return getTokens(AksaraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AksaraParser.NL, i);
		}
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(199);
				match(NL);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(LCURL);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(NL);
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (SimpleInstruction - 58)) | (1L << (ImmediateIntPushInstruction - 58)) | (1L << (FieldAccessInstruction - 58)) | (1L << (MethodInvocationInstruction - 58)) | (1L << (LoadConstantInstruction - 58)) | (1L << (LocalVariableAccessInstruction - 58)) | (1L << (IincInstruction - 58)) | (1L << (TypeReceivingInstruction - 58)))) != 0)) {
				{
				setState(212);
				instructions();
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(215);
				match(NL);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode SimpleInstruction() { return getToken(AksaraParser.SimpleInstruction, 0); }
		public TerminalNode ImmediateIntPushInstruction() { return getToken(AksaraParser.ImmediateIntPushInstruction, 0); }
		public List<IntLiteralContext> intLiteral() {
			return getRuleContexts(IntLiteralContext.class);
		}
		public IntLiteralContext intLiteral(int i) {
			return getRuleContext(IntLiteralContext.class,i);
		}
		public TerminalNode FieldAccessInstruction() { return getToken(AksaraParser.FieldAccessInstruction, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode MethodInvocationInstruction() { return getToken(AksaraParser.MethodInvocationInstruction, 0); }
		public MethodSignatureContext methodSignature() {
			return getRuleContext(MethodSignatureContext.class,0);
		}
		public TerminalNode LoadConstantInstruction() { return getToken(AksaraParser.LoadConstantInstruction, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LocalVariableAccessInstruction() { return getToken(AksaraParser.LocalVariableAccessInstruction, 0); }
		public TerminalNode IincInstruction() { return getToken(AksaraParser.IincInstruction, 0); }
		public TerminalNode TypeReceivingInstruction() { return getToken(AksaraParser.TypeReceivingInstruction, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instruction);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SimpleInstruction:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(223);
				match(SimpleInstruction);
				}
				}
				break;
			case ImmediateIntPushInstruction:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(224);
				match(ImmediateIntPushInstruction);
				setState(225);
				intLiteral();
				}
				}
				break;
			case FieldAccessInstruction:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(226);
				match(FieldAccessInstruction);
				setState(227);
				type();
				setState(228);
				identifier();
				setState(229);
				type();
				}
				}
				break;
			case MethodInvocationInstruction:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(231);
				match(MethodInvocationInstruction);
				setState(232);
				type();
				setState(233);
				identifier();
				setState(234);
				methodSignature();
				}
				}
				break;
			case LoadConstantInstruction:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(236);
				match(LoadConstantInstruction);
				setState(237);
				literal();
				}
				}
				break;
			case LocalVariableAccessInstruction:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(238);
				match(LocalVariableAccessInstruction);
				setState(239);
				intLiteral();
				}
				}
				break;
			case IincInstruction:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(240);
				match(IincInstruction);
				setState(241);
				intLiteral();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << HexLiteral) | (1L << BinLiteral))) != 0)) {
					{
					setState(242);
					intLiteral();
					}
				}

				}
				}
				break;
			case TypeReceivingInstruction:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(245);
				match(TypeReceivingInstruction);
				setState(246);
				type();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitInstructions(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_instructions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			instruction();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					semi();
					setState(251);
					instruction();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_classBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(258);
				fieldDeclaration();
				}
				break;
			case 2:
				{
				setState(259);
				methodDeclaration();
				}
				break;
			}
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(262);
					semi();
					setState(265);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						setState(263);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(264);
						methodDeclaration();
						}
						break;
					}
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<SimpleIdentifierContext> simpleIdentifier() {
			return getRuleContexts(SimpleIdentifierContext.class);
		}
		public SimpleIdentifierContext simpleIdentifier(int i) {
			return getRuleContext(SimpleIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AksaraParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AksaraParser.DOT, i);
		}
		public List<TerminalNode> NL() { return getTokens(AksaraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AksaraParser.NL, i);
		}
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifier);
		int _la;
		try {
			int _alt;
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANG:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				simpleIdentifier();
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(276);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(273);
							match(NL);
							}
							}
							setState(278);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(279);
						match(DOT);
						setState(280);
						simpleIdentifier();
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				lineStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleIdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AksaraParser.Identifier, 0); }
		public TerminalNode LANG() { return getToken(AksaraParser.LANG, 0); }
		public TerminalNode RANG() { return getToken(AksaraParser.RANG, 0); }
		public SimpleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterSimpleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitSimpleIdentifier(this);
		}
	}

	public final SimpleIdentifierContext simpleIdentifier() throws RecognitionException {
		SimpleIdentifierContext _localctx = new SimpleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANG) {
				{
				setState(289);
				match(LANG);
				}
			}

			setState(292);
			match(Identifier);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANG) {
				{
				setState(293);
				match(RANG);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(AksaraParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(AksaraParser.RSQUARE, 0); }
		public ArrayIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterArrayIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitArrayIdentifier(this);
		}
	}

	public final ArrayIdentifierContext arrayIdentifier() throws RecognitionException {
		ArrayIdentifierContext _localctx = new ArrayIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			identifier();
			setState(297);
			match(LSQUARE);
			setState(298);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayIdentifierContext arrayIdentifier() {
			return getRuleContext(ArrayIdentifierContext.class,0);
		}
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				arrayIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				lineStringLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public LineStringLiteralContext lineStringLiteral() {
			return getRuleContext(LineStringLiteralContext.class,0);
		}
		public MultiLineStringLiteralContext multiLineStringLiteral() {
			return getRuleContext(MultiLineStringLiteralContext.class,0);
		}
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringLiteral);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				multiLineStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineStringLiteralContext extends ParserRuleContext {
		public TerminalNode QUOTE_OPEN() { return getToken(AksaraParser.QUOTE_OPEN, 0); }
		public TerminalNode QUOTE_CLOSE() { return getToken(AksaraParser.QUOTE_CLOSE, 0); }
		public List<LineStringContentContext> lineStringContent() {
			return getRuleContexts(LineStringContentContext.class);
		}
		public LineStringContentContext lineStringContent(int i) {
			return getRuleContext(LineStringContentContext.class,i);
		}
		public LineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitLineStringLiteral(this);
		}
	}

	public final LineStringLiteralContext lineStringLiteral() throws RecognitionException {
		LineStringLiteralContext _localctx = new LineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(QUOTE_OPEN);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineStrText || _la==LineStrEscapedChar) {
				{
				{
				setState(310);
				lineStringContent();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(QUOTE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineStringContentContext extends ParserRuleContext {
		public TerminalNode LineStrText() { return getToken(AksaraParser.LineStrText, 0); }
		public TerminalNode LineStrEscapedChar() { return getToken(AksaraParser.LineStrEscapedChar, 0); }
		public LineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitLineStringContent(this);
		}
	}

	public final LineStringContentContext lineStringContent() throws RecognitionException {
		LineStringContentContext _localctx = new LineStringContentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==LineStrText || _la==LineStrEscapedChar) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineStringLiteralContext extends ParserRuleContext {
		public TerminalNode TRIPLE_QUOTE_OPEN() { return getToken(AksaraParser.TRIPLE_QUOTE_OPEN, 0); }
		public TerminalNode TRIPLE_QUOTE_CLOSE() { return getToken(AksaraParser.TRIPLE_QUOTE_CLOSE, 0); }
		public List<MultiLineStringContentContext> multiLineStringContent() {
			return getRuleContexts(MultiLineStringContentContext.class);
		}
		public MultiLineStringContentContext multiLineStringContent(int i) {
			return getRuleContext(MultiLineStringContentContext.class,i);
		}
		public List<LineStringLiteralContext> lineStringLiteral() {
			return getRuleContexts(LineStringLiteralContext.class);
		}
		public LineStringLiteralContext lineStringLiteral(int i) {
			return getRuleContext(LineStringLiteralContext.class,i);
		}
		public MultiLineStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterMultiLineStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitMultiLineStringLiteral(this);
		}
	}

	public final MultiLineStringLiteralContext multiLineStringLiteral() throws RecognitionException {
		MultiLineStringLiteralContext _localctx = new MultiLineStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(TRIPLE_QUOTE_OPEN);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (QUOTE_OPEN - 46)) | (1L << (MultiLineStrText - 46)) | (1L << (MultiLineStrEscapedChar - 46)))) != 0)) {
				{
				setState(323);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(321);
					multiLineStringContent();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(322);
					lineStringLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(TRIPLE_QUOTE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineStringContentContext extends ParserRuleContext {
		public TerminalNode MultiLineStrText() { return getToken(AksaraParser.MultiLineStrText, 0); }
		public TerminalNode MultiLineStrEscapedChar() { return getToken(AksaraParser.MultiLineStrEscapedChar, 0); }
		public MultiLineStringContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineStringContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterMultiLineStringContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitMultiLineStringContent(this);
		}
	}

	public final MultiLineStringContentContext multiLineStringContent() throws RecognitionException {
		MultiLineStringContentContext _localctx = new MultiLineStringContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==MultiLineStrText || _la==MultiLineStrEscapedChar) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitModifierList(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				modifier();
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << FINAL) | (1L << SUPER) | (1L << SYNCHRONIZED) | (1L << OPEN) | (1L << TRANSITIVE) | (1L << VOLATILE) | (1L << BRIDGE) | (1L << STATIC_PHASE) | (1L << VARARGS) | (1L << TRANSIENT) | (1L << NATIVE) | (1L << INTERFACE) | (1L << ABSTRACT) | (1L << STRICT) | (1L << SYNTHETIC) | (1L << ANNOTATION) | (1L << ENUM) | (1L << MANDATED) | (1L << MODULE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(AksaraParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AksaraParser.PRIVATE, 0); }
		public TerminalNode PROTECTED() { return getToken(AksaraParser.PROTECTED, 0); }
		public TerminalNode STATIC() { return getToken(AksaraParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(AksaraParser.FINAL, 0); }
		public TerminalNode SUPER() { return getToken(AksaraParser.SUPER, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(AksaraParser.SYNCHRONIZED, 0); }
		public TerminalNode OPEN() { return getToken(AksaraParser.OPEN, 0); }
		public TerminalNode TRANSITIVE() { return getToken(AksaraParser.TRANSITIVE, 0); }
		public TerminalNode VOLATILE() { return getToken(AksaraParser.VOLATILE, 0); }
		public TerminalNode BRIDGE() { return getToken(AksaraParser.BRIDGE, 0); }
		public TerminalNode STATIC_PHASE() { return getToken(AksaraParser.STATIC_PHASE, 0); }
		public TerminalNode VARARGS() { return getToken(AksaraParser.VARARGS, 0); }
		public TerminalNode TRANSIENT() { return getToken(AksaraParser.TRANSIENT, 0); }
		public TerminalNode NATIVE() { return getToken(AksaraParser.NATIVE, 0); }
		public TerminalNode INTERFACE() { return getToken(AksaraParser.INTERFACE, 0); }
		public TerminalNode ABSTRACT() { return getToken(AksaraParser.ABSTRACT, 0); }
		public TerminalNode STRICT() { return getToken(AksaraParser.STRICT, 0); }
		public TerminalNode SYNTHETIC() { return getToken(AksaraParser.SYNTHETIC, 0); }
		public TerminalNode ANNOTATION() { return getToken(AksaraParser.ANNOTATION, 0); }
		public TerminalNode ENUM() { return getToken(AksaraParser.ENUM, 0); }
		public TerminalNode MANDATED() { return getToken(AksaraParser.MANDATED, 0); }
		public TerminalNode MODULE() { return getToken(AksaraParser.MODULE, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << STATIC) | (1L << FINAL) | (1L << SUPER) | (1L << SYNCHRONIZED) | (1L << OPEN) | (1L << TRANSITIVE) | (1L << VOLATILE) | (1L << BRIDGE) | (1L << STATIC_PHASE) | (1L << VARARGS) | (1L << TRANSIENT) | (1L << NATIVE) | (1L << INTERFACE) | (1L << ABSTRACT) | (1L << STRICT) | (1L << SYNTHETIC) | (1L << ANNOTATION) | (1L << ENUM) | (1L << MANDATED) | (1L << MODULE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(AksaraParser.IntegerLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(AksaraParser.HexLiteral, 0); }
		public TerminalNode BinLiteral() { return getToken(AksaraParser.BinLiteral, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitIntLiteral(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_intLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << HexLiteral) | (1L << BinLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LongLiteralContext extends ParserRuleContext {
		public TerminalNode LONG_TRAILER() { return getToken(AksaraParser.LONG_TRAILER, 0); }
		public TerminalNode IntegerLiteral() { return getToken(AksaraParser.IntegerLiteral, 0); }
		public TerminalNode HexLiteral() { return getToken(AksaraParser.HexLiteral, 0); }
		public TerminalNode BinLiteral() { return getToken(AksaraParser.BinLiteral, 0); }
		public LongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterLongLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitLongLiteral(this);
		}
	}

	public final LongLiteralContext longLiteral() throws RecognitionException {
		LongLiteralContext _localctx = new LongLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_longLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << HexLiteral) | (1L << BinLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(342);
			match(LONG_TRAILER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_TRAILER() { return getToken(AksaraParser.FLOAT_TRAILER, 0); }
		public TerminalNode RealLiteral() { return getToken(AksaraParser.RealLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(AksaraParser.IntegerLiteral, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitFloatLiteral(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_la = _input.LA(1);
			if ( !(_la==RealLiteral || _la==IntegerLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(345);
			match(FLOAT_TRAILER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleLiteralContext extends ParserRuleContext {
		public TerminalNode RealLiteral() { return getToken(AksaraParser.RealLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(AksaraParser.IntegerLiteral, 0); }
		public TerminalNode DOUBLE_TRAILER() { return getToken(AksaraParser.DOUBLE_TRAILER, 0); }
		public DoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitDoubleLiteral(this);
		}
	}

	public final DoubleLiteralContext doubleLiteral() throws RecognitionException {
		DoubleLiteralContext _localctx = new DoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doubleLiteral);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RealLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(RealLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(348);
				match(IntegerLiteral);
				setState(349);
				match(DOUBLE_TRAILER);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode CharacterLiteral() { return getToken(AksaraParser.CharacterLiteral, 0); }
		public TerminalNode EscapedCharacterLiteral() { return getToken(AksaraParser.EscapedCharacterLiteral, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitCharacterLiteral(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_characterLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==CharacterLiteral || _la==EscapedCharacterLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public LongLiteralContext longLiteral() {
			return getRuleContext(LongLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public DoubleLiteralContext doubleLiteral() {
			return getRuleContext(DoubleLiteralContext.class,0);
		}
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				intLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				longLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				floatLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(358);
				doubleLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(359);
				characterLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(360);
				type();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationListContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<AnysemiContext> anysemi() {
			return getRuleContexts(AnysemiContext.class);
		}
		public AnysemiContext anysemi(int i) {
			return getRuleContext(AnysemiContext.class,i);
		}
		public AnnotationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterAnnotationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitAnnotationList(this);
		}
	}

	public final AnnotationListContext annotationList() throws RecognitionException {
		AnnotationListContext _localctx = new AnnotationListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_annotationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			annotation();
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(364);
					anysemi();
					setState(365);
					annotation();
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeContext extends ParserRuleContext {
		public TerminalNode BINARY() { return getToken(AksaraParser.BINARY, 0); }
		public TerminalNode RUNTIME() { return getToken(AksaraParser.RUNTIME, 0); }
		public AnnotationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterAnnotationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitAnnotationType(this);
		}
	}

	public final AnnotationTypeContext annotationType() throws RecognitionException {
		AnnotationTypeContext _localctx = new AnnotationTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_annotationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_la = _input.LA(1);
			if ( !(_la==BINARY || _la==RUNTIME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationArgumentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AksaraParser.EQUALS, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AnnotationArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterAnnotationArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitAnnotationArgument(this);
		}
	}

	public final AnnotationArgumentContext annotationArgument() throws RecognitionException {
		AnnotationArgumentContext _localctx = new AnnotationArgumentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_annotationArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			identifier();
			setState(375);
			match(EQUALS);
			setState(376);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode AT_SYMBOL() { return getToken(AksaraParser.AT_SYMBOL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AksaraParser.LPAREN, 0); }
		public AnnotationTypeContext annotationType() {
			return getRuleContext(AnnotationTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AksaraParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AksaraParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AksaraParser.COMMA, i);
		}
		public List<AnnotationArgumentContext> annotationArgument() {
			return getRuleContexts(AnnotationArgumentContext.class);
		}
		public AnnotationArgumentContext annotationArgument(int i) {
			return getRuleContext(AnnotationArgumentContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AksaraParserListener ) ((AksaraParserListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(AT_SYMBOL);
			setState(379);
			type();
			setState(380);
			match(LPAREN);
			setState(381);
			annotationType();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(382);
				match(COMMA);
				setState(383);
				annotationArgument();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3V\u018a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\6\2J\n\2\r\2\16\2K\3\2\7\2O\n\2\f\2\16\2R"+
		"\13\2\3\2\3\2\7\2V\n\2\f\2\16\2Y\13\2\5\2[\n\2\3\3\3\3\3\4\7\4`\n\4\f"+
		"\4\16\4c\13\4\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\3\4\7\4n\n\4\f\4\16"+
		"\4q\13\4\3\4\3\4\3\5\7\5v\n\5\f\5\16\5y\13\5\3\6\3\6\3\6\5\6~\n\6\3\7"+
		"\6\7\u0081\n\7\r\7\16\7\u0082\3\b\3\b\6\b\u0087\n\b\r\b\16\b\u0088\5\b"+
		"\u008b\n\b\3\b\3\b\3\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b\3\b\3\b\7"+
		"\b\u0098\n\b\f\b\16\b\u009b\13\b\3\b\3\b\5\b\u009f\n\b\3\t\3\t\6\t\u00a3"+
		"\n\t\r\t\16\t\u00a4\5\t\u00a7\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u00b3\n\n\f\n\16\n\u00b6\13\n\5\n\u00b8\n\n\3\n\3\n\3\13\3\13"+
		"\6\13\u00be\n\13\r\13\16\13\u00bf\5\13\u00c2\n\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00c8\n\13\3\f\7\f\u00cb\n\f\f\f\16\f\u00ce\13\f\3\f\3\f\7\f\u00d2"+
		"\n\f\f\f\16\f\u00d5\13\f\3\f\5\f\u00d8\n\f\3\f\7\f\u00db\n\f\f\f\16\f"+
		"\u00de\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f6\n\r\3\r\3\r\5\r\u00fa\n\r\3\16"+
		"\3\16\3\16\3\16\7\16\u0100\n\16\f\16\16\16\u0103\13\16\3\17\3\17\5\17"+
		"\u0107\n\17\3\17\3\17\3\17\5\17\u010c\n\17\7\17\u010e\n\17\f\17\16\17"+
		"\u0111\13\17\3\20\3\20\7\20\u0115\n\20\f\20\16\20\u0118\13\20\3\20\3\20"+
		"\7\20\u011c\n\20\f\20\16\20\u011f\13\20\3\20\5\20\u0122\n\20\3\21\5\21"+
		"\u0125\n\21\3\21\3\21\5\21\u0129\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\5\23\u0132\n\23\3\24\3\24\5\24\u0136\n\24\3\25\3\25\7\25\u013a\n\25"+
		"\f\25\16\25\u013d\13\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u0146"+
		"\n\27\f\27\16\27\u0149\13\27\3\27\3\27\3\30\3\30\3\31\6\31\u0150\n\31"+
		"\r\31\16\31\u0151\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\5\36\u0161\n\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u016c"+
		"\n \3!\3!\3!\3!\7!\u0172\n!\f!\16!\u0175\13!\3\"\3\"\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\3$\3$\7$\u0183\n$\f$\16$\u0186\13$\3$\3$\3$\2\2%\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\n\4\2\6\6\13\13"+
		"\3\2PQ\3\2TU\3\2\31/\3\2\668\3\2\65\66\3\2:;\3\2\27\30\2\u01a1\2Z\3\2"+
		"\2\2\4\\\3\2\2\2\6a\3\2\2\2\bw\3\2\2\2\nz\3\2\2\2\f\u0080\3\2\2\2\16\u008a"+
		"\3\2\2\2\20\u00a6\3\2\2\2\22\u00ad\3\2\2\2\24\u00c1\3\2\2\2\26\u00cc\3"+
		"\2\2\2\30\u00f9\3\2\2\2\32\u00fb\3\2\2\2\34\u0106\3\2\2\2\36\u0121\3\2"+
		"\2\2 \u0124\3\2\2\2\"\u012a\3\2\2\2$\u0131\3\2\2\2&\u0135\3\2\2\2(\u0137"+
		"\3\2\2\2*\u0140\3\2\2\2,\u0142\3\2\2\2.\u014c\3\2\2\2\60\u014f\3\2\2\2"+
		"\62\u0153\3\2\2\2\64\u0155\3\2\2\2\66\u0157\3\2\2\28\u015a\3\2\2\2:\u0160"+
		"\3\2\2\2<\u0162\3\2\2\2>\u016b\3\2\2\2@\u016d\3\2\2\2B\u0176\3\2\2\2D"+
		"\u0178\3\2\2\2F\u017c\3\2\2\2HJ\7\6\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2L[\3\2\2\2MO\7\6\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2"+
		"QS\3\2\2\2RP\3\2\2\2SW\7\13\2\2TV\7\6\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2ZI\3\2\2\2ZP\3\2\2\2[\3\3\2\2\2\\]\t\2"+
		"\2\2]\5\3\2\2\2^`\7\6\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3"+
		"\2\2\2ca\3\2\2\2dh\5\b\5\2eg\5\4\3\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2ik\3\2\2\2jh\3\2\2\2ko\5\f\7\2ln\7\6\2\2ml\3\2\2\2nq\3\2\2\2om\3"+
		"\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\2\2\3s\7\3\2\2\2tv\5\n\6\2ut"+
		"\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2z{\7\26\2\2"+
		"{}\5\36\20\2|~\5\2\2\2}|\3\2\2\2}~\3\2\2\2~\13\3\2\2\2\177\u0081\5\16"+
		"\b\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\r\3\2\2\2\u0084\u0086\5@!\2\u0085\u0087\7\6\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\5\60\31\2\u008d\u009e\5$\23\2\u008e\u0092\7\21\2\2\u008f"+
		"\u0091\7\6\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0099\5\34\17\2\u0096\u0098\7\6\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3"+
		"\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u009d\7\22\2\2\u009d\u009f\3\2\2\2\u009e\u008e\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00a2\5@!\2\u00a1\u00a3"+
		"\7\6\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\5\60\31\2\u00a9\u00aa\5\36\20\2\u00aa"+
		"\u00ab\7\n\2\2\u00ab\u00ac\5$\23\2\u00ac\21\3\2\2\2\u00ad\u00ae\5$\23"+
		"\2\u00ae\u00b7\7\r\2\2\u00af\u00b4\5$\23\2\u00b0\u00b1\7\b\2\2\u00b1\u00b3"+
		"\5$\23\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00af\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\16\2\2\u00ba"+
		"\23\3\2\2\2\u00bb\u00bd\5@!\2\u00bc\u00be\7\6\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\5\60\31\2\u00c4\u00c5\5\36\20\2\u00c5\u00c7\5\22\n\2\u00c6\u00c8"+
		"\5\26\f\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\25\3\2\2\2\u00c9"+
		"\u00cb\7\6\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d3\7\21\2\2\u00d0\u00d2\7\6\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d8\5\32\16\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00dc\3\2\2\2\u00d9\u00db\7\6\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\22\2\2\u00e0\27\3\2\2\2\u00e1\u00fa"+
		"\7<\2\2\u00e2\u00e3\7=\2\2\u00e3\u00fa\5\64\33\2\u00e4\u00e5\7>\2\2\u00e5"+
		"\u00e6\5$\23\2\u00e6\u00e7\5\36\20\2\u00e7\u00e8\5$\23\2\u00e8\u00fa\3"+
		"\2\2\2\u00e9\u00ea\7?\2\2\u00ea\u00eb\5$\23\2\u00eb\u00ec\5\36\20\2\u00ec"+
		"\u00ed\5\22\n\2\u00ed\u00fa\3\2\2\2\u00ee\u00ef\7@\2\2\u00ef\u00fa\5>"+
		" \2\u00f0\u00f1\7A\2\2\u00f1\u00fa\5\64\33\2\u00f2\u00f3\7B\2\2\u00f3"+
		"\u00f5\5\64\33\2\u00f4\u00f6\5\64\33\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f8\7C\2\2\u00f8\u00fa\5$\23\2\u00f9"+
		"\u00e1\3\2\2\2\u00f9\u00e2\3\2\2\2\u00f9\u00e4\3\2\2\2\u00f9\u00e9\3\2"+
		"\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\31\3\2\2\2\u00fb\u0101\5\30\r\2\u00fc\u00fd\5\2\2"+
		"\2\u00fd\u00fe\5\30\r\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\33\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0104\u0107\5\20\t\2\u0105\u0107\5\24\13\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u010f\3\2\2\2\u0108\u010b\5\2"+
		"\2\2\u0109\u010c\5\20\t\2\u010a\u010c\5\24\13\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\35\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0112\u011d\5 \21\2\u0113\u0115\7\6\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\7\2\2\u011a\u011c\5 \21\2\u011b"+
		"\u0116\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2"+
		"\2\2\u011e\u0122\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\5(\25\2\u0121"+
		"\u0112\3\2\2\2\u0121\u0120\3\2\2\2\u0122\37\3\2\2\2\u0123\u0125\7\23\2"+
		"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128"+
		"\7D\2\2\u0127\u0129\7\24\2\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"!\3\2\2\2\u012a\u012b\5\36\20\2\u012b\u012c\7\17\2\2\u012c\u012d\7\20"+
		"\2\2\u012d#\3\2\2\2\u012e\u0132\5\36\20\2\u012f\u0132\5\"\22\2\u0130\u0132"+
		"\5(\25\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"%\3\2\2\2\u0133\u0136\5(\25\2\u0134\u0136\5,\27\2\u0135\u0133\3\2\2\2"+
		"\u0135\u0134\3\2\2\2\u0136\'\3\2\2\2\u0137\u013b\7\60\2\2\u0138\u013a"+
		"\5*\26\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7O"+
		"\2\2\u013f)\3\2\2\2\u0140\u0141\t\3\2\2\u0141+\3\2\2\2\u0142\u0147\7\61"+
		"\2\2\u0143\u0146\5.\30\2\u0144\u0146\5(\25\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\7R\2\2\u014b"+
		"-\3\2\2\2\u014c\u014d\t\4\2\2\u014d/\3\2\2\2\u014e\u0150\5\62\32\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\61\3\2\2\2\u0153\u0154\t\5\2\2\u0154\63\3\2\2\2\u0155\u0156"+
		"\t\6\2\2\u0156\65\3\2\2\2\u0157\u0158\t\6\2\2\u0158\u0159\7\63\2\2\u0159"+
		"\67\3\2\2\2\u015a\u015b\t\7\2\2\u015b\u015c\7\62\2\2\u015c9\3\2\2\2\u015d"+
		"\u0161\7\65\2\2\u015e\u015f\7\66\2\2\u015f\u0161\7\64\2\2\u0160\u015d"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0161;\3\2\2\2\u0162\u0163\t\b\2\2\u0163"+
		"=\3\2\2\2\u0164\u016c\5&\24\2\u0165\u016c\5\64\33\2\u0166\u016c\5\66\34"+
		"\2\u0167\u016c\58\35\2\u0168\u016c\5:\36\2\u0169\u016c\5<\37\2\u016a\u016c"+
		"\5$\23\2\u016b\u0164\3\2\2\2\u016b\u0165\3\2\2\2\u016b\u0166\3\2\2\2\u016b"+
		"\u0167\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2"+
		"\2\2\u016c?\3\2\2\2\u016d\u0173\5F$\2\u016e\u016f\5\4\3\2\u016f\u0170"+
		"\5F$\2\u0170\u0172\3\2\2\2\u0171\u016e\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174A\3\2\2\2\u0175\u0173\3\2\2\2"+
		"\u0176\u0177\t\t\2\2\u0177C\3\2\2\2\u0178\u0179\5\36\20\2\u0179\u017a"+
		"\7\f\2\2\u017a\u017b\5> \2\u017bE\3\2\2\2\u017c\u017d\7\25\2\2\u017d\u017e"+
		"\5$\23\2\u017e\u017f\7\r\2\2\u017f\u0184\5B\"\2\u0180\u0181\7\b\2\2\u0181"+
		"\u0183\5D#\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2"+
		"\2\u0184\u0185\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188"+
		"\7\16\2\2\u0188G\3\2\2\2\61KPWZahow}\u0082\u0088\u008a\u0092\u0099\u009e"+
		"\u00a4\u00a6\u00b4\u00b7\u00bf\u00c1\u00c7\u00cc\u00d3\u00d7\u00dc\u00f5"+
		"\u00f9\u0101\u0106\u010b\u010f\u0116\u011d\u0121\u0124\u0128\u0131\u0135"+
		"\u013b\u0145\u0147\u0151\u0160\u016b\u0173\u0184";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}