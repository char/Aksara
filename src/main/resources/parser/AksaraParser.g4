parser grammar AksaraParser;

options { tokenVocab = AksaraLexer; }

semi: NL+ | NL* SEMICOLON NL*;
anysemi: NL | SEMICOLON;

aksaraFile
    : NL* importList anysemi* classDeclarations NL* EOF
    ;

importList
    : importHeader*
    ;

importHeader
    : IMPORT identifier semi?
    ;

classDeclarations
    : classDeclaration+
    ;

classDeclaration
    : (annotationList NL+)? modifierList type (LCURL NL* classBody NL* RCURL)?
    ;

fieldDeclaration
    : (annotationList NL+)? modifierList identifier COLON type
    ;

methodSignature
    : type LPAREN (type (COMMA type)*)? RPAREN
    ;

methodDeclaration
    : (annotationList NL+)? modifierList identifier methodSignature (NL* LCURL NL* methodBody NL* RCURL)?
    ;

instruction
    : SimpleInstruction
    | (ImmediateIntPushInstruction intLiteral)
    ;

methodBody
    : instruction (semi instruction)*
    ;

classBody
    : (fieldDeclaration | methodDeclaration) (semi (fieldDeclaration | methodDeclaration))*
    ;

identifier
    : simpleIdentifier (NL* DOT simpleIdentifier)*
    | lineStringLiteral
    ;

simpleIdentifier
    : LANG? Identifier RANG?
    ;

arrayIdentifier
    : identifier LSQUARE RSQUARE
    ;

type
    : identifier
    | arrayIdentifier
    | lineStringLiteral
    ;

stringLiteral
    : lineStringLiteral
    | multiLineStringLiteral
    ;

lineStringLiteral
    : QUOTE_OPEN (lineStringContent)* QUOTE_CLOSE
    ;

lineStringContent
    : LineStrText
    | LineStrEscapedChar
    ;

multiLineStringLiteral
    : TRIPLE_QUOTE_OPEN (multiLineStringContent | lineStringLiteral)* TRIPLE_QUOTE_CLOSE
    ;

multiLineStringContent
    : MultiLineStrText
    | MultiLineStrEscapedChar
    ;

modifierList
    : modifier+
    ;

modifier
    : PUBLIC
    | PRIVATE
    | PROTECTED
    | STATIC
    | FINAL
    | SUPER
    | SYNCHRONIZED
    | OPEN
    | TRANSITIVE
    | VOLATILE
    | BRIDGE
    | STATIC_PHASE
    | VARARGS
    | TRANSIENT
    | NATIVE
    | INTERFACE
    | ABSTRACT
    | STRICT
    | SYNTHETIC
    | ANNOTATION
    | ENUM
    | MANDATED
    | MODULE
    ;

intLiteral
    : (IntegerLiteral | HexLiteral | BinLiteral)
    ;

longLiteral
    : (IntegerLiteral | HexLiteral | BinLiteral) LONG_TRAILER
    ;

floatLiteral
    : (RealLiteral | IntegerLiteral) FLOAT_TRAILER
    ;

doubleLiteral
    : RealLiteral
    | (IntegerLiteral DOUBLE_TRAILER)
    ;

characterLiteral
    : CharacterLiteral
    | EscapedCharacterLiteral
    ;

literal
    : stringLiteral
    | intLiteral
    | longLiteral
    | floatLiteral
    | doubleLiteral
    | characterLiteral
    | type
    ;

annotationList
    : annotation (anysemi annotation)*
    ;

annotationType
    : (BINARY | RUNTIME)
    ;

annotationArgument
    : identifier EQUALS literal
    ;

annotation
    : AT_SYMBOL type LPAREN annotationType (COMMA annotationArgument)* RPAREN
    ;
