lexer grammar AksaraLexer;

import UnicodeClasses;

DelimitedComment
    : '/*' ( DelimitedComment | . )*? '*/'
      -> channel(HIDDEN)
    ;

LineComment
    : '//' ~[\u000A\u000D]*
      -> channel(HIDDEN)
    ;

WS
    : [\u0020\u0009\u000C]
      -> skip
    ;

NL: '\u000A' | '\u000D' '\u000A' ;

// SEPARATORS & OPERATIONS

DOT: '.' ;
COMMA: ',' ;
SINGLE_QUOTE: '\'' ;
COLON: ':' ;
SEMICOLON: ';' ;
EQUALS: '=' ;

LPAREN: '(' -> pushMode(Inside) ;
RPAREN: ')' ;
LSQUARE: '[' -> pushMode(Inside) ;
RSQUARE: ']' ;
LCURL: '{' ;
RCURL: '}' ;
LANG: '<' ;
RANG: '>' ;
AT_SYMBOL: '@' ;

// KEYWORDS

IMPORT: 'import' ;
BINARY: 'BINARY' ;
RUNTIME: 'RUNTIME' ;

// ACCESS MODIFIERS

PUBLIC: 'public' ;
PRIVATE: 'private' ;
PROTECTED: 'protected' ;
STATIC: 'static' ;
FINAL: 'final' ;
SUPER: 'super' ;
SYNCHRONIZED: 'synchronized' ;
OPEN: 'open' ;
TRANSITIVE: 'transitive' ;
VOLATILE: 'volatile' ;
BRIDGE: 'bridge' ;
STATIC_PHASE: 'static_phase' ;
VARARGS: 'varargs' ;
TRANSIENT: 'transient' ;
NATIVE: 'native' ;
INTERFACE: 'interface' ;
ABSTRACT: 'abstract' ;
STRICT: 'strict' ;
SYNTHETIC: 'synthetic' ;
ANNOTATION: 'annotation' ;
ENUM: 'enum' ;
MANDATED: 'mandated' ;
MODULE: 'module' ;

// LITERALS

QUOTE_OPEN: '"' -> pushMode(LineString) ;
TRIPLE_QUOTE_OPEN: '"""' -> pushMode(MultiLineString) ;

FLOAT_TRAILER: 'F' ;
LONG_TRAILER: 'L' ;
DOUBLE_TRAILER: 'D' ;

RealLiteral
    : ( (DecDigitNoZero DecDigit*)? '.'
      | (DecDigitNoZero (DecDigit | '_')* DecDigit)? '.')
     ( DecDigit+
      | DecDigit (DecDigit | '_')+ DecDigit
      | DecDigit+ [eE] ('+' | '-')? DecDigit+
      | DecDigit+ [eE] ('+' | '-')? DecDigit (DecDigit | '_')+ DecDigit
      | DecDigit (DecDigit | '_')+ DecDigit [eE] ('+' | '-')? DecDigit+
      | DecDigit (DecDigit | '_')+ DecDigit [eE] ('+' | '-')? DecDigit (DecDigit | '_')+ DecDigit
     )
    ;

IntegerLiteral
    : ('0'
      | DecDigitNoZero DecDigit*
      | DecDigitNoZero (DecDigit | '_')+ DecDigit
      | DecDigitNoZero DecDigit* [eE] ('+' | '-')? DecDigit+
      | DecDigitNoZero DecDigit* [eE] ('+' | '-')? DecDigit (DecDigit | '_')+ DecDigit
      | DecDigitNoZero (DecDigit | '_')+ DecDigit [eE] ('+' | '-')? DecDigit+
      | DecDigitNoZero (DecDigit | '_')+ DecDigit [eE] ('+' | '-')? DecDigit (DecDigit | '_')+ DecDigit
      )
    ;

fragment DecDigit
    : UNICODE_CLASS_ND
    ;

fragment DecDigitNoZero
    : UNICODE_CLASS_ND_NoZeros
    ;

