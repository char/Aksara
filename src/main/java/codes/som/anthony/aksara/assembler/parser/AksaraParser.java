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
		BooleanLiteral=55, Identifier=56, CharacterLiteral=57, EscapedCharacterLiteral=58, 
		NOP=59, ACONST_NULL=60, ICONST_M1=61, ICONST_0=62, ICONST_1=63, ICONST_2=64, 
		ICONST_3=65, ICONST_4=66, ICONST_5=67, LCONST_0=68, LCONST_1=69, FCONST_0=70, 
		FCONST_1=71, FCONST_2=72, DCONST_0=73, DCONST_1=74, BIPUSH=75, SIPUSH=76, 
		LDC=77, LDC_W=78, LDC2_W=79, ILOAD=80, LLOAD=81, FLOAD=82, DLOAD=83, ALOAD=84, 
		IALOAD=85, LALOAD=86, FALOAD=87, DALOAD=88, AALOAD=89, BALOAD=90, CALOAD=91, 
		SALOAD=92, ISTORE=93, LSTORE=94, FSTORE=95, DSTORE=96, ASTORE=97, IASTORE=98, 
		LASTORE=99, FASTORE=100, DASTORE=101, AASTORE=102, BASTORE=103, CASTORE=104, 
		SASTORE=105, POP=106, POP2=107, DUP=108, DUP_X1=109, DUP_X2=110, DUP2=111, 
		DUP2_X1=112, DUP2_X2=113, SWAP=114, IADD=115, LADD=116, FADD=117, DADD=118, 
		ISUB=119, LSUB=120, FSUB=121, DSUB=122, IMUL=123, LMUL=124, FMUL=125, 
		DMUL=126, IDIV=127, LDIV=128, FDIV=129, DDIV=130, IREM=131, LREM=132, 
		FREM=133, DREM=134, INEG=135, LNEG=136, FNEG=137, DNEG=138, ISHL=139, 
		LSHL=140, ISHR=141, LSHR=142, IUSHR=143, LUSHR=144, IAND=145, LAND=146, 
		IOR=147, LOR=148, IXOR=149, LXOR=150, IINC=151, I2L=152, I2F=153, I2D=154, 
		L2I=155, L2F=156, L2D=157, F2I=158, F2L=159, F2D=160, D2I=161, D2L=162, 
		D2F=163, I2B=164, I2C=165, I2S=166, LCMP=167, FCMPL=168, FCMPG=169, DCMPL=170, 
		DCMPG=171, IFEQ=172, IFNE=173, IFLT=174, IFGE=175, IFGT=176, IFLE=177, 
		IF_ICMPEQ=178, IF_ICMPNE=179, IF_ICMPLT=180, IF_ICMPGE=181, IF_ICMPGT=182, 
		IF_ICMPLE=183, IF_ACMPEQ=184, IF_ACMPNE=185, GOTO=186, JSR=187, RET=188, 
		TABLESWITCH=189, LOOKUPSWITCH=190, IRETURN=191, LRETURN=192, FRETURN=193, 
		DRETURN=194, ARETURN=195, RETURN=196, GETSTATIC=197, PUTSTATIC=198, GETFIELD=199, 
		PUTFIELD=200, INVOKEVIRTUAL=201, INVOKESPECIAL=202, INVOKESTATIC=203, 
		INVOKEINTERFACE=204, INVOKEDYNAMIC=205, NEW=206, NEWARRAY=207, ANEWARRAY=208, 
		ARRAYLENGTH=209, ATHROW=210, CHECKCAST=211, INSTANCEOF=212, MONITORENTER=213, 
		MONITOREXIT=214, MULTIANEWARRAY=215, IFNULL=216, IFNONNULL=217, SimpleInstruction=218, 
		ImmediateIntPushInstruction=219, UNICODE_CLASS_LL=220, UNICODE_CLASS_LM=221, 
		UNICODE_CLASS_LO=222, UNICODE_CLASS_LT=223, UNICODE_CLASS_LU=224, UNICODE_CLASS_ND=225, 
		UNICODE_CLASS_NL=226, Inside_Comment=227, Inside_WS=228, Inside_NL=229, 
		QUOTE_CLOSE=230, LineStrText=231, LineStrEscapedChar=232, TRIPLE_QUOTE_CLOSE=233, 
		MultiLineStringQuote=234, MultiLineStrText=235, MultiLineStrEscapedChar=236, 
		MultiLineNL=237;
	public static final int
		RULE_semi = 0, RULE_anysemi = 1, RULE_aksaraFile = 2, RULE_importList = 3, 
		RULE_importHeader = 4, RULE_classDeclarations = 5, RULE_classDeclaration = 6, 
		RULE_fieldDeclaration = 7, RULE_methodSignature = 8, RULE_methodDeclaration = 9, 
		RULE_instruction = 10, RULE_methodBody = 11, RULE_classBody = 12, RULE_identifier = 13, 
		RULE_simpleIdentifier = 14, RULE_arrayIdentifier = 15, RULE_type = 16, 
		RULE_stringLiteral = 17, RULE_lineStringLiteral = 18, RULE_lineStringContent = 19, 
		RULE_multiLineStringLiteral = 20, RULE_multiLineStringContent = 21, RULE_modifierList = 22, 
		RULE_modifier = 23, RULE_intLiteral = 24, RULE_longLiteral = 25, RULE_floatLiteral = 26, 
		RULE_doubleLiteral = 27, RULE_characterLiteral = 28, RULE_literal = 29, 
		RULE_annotationList = 30, RULE_annotationType = 31, RULE_annotationArgument = 32, 
		RULE_annotation = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"semi", "anysemi", "aksaraFile", "importList", "importHeader", "classDeclarations", 
			"classDeclaration", "fieldDeclaration", "methodSignature", "methodDeclaration", 
			"instruction", "methodBody", "classBody", "identifier", "simpleIdentifier", 
			"arrayIdentifier", "type", "stringLiteral", "lineStringLiteral", "lineStringContent", 
			"multiLineStringLiteral", "multiLineStringContent", "modifierList", "modifier", 
			"intLiteral", "longLiteral", "floatLiteral", "doubleLiteral", "characterLiteral", 
			"literal", "annotationList", "annotationType", "annotationArgument", 
			"annotation"
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
			"'enum'", "'mandated'", "'module'", null, "'\"\"\"'", "'F'", "'L'", "'D'", 
			null, null, null, null, null, null, null, null, "'nop'", "'aconst_null'", 
			"'iconst_m1'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", 
			"'iconst_4'", "'iconst_5'", "'lconst_0'", "'lconst_1'", "'fconst_0'", 
			"'fconst_1'", "'fconst_2'", "'dconst_0'", "'dconst_1'", "'bipush'", "'sipush'", 
			"'ldc'", "'ldc_w'", "'ldc2_w'", "'iload'", "'lload'", "'fload'", "'dload'", 
			"'aload'", "'iaload'", "'laload'", "'faload'", "'daload'", "'aaload'", 
			"'baload'", "'caload'", "'saload'", "'istore'", "'lstore'", "'fstore'", 
			"'dstore'", "'astore'", "'iastore'", "'lastore'", "'fastore'", "'dastore'", 
			"'aastore'", "'bastore'", "'castore'", "'sastore'", "'pop'", "'pop2'", 
			"'dup'", "'dup_x1'", "'dup_x2'", "'dup2'", "'dup2_x1'", "'dup2_x2'", 
			"'swap'", "'iadd'", "'ladd'", "'fadd'", "'dadd'", "'isub'", "'lsub'", 
			"'fsub'", "'dsub'", "'imul'", "'lmul'", "'fmul'", "'dmul'", "'idiv'", 
			"'ldiv'", "'fdiv'", "'ddiv'", "'irem'", "'lrem'", "'frem'", "'drem'", 
			"'ineg'", "'lneg'", "'fneg'", "'dneg'", "'ishl'", "'lshl'", "'ishr'", 
			"'lshr'", "'iushr'", "'lushr'", "'iand'", "'land'", "'ior'", "'lor'", 
			"'ixor'", "'lxor'", "'iinc'", "'i2l'", "'i2f'", "'i2d'", "'l2i'", "'l2f'", 
			"'l2d'", "'f2i'", "'f2l'", "'f2d'", "'d2i'", "'d2l'", "'d2f'", "'i2b'", 
			"'i2c'", "'i2s'", "'lcmp'", "'fcmpl'", "'fcmpg'", "'dcmpl'", "'dcmpg'", 
			"'ifeq'", "'ifne'", "'iflt'", "'ifge'", "'ifgt'", "'ifle'", "'if_icmpeq'", 
			"'if_icmpne'", "'if_icmplt'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", 
			"'if_acmpeq'", "'if_acmpne'", "'goto'", "'jsr'", "'ret'", "'tableswitch'", 
			"'lookupswitch'", "'ireturn'", "'lreturn'", "'freturn'", "'dreturn'", 
			"'areturn'", "'return'", "'getstatic'", "'putstatic'", "'getfield'", 
			"'putfield'", "'invokevirtual'", "'invokespecial'", "'invokestatic'", 
			"'invokeinterface'", "'invokedynamic'", "'new'", "'newarray'", "'anewarray'", 
			"'arraylength'", "'athrow'", "'checkcast'", "'instanceof'", "'monitorenter'", 
			"'monitorexit'", "'multianewarray'", "'ifnull'", "'ifnonnull'"
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
			"Identifier", "CharacterLiteral", "EscapedCharacterLiteral", "NOP", "ACONST_NULL", 
			"ICONST_M1", "ICONST_0", "ICONST_1", "ICONST_2", "ICONST_3", "ICONST_4", 
			"ICONST_5", "LCONST_0", "LCONST_1", "FCONST_0", "FCONST_1", "FCONST_2", 
			"DCONST_0", "DCONST_1", "BIPUSH", "SIPUSH", "LDC", "LDC_W", "LDC2_W", 
			"ILOAD", "LLOAD", "FLOAD", "DLOAD", "ALOAD", "IALOAD", "LALOAD", "FALOAD", 
			"DALOAD", "AALOAD", "BALOAD", "CALOAD", "SALOAD", "ISTORE", "LSTORE", 
			"FSTORE", "DSTORE", "ASTORE", "IASTORE", "LASTORE", "FASTORE", "DASTORE", 
			"AASTORE", "BASTORE", "CASTORE", "SASTORE", "POP", "POP2", "DUP", "DUP_X1", 
			"DUP_X2", "DUP2", "DUP2_X1", "DUP2_X2", "SWAP", "IADD", "LADD", "FADD", 
			"DADD", "ISUB", "LSUB", "FSUB", "DSUB", "IMUL", "LMUL", "FMUL", "DMUL", 
			"IDIV", "LDIV", "FDIV", "DDIV", "IREM", "LREM", "FREM", "DREM", "INEG", 
			"LNEG", "FNEG", "DNEG", "ISHL", "LSHL", "ISHR", "LSHR", "IUSHR", "LUSHR", 
			"IAND", "LAND", "IOR", "LOR", "IXOR", "LXOR", "IINC", "I2L", "I2F", "I2D", 
			"L2I", "L2F", "L2D", "F2I", "F2L", "F2D", "D2I", "D2L", "D2F", "I2B", 
			"I2C", "I2S", "LCMP", "FCMPL", "FCMPG", "DCMPL", "DCMPG", "IFEQ", "IFNE", 
			"IFLT", "IFGE", "IFGT", "IFLE", "IF_ICMPEQ", "IF_ICMPNE", "IF_ICMPLT", 
			"IF_ICMPGE", "IF_ICMPGT", "IF_ICMPLE", "IF_ACMPEQ", "IF_ACMPNE", "GOTO", 
			"JSR", "RET", "TABLESWITCH", "LOOKUPSWITCH", "IRETURN", "LRETURN", "FRETURN", 
			"DRETURN", "ARETURN", "RETURN", "GETSTATIC", "PUTSTATIC", "GETFIELD", 
			"PUTFIELD", "INVOKEVIRTUAL", "INVOKESPECIAL", "INVOKESTATIC", "INVOKEINTERFACE", 
			"INVOKEDYNAMIC", "NEW", "NEWARRAY", "ANEWARRAY", "ARRAYLENGTH", "ATHROW", 
			"CHECKCAST", "INSTANCEOF", "MONITORENTER", "MONITOREXIT", "MULTIANEWARRAY", 
			"IFNULL", "IFNONNULL", "SimpleInstruction", "ImmediateIntPushInstruction", 
			"UNICODE_CLASS_LL", "UNICODE_CLASS_LM", "UNICODE_CLASS_LO", "UNICODE_CLASS_LT", 
			"UNICODE_CLASS_LU", "UNICODE_CLASS_ND", "UNICODE_CLASS_NL", "Inside_Comment", 
			"Inside_WS", "Inside_NL", "QUOTE_CLOSE", "LineStrText", "LineStrEscapedChar", 
			"TRIPLE_QUOTE_CLOSE", "MultiLineStringQuote", "MultiLineStrText", "MultiLineStrEscapedChar", 
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(68);
						match(NL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(71); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(73);
					match(NL);
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				match(SEMICOLON);
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(80);
						match(NL);
						}
						} 
					}
					setState(85);
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
			setState(88);
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
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(NL);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(96);
			importList();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL || _la==SEMICOLON) {
				{
				{
				setState(97);
				anysemi();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			classDeclarations();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(104);
				match(NL);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
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
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(112);
				importHeader();
				}
				}
				setState(117);
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
			setState(118);
			match(IMPORT);
			setState(119);
			identifier();
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(120);
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
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				classDeclaration();
				}
				}
				setState(126); 
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
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_SYMBOL) {
				{
				setState(128);
				annotationList();
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					match(NL);
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
			}

			setState(136);
			modifierList();
			setState(137);
			type();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCURL) {
				{
				setState(138);
				match(LCURL);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(139);
					match(NL);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				classBody();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(146);
					match(NL);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
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
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_SYMBOL) {
				{
				setState(156);
				annotationList();
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					match(NL);
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
			}

			setState(164);
			modifierList();
			setState(165);
			identifier();
			setState(166);
			match(COLON);
			setState(167);
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
			setState(169);
			type();
			setState(170);
			match(LPAREN);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LANG) | (1L << QUOTE_OPEN) | (1L << Identifier))) != 0)) {
				{
				setState(171);
				type();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(172);
					match(COMMA);
					setState(173);
					type();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(181);
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
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_SYMBOL) {
				{
				setState(183);
				annotationList();
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					match(NL);
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NL );
				}
			}

			setState(191);
			modifierList();
			setState(192);
			identifier();
			setState(193);
			methodSignature();
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(194);
					match(NL);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(LCURL);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(201);
					match(NL);
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				methodBody();
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NL) {
					{
					{
					setState(208);
					match(NL);
					}
					}
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(214);
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
		public TerminalNode SimpleInstruction() { return getToken(AksaraParser.SimpleInstruction, 0); }
		public TerminalNode ImmediateIntPushInstruction() { return getToken(AksaraParser.ImmediateIntPushInstruction, 0); }
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SimpleInstruction:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(SimpleInstruction);
				}
				break;
			case ImmediateIntPushInstruction:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(219);
				match(ImmediateIntPushInstruction);
				setState(220);
				intLiteral();
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

	public static class MethodBodyContext extends ParserRuleContext {
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			instruction();
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					semi();
					setState(225);
					instruction();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(232);
				fieldDeclaration();
				}
				break;
			case 2:
				{
				setState(233);
				methodDeclaration();
				}
				break;
			}
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					semi();
					setState(239);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(237);
						fieldDeclaration();
						}
						break;
					case 2:
						{
						setState(238);
						methodDeclaration();
						}
						break;
					}
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANG:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				simpleIdentifier();
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NL) {
							{
							{
							setState(247);
							match(NL);
							}
							}
							setState(252);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(253);
						match(DOT);
						setState(254);
						simpleIdentifier();
						}
						} 
					}
					setState(259);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
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
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANG) {
				{
				setState(263);
				match(LANG);
				}
			}

			setState(266);
			match(Identifier);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANG) {
				{
				setState(267);
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
			setState(270);
			identifier();
			setState(271);
			match(LSQUARE);
			setState(272);
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
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				arrayIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
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
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				lineStringLiteral();
				}
				break;
			case TRIPLE_QUOTE_OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
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
			setState(283);
			match(QUOTE_OPEN);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LineStrText || _la==LineStrEscapedChar) {
				{
				{
				setState(284);
				lineStringContent();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
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
			setState(292);
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
			setState(294);
			match(TRIPLE_QUOTE_OPEN);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QUOTE_OPEN || _la==MultiLineStrText || _la==MultiLineStrEscapedChar) {
				{
				setState(297);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MultiLineStrText:
				case MultiLineStrEscapedChar:
					{
					setState(295);
					multiLineStringContent();
					}
					break;
				case QUOTE_OPEN:
					{
					setState(296);
					lineStringLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
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
			setState(304);
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
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				modifier();
				}
				}
				setState(309); 
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
			setState(311);
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
		enterRule(_localctx, 48, RULE_intLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
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
		enterRule(_localctx, 50, RULE_longLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << HexLiteral) | (1L << BinLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(316);
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
		enterRule(_localctx, 52, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==RealLiteral || _la==IntegerLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(319);
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
		enterRule(_localctx, 54, RULE_doubleLiteral);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RealLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(RealLiteral);
				}
				break;
			case IntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(322);
				match(IntegerLiteral);
				setState(323);
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
		enterRule(_localctx, 56, RULE_characterLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
		enterRule(_localctx, 58, RULE_literal);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				intLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				longLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				floatLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				doubleLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(333);
				characterLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(334);
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
		enterRule(_localctx, 60, RULE_annotationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			annotation();
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					anysemi();
					setState(339);
					annotation();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		enterRule(_localctx, 62, RULE_annotationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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
		enterRule(_localctx, 64, RULE_annotationArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			identifier();
			setState(349);
			match(EQUALS);
			setState(350);
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
		enterRule(_localctx, 66, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(AT_SYMBOL);
			setState(353);
			type();
			setState(354);
			match(LPAREN);
			setState(355);
			annotationType();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				annotationArgument();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ef\u0170\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\6\2H\n\2\r\2\16\2I\3\2\7\2M\n\2\f\2\16\2P\13\2\3"+
		"\2\3\2\7\2T\n\2\f\2\16\2W\13\2\5\2Y\n\2\3\3\3\3\3\4\7\4^\n\4\f\4\16\4"+
		"a\13\4\3\4\3\4\7\4e\n\4\f\4\16\4h\13\4\3\4\3\4\7\4l\n\4\f\4\16\4o\13\4"+
		"\3\4\3\4\3\5\7\5t\n\5\f\5\16\5w\13\5\3\6\3\6\3\6\5\6|\n\6\3\7\6\7\177"+
		"\n\7\r\7\16\7\u0080\3\b\3\b\6\b\u0085\n\b\r\b\16\b\u0086\5\b\u0089\n\b"+
		"\3\b\3\b\3\b\3\b\7\b\u008f\n\b\f\b\16\b\u0092\13\b\3\b\3\b\7\b\u0096\n"+
		"\b\f\b\16\b\u0099\13\b\3\b\3\b\5\b\u009d\n\b\3\t\3\t\6\t\u00a1\n\t\r\t"+
		"\16\t\u00a2\5\t\u00a5\n\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00b1\n\n\f\n\16\n\u00b4\13\n\5\n\u00b6\n\n\3\n\3\n\3\13\3\13\6\13\u00bc"+
		"\n\13\r\13\16\13\u00bd\5\13\u00c0\n\13\3\13\3\13\3\13\3\13\7\13\u00c6"+
		"\n\13\f\13\16\13\u00c9\13\13\3\13\3\13\7\13\u00cd\n\13\f\13\16\13\u00d0"+
		"\13\13\3\13\3\13\7\13\u00d4\n\13\f\13\16\13\u00d7\13\13\3\13\3\13\5\13"+
		"\u00db\n\13\3\f\3\f\3\f\5\f\u00e0\n\f\3\r\3\r\3\r\3\r\7\r\u00e6\n\r\f"+
		"\r\16\r\u00e9\13\r\3\16\3\16\5\16\u00ed\n\16\3\16\3\16\3\16\5\16\u00f2"+
		"\n\16\7\16\u00f4\n\16\f\16\16\16\u00f7\13\16\3\17\3\17\7\17\u00fb\n\17"+
		"\f\17\16\17\u00fe\13\17\3\17\3\17\7\17\u0102\n\17\f\17\16\17\u0105\13"+
		"\17\3\17\5\17\u0108\n\17\3\20\5\20\u010b\n\20\3\20\3\20\5\20\u010f\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0118\n\22\3\23\3\23\5\23\u011c"+
		"\n\23\3\24\3\24\7\24\u0120\n\24\f\24\16\24\u0123\13\24\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\7\26\u012c\n\26\f\26\16\26\u012f\13\26\3\26\3\26"+
		"\3\27\3\27\3\30\6\30\u0136\n\30\r\30\16\30\u0137\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u0147\n\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0152\n\37\3 \3 \3 \3 \7 \u0158"+
		"\n \f \16 \u015b\13 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\7#\u0169"+
		"\n#\f#\16#\u016c\13#\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BD\2\n\4\2\6\6\13\13\3\2\u00e9\u00ea\3\2"+
		"\u00ed\u00ee\3\2\31/\3\2\668\3\2\65\66\3\2;<\3\2\27\30\2\u0180\2X\3\2"+
		"\2\2\4Z\3\2\2\2\6_\3\2\2\2\bu\3\2\2\2\nx\3\2\2\2\f~\3\2\2\2\16\u0088\3"+
		"\2\2\2\20\u00a4\3\2\2\2\22\u00ab\3\2\2\2\24\u00bf\3\2\2\2\26\u00df\3\2"+
		"\2\2\30\u00e1\3\2\2\2\32\u00ec\3\2\2\2\34\u0107\3\2\2\2\36\u010a\3\2\2"+
		"\2 \u0110\3\2\2\2\"\u0117\3\2\2\2$\u011b\3\2\2\2&\u011d\3\2\2\2(\u0126"+
		"\3\2\2\2*\u0128\3\2\2\2,\u0132\3\2\2\2.\u0135\3\2\2\2\60\u0139\3\2\2\2"+
		"\62\u013b\3\2\2\2\64\u013d\3\2\2\2\66\u0140\3\2\2\28\u0146\3\2\2\2:\u0148"+
		"\3\2\2\2<\u0151\3\2\2\2>\u0153\3\2\2\2@\u015c\3\2\2\2B\u015e\3\2\2\2D"+
		"\u0162\3\2\2\2FH\7\6\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JY\3\2"+
		"\2\2KM\7\6\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2"+
		"\2\2QU\7\13\2\2RT\7\6\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3"+
		"\2\2\2WU\3\2\2\2XG\3\2\2\2XN\3\2\2\2Y\3\3\2\2\2Z[\t\2\2\2[\5\3\2\2\2\\"+
		"^\7\6\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2"+
		"bf\5\b\5\2ce\5\4\3\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2"+
		"hf\3\2\2\2im\5\f\7\2jl\7\6\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2"+
		"np\3\2\2\2om\3\2\2\2pq\7\2\2\3q\7\3\2\2\2rt\5\n\6\2sr\3\2\2\2tw\3\2\2"+
		"\2us\3\2\2\2uv\3\2\2\2v\t\3\2\2\2wu\3\2\2\2xy\7\26\2\2y{\5\34\17\2z|\5"+
		"\2\2\2{z\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}\177\5\16\b\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u0084"+
		"\5> \2\u0083\u0085\7\6\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0082\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5.\30\2\u008b"+
		"\u009c\5\"\22\2\u008c\u0090\7\21\2\2\u008d\u008f\7\6\2\2\u008e\u008d\3"+
		"\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0097\5\32\16\2\u0094\u0096\7"+
		"\6\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\22"+
		"\2\2\u009b\u009d\3\2\2\2\u009c\u008c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\17\3\2\2\2\u009e\u00a0\5> \2\u009f\u00a1\7\6\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\5.\30\2\u00a7\u00a8\5\34\17\2\u00a8\u00a9\7\n\2\2\u00a9\u00aa\5"+
		"\"\22\2\u00aa\21\3\2\2\2\u00ab\u00ac\5\"\22\2\u00ac\u00b5\7\r\2\2\u00ad"+
		"\u00b2\5\"\22\2\u00ae\u00af\7\b\2\2\u00af\u00b1\5\"\22\2\u00b0\u00ae\3"+
		"\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\16\2\2\u00b8\23\3\2\2\2\u00b9\u00bb"+
		"\5> \2\u00ba\u00bc\7\6\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b9\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5.\30\2\u00c2"+
		"\u00c3\5\34\17\2\u00c3\u00da\5\22\n\2\u00c4\u00c6\7\6\2\2\u00c5\u00c4"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00ce\7\21\2\2\u00cb\u00cd\7"+
		"\6\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d5\5\30"+
		"\r\2\u00d2\u00d4\7\6\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d8\u00d9\7\22\2\2\u00d9\u00db\3\2\2\2\u00da\u00c7\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\25\3\2\2\2\u00dc\u00e0\7\u00dc\2\2\u00dd\u00de\7"+
		"\u00dd\2\2\u00de\u00e0\5\62\32\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2"+
		"\2\u00e0\27\3\2\2\2\u00e1\u00e7\5\26\f\2\u00e2\u00e3\5\2\2\2\u00e3\u00e4"+
		"\5\26\f\2\u00e4\u00e6\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00e9\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\31\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00ed\5\20\t\2\u00eb\u00ed\5\24\13\2\u00ec\u00ea\3\2\2"+
		"\2\u00ec\u00eb\3\2\2\2\u00ed\u00f5\3\2\2\2\u00ee\u00f1\5\2\2\2\u00ef\u00f2"+
		"\5\20\t\2\u00f0\u00f2\5\24\13\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2"+
		"\2\u00f2\u00f4\3\2\2\2\u00f3\u00ee\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\33\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u0103\5\36\20\2\u00f9\u00fb\7\6\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0100\7\7\2\2\u0100\u0102\5\36\20\2\u0101\u00fc\3"+
		"\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0108\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5&\24\2\u0107\u00f8\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\35\3\2\2\2\u0109\u010b\7\23\2\2\u010a\u0109"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\7:\2\2\u010d"+
		"\u010f\7\24\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\37\3\2\2"+
		"\2\u0110\u0111\5\34\17\2\u0111\u0112\7\17\2\2\u0112\u0113\7\20\2\2\u0113"+
		"!\3\2\2\2\u0114\u0118\5\34\17\2\u0115\u0118\5 \21\2\u0116\u0118\5&\24"+
		"\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118#"+
		"\3\2\2\2\u0119\u011c\5&\24\2\u011a\u011c\5*\26\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011a\3\2\2\2\u011c%\3\2\2\2\u011d\u0121\7\60\2\2\u011e\u0120\5(\25\2"+
		"\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7\u00e8\2"+
		"\2\u0125\'\3\2\2\2\u0126\u0127\t\3\2\2\u0127)\3\2\2\2\u0128\u012d\7\61"+
		"\2\2\u0129\u012c\5,\27\2\u012a\u012c\5&\24\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u0130\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\u00eb\2\2\u0131"+
		"+\3\2\2\2\u0132\u0133\t\4\2\2\u0133-\3\2\2\2\u0134\u0136\5\60\31\2\u0135"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138/\3\2\2\2\u0139\u013a\t\5\2\2\u013a\61\3\2\2\2\u013b\u013c\t"+
		"\6\2\2\u013c\63\3\2\2\2\u013d\u013e\t\6\2\2\u013e\u013f\7\63\2\2\u013f"+
		"\65\3\2\2\2\u0140\u0141\t\7\2\2\u0141\u0142\7\62\2\2\u0142\67\3\2\2\2"+
		"\u0143\u0147\7\65\2\2\u0144\u0145\7\66\2\2\u0145\u0147\7\64\2\2\u0146"+
		"\u0143\3\2\2\2\u0146\u0144\3\2\2\2\u01479\3\2\2\2\u0148\u0149\t\b\2\2"+
		"\u0149;\3\2\2\2\u014a\u0152\5$\23\2\u014b\u0152\5\62\32\2\u014c\u0152"+
		"\5\64\33\2\u014d\u0152\5\66\34\2\u014e\u0152\58\35\2\u014f\u0152\5:\36"+
		"\2\u0150\u0152\5\"\22\2\u0151\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151"+
		"\u014c\3\2\2\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0151\u0150\3\2\2\2\u0152=\3\2\2\2\u0153\u0159\5D#\2\u0154\u0155"+
		"\5\4\3\2\u0155\u0156\5D#\2\u0156\u0158\3\2\2\2\u0157\u0154\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a?\3\2\2\2"+
		"\u015b\u0159\3\2\2\2\u015c\u015d\t\t\2\2\u015dA\3\2\2\2\u015e\u015f\5"+
		"\34\17\2\u015f\u0160\7\f\2\2\u0160\u0161\5<\37\2\u0161C\3\2\2\2\u0162"+
		"\u0163\7\25\2\2\u0163\u0164\5\"\22\2\u0164\u0165\7\r\2\2\u0165\u016a\5"+
		"@!\2\u0166\u0167\7\b\2\2\u0167\u0169\5B\"\2\u0168\u0166\3\2\2\2\u0169"+
		"\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2"+
		"\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7\16\2\2\u016eE\3\2\2\2/INUX_fmu"+
		"{\u0080\u0086\u0088\u0090\u0097\u009c\u00a2\u00a4\u00b2\u00b5\u00bd\u00bf"+
		"\u00c7\u00ce\u00d5\u00da\u00df\u00e7\u00ec\u00f1\u00f5\u00fc\u0103\u0107"+
		"\u010a\u010e\u0117\u011b\u0121\u012b\u012d\u0137\u0146\u0151\u0159\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}