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
		COLON=8, SEMICOLON=9, LPAREN=10, RPAREN=11, LSQUARE=12, RSQUARE=13, LCURL=14, 
		RCURL=15, LANG=16, RANG=17, IMPORT=18, PUBLIC=19, PRIVATE=20, PROTECTED=21, 
		STATIC=22, FINAL=23, SUPER=24, SYNCHRONIZED=25, OPEN=26, TRANSITIVE=27, 
		VOLATILE=28, BRIDGE=29, STATIC_PHASE=30, VARARGS=31, TRANSIENT=32, NATIVE=33, 
		INTERFACE=34, ABSTRACT=35, STRICT=36, SYNTHETIC=37, ANNOTATION=38, ENUM=39, 
		MANDATED=40, MODULE=41, QUOTE_OPEN=42, TRIPLE_QUOTE_OPEN=43, RealLiteral=44, 
		FloatLiteral=45, DoubleLiteral=46, LongLiteral=47, IntegerLiteral=48, 
		HexLiteral=49, BinLiteral=50, BooleanLiteral=51, Identifier=52, CharacterLiteral=53, 
		UNICODE_CLASS_LL=54, UNICODE_CLASS_LM=55, UNICODE_CLASS_LO=56, UNICODE_CLASS_LT=57, 
		UNICODE_CLASS_LU=58, UNICODE_CLASS_ND=59, UNICODE_CLASS_NL=60, Inside_Comment=61, 
		Inside_WS=62, Inside_NL=63, QUOTE_CLOSE=64, LineStrText=65, LineStrEscapedChar=66, 
		TRIPLE_QUOTE_CLOSE=67, MultiLineStringQuote=68, MultiLineStrText=69, MultiLineStrEscapedChar=70, 
		MultiLineNL=71;
	public static final int
		RULE_semi = 0, RULE_anysemi = 1, RULE_aksaraFile = 2, RULE_importList = 3, 
		RULE_importHeader = 4, RULE_classDeclarations = 5, RULE_classDeclaration = 6, 
		RULE_fieldDeclaration = 7, RULE_methodSignature = 8, RULE_methodDeclaration = 9, 
		RULE_instruction = 10, RULE_methodBody = 11, RULE_classBody = 12, RULE_identifier = 13, 
		RULE_simpleIdentifier = 14, RULE_arrayIdentifier = 15, RULE_type = 16, 
		RULE_stringLiteral = 17, RULE_lineStringLiteral = 18, RULE_lineStringContent = 19, 
		RULE_multiLineStringLiteral = 20, RULE_multiLineStringContent = 21, RULE_modifierList = 22, 
		RULE_modifier = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"semi", "anysemi", "aksaraFile", "importList", "importHeader", "classDeclarations", 
			"classDeclaration", "fieldDeclaration", "methodSignature", "methodDeclaration", 
			"instruction", "methodBody", "classBody", "identifier", "simpleIdentifier", 
			"arrayIdentifier", "type", "stringLiteral", "lineStringLiteral", "lineStringContent", 
			"multiLineStringLiteral", "multiLineStringContent", "modifierList", "modifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'.'", "','", "'''", "':'", "';'", "'('", 
			null, "'['", null, "'{'", "'}'", "'<'", "'>'", "'import'", "'public'", 
			"'private'", "'protected'", "'static'", "'final'", "'super'", "'synchronized'", 
			"'open'", "'transitive'", "'volatile'", "'bridge'", "'static_phase'", 
			"'varargs'", "'transient'", "'native'", "'interface'", "'abstract'", 
			"'strict'", "'synthetic'", "'annotation'", "'enum'", "'mandated'", "'module'", 
			null, "'\"\"\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DelimitedComment", "LineComment", "WS", "NL", "DOT", "COMMA", 
			"SINGLE_QUOTE", "COLON", "SEMICOLON", "LPAREN", "RPAREN", "LSQUARE", 
			"RSQUARE", "LCURL", "RCURL", "LANG", "RANG", "IMPORT", "PUBLIC", "PRIVATE", 
			"PROTECTED", "STATIC", "FINAL", "SUPER", "SYNCHRONIZED", "OPEN", "TRANSITIVE", 
			"VOLATILE", "BRIDGE", "STATIC_PHASE", "VARARGS", "TRANSIENT", "NATIVE", 
			"INTERFACE", "ABSTRACT", "STRICT", "SYNTHETIC", "ANNOTATION", "ENUM", 
			"MANDATED", "MODULE", "QUOTE_OPEN", "TRIPLE_QUOTE_OPEN", "RealLiteral", 
			"FloatLiteral", "DoubleLiteral", "LongLiteral", "IntegerLiteral", "HexLiteral", 
			"BinLiteral", "BooleanLiteral", "Identifier", "CharacterLiteral", "UNICODE_CLASS_LL", 
			"UNICODE_CLASS_LM", "UNICODE_CLASS_LO", "UNICODE_CLASS_LT", "UNICODE_CLASS_LU", 
			"UNICODE_CLASS_ND", "UNICODE_CLASS_NL", "Inside_Comment", "Inside_WS", 
			"Inside_NL", "QUOTE_CLOSE", "LineStrText", "LineStrEscapedChar", "TRIPLE_QUOTE_CLOSE", 
			"MultiLineStringQuote", "MultiLineStrText", "MultiLineStrEscapedChar", 
			"MultiLineNL"
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
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(48);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(51); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(53);
					match(NL);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(SEMICOLON);
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(60);
						match(NL);
						}
						} 
					}
					setState(65);
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
			setState(68);
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
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					match(NL);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(76);
			importList();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL || _la==SEMICOLON) {
				{
				{
				setState(77);
				anysemi();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			classDeclarations();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(84);
				match(NL);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(92);
				importHeader();
				}
				}
				setState(97);
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
			setState(98);
			match(IMPORT);
			setState(99);
			identifier();
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(100);
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
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				classDeclaration();
				}
				}
				setState(106); 
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(108);
			modifierList();
			setState(109);
			type();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURL) {
				{
				setState(110);
				match(LCURL);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(111);
					match(NL);
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				classBody();
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(118);
					match(NL);
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			modifierList();
			setState(129);
			identifier();
			setState(130);
			match(COLON);
			setState(131);
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
			setState(133);
			type();
			setState(134);
			match(LPAREN);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANG) | (1L << QUOTE_OPEN) | (1L << Identifier))) != 0)) {
				{
				setState(135);
				type();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(136);
					match(COMMA);
					setState(137);
					type();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(145);
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
		public TerminalNode LCURL() { return getToken(AksaraParser.LCURL, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(AksaraParser.RCURL, 0); }
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
			setState(147);
			modifierList();
			setState(148);
			identifier();
			setState(149);
			methodSignature();
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(150);
					match(NL);
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				match(LCURL);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(157);
					match(NL);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				methodBody();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(164);
					match(NL);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(RCURL);
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

	public static class InstructionContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(AksaraParser.PRIVATE, 0); }
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
		enterRule(_localctx, 20, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(PRIVATE);
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
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AksaraParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AksaraParser.NL, i);
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
		enterRule(_localctx, 22, RULE_methodBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			instruction();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NL) {
						{
						{
						setState(177);
						match(NL);
						}
						}
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(183);
					instruction();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 24, RULE_classBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(189);
				fieldDeclaration();
				}
				break;
			case 2:
				{
				setState(190);
				methodDeclaration();
				}
				break;
			}
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					semi();
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(194);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(195);
						methodDeclaration();
						}
						break;
					}
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 26, RULE_identifier);
		int _la;
		try {
			int _alt;
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANG:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				simpleIdentifier();
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(204);
							match(NL);
							}
							}
							setState(209);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(210);
						match(DOT);
						setState(211);
						simpleIdentifier();
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
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
		enterRule(_localctx, 28, RULE_simpleIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANG) {
				{
				setState(220);
				match(LANG);
				}
			}

			setState(223);
			match(Identifier);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANG) {
				{
				setState(224);
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
		enterRule(_localctx, 30, RULE_arrayIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			identifier();
			setState(228);
			match(LSQUARE);
			setState(229);
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
		enterRule(_localctx, 32, RULE_type);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				arrayIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
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
		enterRule(_localctx, 34, RULE_stringLiteral);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
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
		enterRule(_localctx, 36, RULE_lineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(QUOTE_OPEN);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineStrText || _la==LineStrEscapedChar) {
				{
				{
				setState(241);
				lineStringContent();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
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
		enterRule(_localctx, 38, RULE_lineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		enterRule(_localctx, 40, RULE_multiLineStringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(TRIPLE_QUOTE_OPEN);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (QUOTE_OPEN - 42)) | (1L << (MultiLineStrText - 42)) | (1L << (MultiLineStrEscapedChar - 42)))) != 0)) {
				{
				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(252);
					multiLineStringContent();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(253);
					lineStringLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
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
		enterRule(_localctx, 42, RULE_multiLineStringContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 44, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				modifier();
				}
				}
				setState(266); 
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
		enterRule(_localctx, 46, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0111\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\5\2E\n\2\3\3\3\3\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4"+
		"\7\4Q\n\4\f\4\16\4T\13\4\3\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\3\5\7"+
		"\5`\n\5\f\5\16\5c\13\5\3\6\3\6\3\6\5\6h\n\6\3\7\6\7k\n\7\r\7\16\7l\3\b"+
		"\3\b\3\b\3\b\7\bs\n\b\f\b\16\bv\13\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3"+
		"\b\3\b\5\b\u0081\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u008d"+
		"\n\n\f\n\16\n\u0090\13\n\5\n\u0092\n\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"\u009a\n\13\f\13\16\13\u009d\13\13\3\13\3\13\7\13\u00a1\n\13\f\13\16\13"+
		"\u00a4\13\13\3\13\3\13\7\13\u00a8\n\13\f\13\16\13\u00ab\13\13\3\13\3\13"+
		"\5\13\u00af\n\13\3\f\3\f\3\r\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\3\r"+
		"\7\r\u00bb\n\r\f\r\16\r\u00be\13\r\3\16\3\16\5\16\u00c2\n\16\3\16\3\16"+
		"\3\16\5\16\u00c7\n\16\7\16\u00c9\n\16\f\16\16\16\u00cc\13\16\3\17\3\17"+
		"\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3\17\3\17\7\17\u00d7\n\17\f\17"+
		"\16\17\u00da\13\17\3\17\5\17\u00dd\n\17\3\20\5\20\u00e0\n\20\3\20\3\20"+
		"\5\20\u00e4\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00ed\n\22\3"+
		"\23\3\23\5\23\u00f1\n\23\3\24\3\24\7\24\u00f5\n\24\f\24\16\24\u00f8\13"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u0101\n\26\f\26\16\26\u0104"+
		"\13\26\3\26\3\26\3\27\3\27\3\30\6\30\u010b\n\30\r\30\16\30\u010c\3\31"+
		"\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2"+
		"\6\4\2\6\6\13\13\3\2CD\3\2GH\3\2\25+\2\u011c\2D\3\2\2\2\4F\3\2\2\2\6K"+
		"\3\2\2\2\ba\3\2\2\2\nd\3\2\2\2\fj\3\2\2\2\16n\3\2\2\2\20\u0082\3\2\2\2"+
		"\22\u0087\3\2\2\2\24\u0095\3\2\2\2\26\u00b0\3\2\2\2\30\u00b2\3\2\2\2\32"+
		"\u00c1\3\2\2\2\34\u00dc\3\2\2\2\36\u00df\3\2\2\2 \u00e5\3\2\2\2\"\u00ec"+
		"\3\2\2\2$\u00f0\3\2\2\2&\u00f2\3\2\2\2(\u00fb\3\2\2\2*\u00fd\3\2\2\2,"+
		"\u0107\3\2\2\2.\u010a\3\2\2\2\60\u010e\3\2\2\2\62\64\7\6\2\2\63\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66E\3\2\2\2\679\7\6\2\2"+
		"8\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=A\7\13"+
		"\2\2>@\7\6\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2"+
		"\2\2D\63\3\2\2\2D:\3\2\2\2E\3\3\2\2\2FG\t\2\2\2G\5\3\2\2\2HJ\7\6\2\2I"+
		"H\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NR\5\b\5\2"+
		"OQ\5\4\3\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2"+
		"UY\5\f\7\2VX\7\6\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2"+
		"\2[Y\3\2\2\2\\]\7\2\2\3]\7\3\2\2\2^`\5\n\6\2_^\3\2\2\2`c\3\2\2\2a_\3\2"+
		"\2\2ab\3\2\2\2b\t\3\2\2\2ca\3\2\2\2de\7\24\2\2eg\5\34\17\2fh\5\2\2\2g"+
		"f\3\2\2\2gh\3\2\2\2h\13\3\2\2\2ik\5\16\b\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2m\r\3\2\2\2no\5.\30\2o\u0080\5\"\22\2pt\7\20\2\2qs\7\6\2\2"+
		"rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2w{\5\32\16"+
		"\2xz\7\6\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2"+
		"\2~\177\7\21\2\2\177\u0081\3\2\2\2\u0080p\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\17\3\2\2\2\u0082\u0083\5.\30\2\u0083\u0084\5\34\17\2\u0084\u0085"+
		"\7\n\2\2\u0085\u0086\5\"\22\2\u0086\21\3\2\2\2\u0087\u0088\5\"\22\2\u0088"+
		"\u0091\7\f\2\2\u0089\u008e\5\"\22\2\u008a\u008b\7\b\2\2\u008b\u008d\5"+
		"\"\22\2\u008c\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0089\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\r\2\2\u0094"+
		"\23\3\2\2\2\u0095\u0096\5.\30\2\u0096\u0097\5\34\17\2\u0097\u00ae\5\22"+
		"\n\2\u0098\u009a\7\6\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u00a2\7\20\2\2\u009f\u00a1\7\6\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a9\5\30\r\2\u00a6\u00a8\7\6\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\21\2\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u009b\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\25\3\2\2"+
		"\2\u00b0\u00b1\7\26\2\2\u00b1\27\3\2\2\2\u00b2\u00bc\5\26\f\2\u00b3\u00b5"+
		"\7\6\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\5\26"+
		"\f\2\u00ba\u00b6\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\31\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\5\20\t"+
		"\2\u00c0\u00c2\5\24\13\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00ca\3\2\2\2\u00c3\u00c6\5\2\2\2\u00c4\u00c7\5\20\t\2\u00c5\u00c7\5"+
		"\24\13\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c3\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\33\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d8\5\36\20\2\u00ce"+
		"\u00d0\7\6\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d5\7\7\2\2\u00d5\u00d7\5\36\20\2\u00d6\u00d1\3\2\2\2\u00d7\u00da\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00dd\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00dd\5&\24\2\u00dc\u00cd\3\2\2\2\u00dc\u00db\3\2"+
		"\2\2\u00dd\35\3\2\2\2\u00de\u00e0\7\22\2\2\u00df\u00de\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7\66\2\2\u00e2\u00e4\7\23\2\2"+
		"\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\37\3\2\2\2\u00e5\u00e6"+
		"\5\34\17\2\u00e6\u00e7\7\16\2\2\u00e7\u00e8\7\17\2\2\u00e8!\3\2\2\2\u00e9"+
		"\u00ed\5\34\17\2\u00ea\u00ed\5 \21\2\u00eb\u00ed\5&\24\2\u00ec\u00e9\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed#\3\2\2\2\u00ee\u00f1"+
		"\5&\24\2\u00ef\u00f1\5*\26\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"%\3\2\2\2\u00f2\u00f6\7,\2\2\u00f3\u00f5\5(\25\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7B\2\2\u00fa\'\3\2\2\2\u00fb\u00fc"+
		"\t\3\2\2\u00fc)\3\2\2\2\u00fd\u0102\7-\2\2\u00fe\u0101\5,\27\2\u00ff\u0101"+
		"\5&\24\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0105\u0106\7E\2\2\u0106+\3\2\2\2\u0107\u0108\t\4\2\2\u0108-\3\2"+
		"\2\2\u0109\u010b\5\60\31\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d/\3\2\2\2\u010e\u010f\t\5\2\2"+
		"\u010f\61\3\2\2\2%\65:ADKRYaglt{\u0080\u008e\u0091\u009b\u00a2\u00a9\u00ae"+
		"\u00b6\u00bc\u00c1\u00c6\u00ca\u00d1\u00d8\u00dc\u00df\u00e3\u00ec\u00f0"+
		"\u00f6\u0100\u0102\u010c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}