fragment UNICODE_CLASS_ND_NoZeros
	: '\u0031'..'\u0039'
	| '\u0661'..'\u0669'
	| '\u06f1'..'\u06f9'
	| '\u07c1'..'\u07c9'
	| '\u0967'..'\u096f'
	| '\u09e7'..'\u09ef'
	| '\u0a67'..'\u0a6f'
	| '\u0ae7'..'\u0aef'
	| '\u0b67'..'\u0b6f'
	| '\u0be7'..'\u0bef'
	| '\u0c67'..'\u0c6f'
	| '\u0ce7'..'\u0cef'
	| '\u0d67'..'\u0d6f'
	| '\u0de7'..'\u0def'
	| '\u0e51'..'\u0e59'
	| '\u0ed1'..'\u0ed9'
	| '\u0f21'..'\u0f29'
	| '\u1041'..'\u1049'
	| '\u1091'..'\u1099'
	| '\u17e1'..'\u17e9'
	| '\u1811'..'\u1819'
	| '\u1947'..'\u194f'
	| '\u19d1'..'\u19d9'
	| '\u1a81'..'\u1a89'
	| '\u1a91'..'\u1a99'
	| '\u1b51'..'\u1b59'
	| '\u1bb1'..'\u1bb9'
	| '\u1c41'..'\u1c49'
	| '\u1c51'..'\u1c59'
	| '\ua621'..'\ua629'
	| '\ua8d1'..'\ua8d9'
	| '\ua901'..'\ua909'
	| '\ua9d1'..'\ua9d9'
	| '\ua9f1'..'\ua9f9'
	| '\uaa51'..'\uaa59'
	| '\uabf1'..'\uabf9'
	| '\uff11'..'\uff19'
	;

HexLiteral
    : '0' [xX] HexDigit (HexDigit | '_')*
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

BinLiteral
    : '0' [bB] BinDigit (BinDigit | '_')*
    ;

fragment BinDigit
    : [01]
    ;

BooleanLiteral
    : 'true'
    | 'false'
    ;


CharacterLiteral
    : SINGLE_QUOTE (.) SINGLE_QUOTE
    ;

EscapedCharacterLiteral
    : SINGLE_QUOTE EscapeSeq SINGLE_QUOTE
    ;

fragment EscapeSeq
    : UniCharacterLiteral
    | EscapedIdentifier
    ;

fragment UniCharacterLiteral
    : '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment EscapedIdentifier
    : '\\' ('t' | 'b' | 'r' | 'n' | '\'' | '"' | '\\')
    ;

fragment Letter
    : UNICODE_CLASS_LL
    | UNICODE_CLASS_LM
    | UNICODE_CLASS_LO
    | UNICODE_CLASS_LT
    | UNICODE_CLASS_LU
    | UNICODE_CLASS_NL
    ;

