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
    : modifierList type (LCURL NL* classBody NL* RCURL)?
    ;

fieldDeclaration
    : modifierList identifier COLON type
    ;

methodSignature
    : type LPAREN (type (COMMA type)*)? RPAREN
    ;

methodDeclaration
    : modifierList identifier methodSignature (NL* LCURL NL* methodBody NL* RCURL)?
    ;

instruction
    : PRIVATE
    ;

methodBody
    : instruction (NL* instruction)*
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
