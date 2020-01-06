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

LPAREN: '(' -> pushMode(Inside) ;
RPAREN: ')' ;
LSQUARE: '[' -> pushMode(Inside) ;
RSQUARE: ']' ;
LCURL: '{' ;
RCURL: '}' ;
LANG: '<' ;
RANG: '>' ;

// KEYWORDS

IMPORT: 'import' ;

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

RealLiteral
    : FloatLiteral
    | DoubleLiteral
    ;

FloatLiteral
    : (DoubleLiteral | IntegerLiteral) [fF]
    ;

DoubleLiteral
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

LongLiteral
    : (IntegerLiteral | HexLiteral | BinLiteral) 'L'
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

Identifier
    : (Letter | '_') (Letter | '_' | DecDigit | '/')*
    | '`' ~('`')+ '`'
    ;

CharacterLiteral
    : '\'' (EscapeSeq | .) '\''
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


mode Inside ;

Inside_RPAREN: ')' -> popMode, type(RPAREN) ;
Inside_RSQUARE: ']' -> popMode, type(RSQUARE);

Inside_LPAREN: LPAREN -> pushMode(Inside), type(LPAREN) ;
Inside_LSQUARE: LSQUARE -> pushMode(Inside), type(LSQUARE) ;

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
Inside_RealLiteral: RealLiteral -> type(RealLiteral) ;

Inside_LongLiteral: LongLiteral -> type(LongLiteral) ;

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