fragment NOP: 'nop' ;
fragment ACONST_NULL: 'aconst_null' ;
fragment ICONST_M1: 'iconst_m1' ;
fragment ICONST_0: 'iconst_0' ;
fragment ICONST_1: 'iconst_1' ;
fragment ICONST_2: 'iconst_2' ;
fragment ICONST_3: 'iconst_3' ;
fragment ICONST_4: 'iconst_4' ;
fragment ICONST_5: 'iconst_5' ;
fragment LCONST_0: 'lconst_0' ;
fragment LCONST_1: 'lconst_1' ;
fragment FCONST_0: 'fconst_0' ;
fragment FCONST_1: 'fconst_1' ;
fragment FCONST_2: 'fconst_2' ;
fragment DCONST_0: 'dconst_0' ;
fragment DCONST_1: 'dconst_1' ;
fragment BIPUSH: 'bipush' ;
fragment SIPUSH: 'sipush' ;
fragment LDC: 'ldc' ;
fragment LDC_W: 'ldc_w' ;
fragment LDC2_W: 'ldc2_w' ;
fragment ILOAD: 'iload' ;
fragment LLOAD: 'lload' ;
fragment FLOAD: 'fload' ;
fragment DLOAD: 'dload' ;
fragment ALOAD: 'aload' ;
fragment IALOAD: 'iaload' ;
fragment LALOAD: 'laload' ;
fragment FALOAD: 'faload' ;
fragment DALOAD: 'daload' ;
fragment AALOAD: 'aaload' ;
fragment BALOAD: 'baload' ;
fragment CALOAD: 'caload' ;
fragment SALOAD: 'saload' ;
fragment ISTORE: 'istore' ;
fragment LSTORE: 'lstore' ;
fragment FSTORE: 'fstore' ;
fragment DSTORE: 'dstore' ;
fragment ASTORE: 'astore' ;
fragment IASTORE: 'iastore' ;
fragment LASTORE: 'lastore' ;
fragment FASTORE: 'fastore' ;
fragment DASTORE: 'dastore' ;
fragment AASTORE: 'aastore' ;
fragment BASTORE: 'bastore' ;
fragment CASTORE: 'castore' ;
fragment SASTORE: 'sastore' ;
fragment POP: 'pop' ;
fragment POP2: 'pop2' ;
fragment DUP: 'dup' ;
fragment DUP_X1: 'dup_x1' ;
fragment DUP_X2: 'dup_x2' ;
fragment DUP2: 'dup2' ;
fragment DUP2_X1: 'dup2_x1' ;
fragment DUP2_X2: 'dup2_x2' ;
fragment SWAP: 'swap' ;
fragment IADD: 'iadd' ;
fragment LADD: 'ladd' ;
fragment FADD: 'fadd' ;
fragment DADD: 'dadd' ;
fragment ISUB: 'isub' ;
fragment LSUB: 'lsub' ;
fragment FSUB: 'fsub' ;
fragment DSUB: 'dsub' ;
fragment IMUL: 'imul' ;
fragment LMUL: 'lmul' ;
fragment FMUL: 'fmul' ;
fragment DMUL: 'dmul' ;
fragment IDIV: 'idiv' ;
fragment LDIV: 'ldiv' ;
fragment FDIV: 'fdiv' ;
fragment DDIV: 'ddiv' ;
fragment IREM: 'irem' ;
fragment LREM: 'lrem' ;
fragment FREM: 'frem' ;
fragment DREM: 'drem' ;
fragment INEG: 'ineg' ;
fragment LNEG: 'lneg' ;
fragment FNEG: 'fneg' ;
fragment DNEG: 'dneg' ;
fragment ISHL: 'ishl' ;
fragment LSHL: 'lshl' ;
fragment ISHR: 'ishr' ;
fragment LSHR: 'lshr' ;
fragment IUSHR: 'iushr' ;
fragment LUSHR: 'lushr' ;
fragment IAND: 'iand' ;
fragment LAND: 'land' ;
fragment IOR: 'ior' ;
fragment LOR: 'lor' ;
fragment IXOR: 'ixor' ;
fragment LXOR: 'lxor' ;
fragment IINC: 'iinc' ;
fragment I2L: 'i2l' ;
fragment I2F: 'i2f' ;
fragment I2D: 'i2d' ;
fragment L2I: 'l2i' ;
fragment L2F: 'l2f' ;
fragment L2D: 'l2d' ;
fragment F2I: 'f2i' ;
fragment F2L: 'f2l' ;
fragment F2D: 'f2d' ;
fragment D2I: 'd2i' ;
fragment D2L: 'd2l' ;
fragment D2F: 'd2f' ;
fragment I2B: 'i2b' ;
fragment I2C: 'i2c' ;
fragment I2S: 'i2s' ;
fragment LCMP: 'lcmp' ;
fragment FCMPL: 'fcmpl' ;
fragment FCMPG: 'fcmpg' ;
fragment DCMPL: 'dcmpl' ;
fragment DCMPG: 'dcmpg' ;
fragment IFEQ: 'ifeq' ;
fragment IFNE: 'ifne' ;
fragment IFLT: 'iflt' ;
fragment IFGE: 'ifge' ;
fragment IFGT: 'ifgt' ;
fragment IFLE: 'ifle' ;
fragment IF_ICMPEQ: 'if_icmpeq' ;
fragment IF_ICMPNE: 'if_icmpne' ;
fragment IF_ICMPLT: 'if_icmplt' ;
fragment IF_ICMPGE: 'if_icmpge' ;
fragment IF_ICMPGT: 'if_icmpgt' ;
fragment IF_ICMPLE: 'if_icmple' ;
fragment IF_ACMPEQ: 'if_acmpeq' ;
fragment IF_ACMPNE: 'if_acmpne' ;
fragment GOTO: 'goto' ;
fragment JSR: 'jsr' ;
fragment RET: 'ret' ;
fragment TABLESWITCH: 'tableswitch' ;
fragment LOOKUPSWITCH: 'lookupswitch' ;
fragment IRETURN: 'ireturn' ;
fragment LRETURN: 'lreturn' ;
fragment FRETURN: 'freturn' ;
fragment DRETURN: 'dreturn' ;
fragment ARETURN: 'areturn' ;
fragment RETURN: 'return' ;
fragment GETSTATIC: 'getstatic' ;
fragment PUTSTATIC: 'putstatic' ;
fragment GETFIELD: 'getfield' ;
fragment PUTFIELD: 'putfield' ;
fragment INVOKEVIRTUAL: 'invokevirtual' ;
fragment INVOKESPECIAL: 'invokespecial' ;
fragment INVOKESTATIC: 'invokestatic' ;
fragment INVOKEINTERFACE: 'invokeinterface' ;
fragment INVOKEDYNAMIC: 'invokedynamic' ;
fragment NEW: 'new' ;
fragment NEWARRAY: 'newarray' ;
fragment ANEWARRAY: 'anewarray' ;
fragment ARRAYLENGTH: 'arraylength' ;
fragment ATHROW: 'athrow' ;
fragment CHECKCAST: 'checkcast' ;
fragment INSTANCEOF: 'instanceof' ;
fragment MONITORENTER: 'monitorenter' ;
fragment MONITOREXIT: 'monitorexit' ;
fragment MULTIANEWARRAY: 'multianewarray' ;
fragment IFNULL: 'ifnull' ;
fragment IFNONNULL: 'ifnonnull' ;

fragment ConstantInstruction
    : ACONST_NULL
    | ICONST_M1
    | ICONST_0
    | ICONST_1
    | ICONST_2
    | ICONST_3
    | ICONST_4
    | ICONST_5
    | LCONST_0
    | LCONST_1
    | FCONST_0
    | FCONST_1
    | FCONST_2
    | DCONST_0
    | DCONST_1
    ;

fragment ArrayLoadInstruction
    : IALOAD
    | LALOAD
    | FALOAD
    | DALOAD
    | AALOAD
    | BALOAD
    | CALOAD
    | SALOAD
    ;

fragment ArrayStoreInstruction
    : IASTORE
    | LASTORE
    | FASTORE
    | DASTORE
    | AASTORE
    | BASTORE
    | CASTORE
    | SASTORE
    ;

fragment StackManipulationInstruction
    : POP
    | POP2
    | DUP
    | DUP_X1
    | DUP_X2
    | DUP2
    | DUP2_X1
    | DUP2_X2
    | SWAP
    ;

fragment ArithmeticInstruction
    : IADD
    | LADD
    | FADD
    | DADD
    | ISUB
    | LSUB
    | FSUB
    | DSUB
    | IMUL
    | LMUL
    | FMUL
    | DMUL
    | IDIV
    | LDIV
    | FDIV
    | DDIV
    | IREM
    | LREM
    | FREM
    | DREM
    | INEG
    | LNEG
    | FNEG
    | DNEG
    | ISHL
    | LSHL
    | ISHR
    | LSHR
    | IUSHR
    | LUSHR
    | IAND
    | LAND
    | IOR
    | LOR
    | IXOR
    | LXOR
    ;

fragment ConversionInstruction
    : I2L
    | I2F
    | I2D
    | L2I
    | L2F
    | L2D
    | F2I
    | F2L
    | F2D
    | D2I
    | D2L
    | D2F
    | I2B
    | I2C
    | I2S
    ;

fragment ComparisonInstruction
    : LCMP
    | FCMPL
    | FCMPG
    | DCMPL
    | DCMPG
    ;

fragment ReturnInstruction
    : IRETURN
    | LRETURN
    | FRETURN
    | DRETURN
    | ARETURN
    | RETURN
    ;

SimpleInstruction
    : NOP
    | ConstantInstruction
    | ArrayLoadInstruction
    | ArrayStoreInstruction
    | StackManipulationInstruction
    | ArithmeticInstruction
    | ComparisonInstruction
    | ReturnInstruction
    | MONITORENTER | MONITOREXIT
    ;

ImmediateIntPushInstruction
    : BIPUSH
    | SIPUSH
    ;

FieldAccessInstruction
    : GETSTATIC
    | PUTSTATIC
    | GETFIELD
    | PUTFIELD
    ;

MethodInvocationInstruction
    : INVOKESTATIC
    | INVOKESPECIAL
    | INVOKEVIRTUAL
    | INVOKEINTERFACE
    ;

LoadConstantInstruction
    : LDC
    | LDC2_W
    | LDC_W
    ;

LocalVariableAccessInstruction
    : ALOAD
    | ILOAD
    | LLOAD
    | FLOAD
    | DLOAD
    | ASTORE
    | ISTORE
    | LSTORE
    | FSTORE
    | DSTORE
    ;

JumpInstruction
    : IFEQ
    | IFNE
    | IFLT
    | IFGE
    | IFGT
    | IFLE
    | IF_ICMPEQ
    | IF_ICMPNE
    | IF_ICMPLT
    | IF_ICMPGE
    | IF_ICMPGT
    | IF_ICMPLE
    | IF_ACMPEQ
    | IF_ACMPNE
    | GOTO
    | JSR
    | IFNULL
    | IFNONNULL
    ;

IntIncrementInstruction
    : IINC
    ;

TypeInstruction
    : NEW
    | ANEWARRAY
    | CHECKCAST
    | INSTANCEOF
    ;

Identifier
    : (Letter | '_') (Letter | '_' | DecDigit | '/')*
    | '`' ~('`')+ '`'
    ;

mode Inside ;

Inside_RPAREN: ')' -> popMode, type(RPAREN) ;
Inside_RSQUARE: ']' -> popMode, type(RSQUARE);

Inside_LPAREN: LPAREN -> pushMode(Inside), type(LPAREN) ;
Inside_LSQUARE: LSQUARE -> pushMode(Inside), type(LSQUARE) ;

Inside_AT_SYMBOL: AT_SYMBOL -> type(AT_SYMBOL) ;
Inside_EQUALS: EQUALS -> type(EQUALS) ;

Inside_BINARY: BINARY -> type(BINARY) ;
Inside_RUNTIME: RUNTIME -> type(RUNTIME) ;

Inside_LCURL: LCURL -> type(LCURL) ;
Inside_RCURL: RCURL -> type(RCURL) ;
Inside_DOT: DOT -> type(DOT) ;
Inside_COMMA: COMMA  -> type(COMMA) ;
Inside_COLON: COLON  -> type(COLON) ;
Inside_SEMICOLON: SEMICOLON  -> type(SEMICOLON) ;
Inside_SINGLE_QUOTE: SINGLE_QUOTE  -> type(SINGLE_QUOTE) ;
Inside_QUOTE_OPEN: QUOTE_OPEN -> pushMode(LineString), type(QUOTE_OPEN) ;
Inside_TRIPLE_QUOTE_OPEN: TRIPLE_QUOTE_OPEN -> pushMode(MultiLineString), type(TRIPLE_QUOTE_OPEN) ;

Inside_PUBLIC: PUBLIC -> type(PUBLIC) ;
Inside_PRIVATE: PRIVATE -> type(PRIVATE) ;
Inside_PROTECTED: PROTECTED -> type(PROTECTED) ;
Inside_STATIC: STATIC -> type(STATIC) ;
Inside_FINAL: FINAL -> type(FINAL) ;
Inside_SUPER: SUPER -> type(SUPER) ;
Inside_SYNCHRONIZED: SYNCHRONIZED -> type(SYNCHRONIZED) ;
Inside_OPEN: OPEN -> type(OPEN) ;
Inside_TRANSITIVE: TRANSITIVE -> type(TRANSITIVE) ;
Inside_VOLATILE: VOLATILE -> type(VOLATILE) ;
Inside_BRIDGE: BRIDGE -> type(BRIDGE) ;
Inside_STATIC_PHASE: STATIC_PHASE -> type(STATIC_PHASE) ;
Inside_VARARGS: VARARGS -> type(VARARGS) ;
Inside_TRANSIENT: TRANSIENT -> type(TRANSIENT) ;
Inside_NATIVE: NATIVE -> type(NATIVE) ;
Inside_INTERFACE: INTERFACE -> type(INTERFACE) ;
Inside_ABSTRACT: ABSTRACT -> type(ABSTRACT) ;
Inside_STRICT: STRICT -> type(STRICT) ;
Inside_SYNTHETIC: SYNTHETIC -> type(SYNTHETIC) ;
Inside_ANNOTATION: ANNOTATION -> type(ANNOTATION) ;
Inside_ENUM: ENUM -> type(ENUM) ;
Inside_MANDATED: MANDATED -> type(MANDATED) ;
Inside_MODULE: MODULE -> type(MODULE) ;

Inside_BooleanLiteral: BooleanLiteral -> type(BooleanLiteral) ;
Inside_IntegerLiteral: IntegerLiteral -> type(IntegerLiteral) ;
Inside_HexLiteral: HexLiteral -> type(HexLiteral) ;
Inside_BinLiteral: BinLiteral -> type(BinLiteral) ;
Inside_CharacterLiteral: CharacterLiteral -> type(CharacterLiteral) ;

Inside_Identifier: Identifier -> type(Identifier) ;
Inside_Comment: (LineComment | DelimitedComment) -> channel(HIDDEN) ;
Inside_WS: WS -> skip ;
Inside_NL: NL -> skip ;


mode LineString ;

QUOTE_CLOSE
    : '"' -> popMode
    ;

LineStrText
    : ~('\\' | '"')+
    ;

LineStrEscapedChar
    : EscapeSeq
    ;


mode MultiLineString ;

TRIPLE_QUOTE_CLOSE
    : MultiLineStringQuote? '"""' -> popMode
    ;

MultiLineStringQuote
    : '"'+
    ;

MultiLineStrText
    :  ~('\\' | '"')+
    ;

MultiLineStrEscapedChar
    : EscapeSeq
    ;

MultiLineNL: NL -> skip ;
