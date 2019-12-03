lexer grammar Trabalho;

//Palavras reservadas
ABSTRACT: 'abstract';
BOOLEAN: 'boolean';
CHAR: 'char';
CLASS: 'class';
ELSE: 'else';
EXTENDS: 'extends';
FALSE: 'false';
IF: 'if';
IMPORT: 'import';
INSTANCEOF: 'instanceof';
INT: 'int';
NEW: 'new';
NULL:'null';
PACKAGE: 'package';
PRIVATE: 'private';
PROTECTED: 'protected';
PUBLIC: 'public';
RETURN: 'return';
STATIC: 'static';
SUPER: 'super';
THIS: 'this';
TRUE: 'true';
VOID: 'void';
WHILE: 'while';

//Operadores
ATRIBUIACO: '=';
COMPARACAO: '==';
MAIOR: '>';
MAISUM: '++';
E: '&&';
MENORIGUAL: '<=';
NEGACAO: '!';
MENOS: '-';
MENOSUM: '--';
SOMA: '+';
MAISIGUAL: '+=';
MULTIPLICACAO: '*';

//Separadores
VIRGULA: ',';
PONTO: '.';
ACOLCHETE: '[';
ACHAVE: '{';
APARENTESES: '(';
FCOLCHETE: ']';
FCHAVE: '}';
FPARENTESES: ')';
PONTOEVIRGULA: ';';

//Literal
ESC: '\\'('n'|'r'|'t'|'b'|'f'|'\''|'"'|'\\');
INTLITERAL: '0'|('0'..'9') ('0'..'9')*;
CHARLITERAL: '\''(ESC|~('\''|'\\'|'\n'|'\r'))'\'';
STRINGLITERAL: '"'(ESC|~('"'|'\\'|'\n'|'\r'))*'"';

//Adicionais
LINECOMMENT: '//'~[\r\n]* -> skip;
WHITESPACE: ('\t'|' '|'\r'|'\n'|'\u000C')+ -> skip;

//ID
ID: ('a'..'z'|'A'..'Z'|'_'|'$')('a'..'z'|'A'..'Z'|('0'..'9')|'_'|'$')*;



//




compilationUnit: (PACKAGE qualifiedIdentifier PONTOEVIRGULA)? (IMPORT qualifiedIdentifier PONTOEVIRGULA)* (typeDeclaration)* EOF;

qualifiedIdentifier: ID (VIRGULA ID)*;// virgula é ponto

typeDeclaration: modifiers classDeclaration;

modifiers: (PUBLIC | PRIVATE | PROTECTED | STATIC | ABSTRACT)*;

classDeclaration: CLASS ID (EXTENDS qualifiedIdentifier)? classBody;

classBody: (ACHAVE modifiers memberDecl FCHAVE )*;

memberDecl: ID formalParameters block
| (VOID | type) ID formalParameters (block | PONTOEVIRGULA)
| type variableDeclarators;

block: (ACHAVE blockStatement FCHAVE)*;

blockStatement: localVariableDeclarationStatement | statement;

statement: block
| ID ':' statement
| IF parExpression statement (ELSE statement)?
| WHILE parExpression statement
| RETURN (expression)? PONTOEVIRGULA
| PONTOEVIRGULA
| statementExpression PONTOEVIRGULA;

formalParameters: APARENTESES (formalParameter (VIRGULA formalParameter)*)? FPARENTESES;

formalParameter: type ID;

parExpression: APARENTESES expression FPARENTESES;

localVariableDeclarationStatement: type variableDeclarators PONTOEVIRGULA;

variableDeclarators: variableDeclarator (VIRGULA variableDeclarator)*;

variableDeclarator: ID (ATRIBUIACO variableInitializer)?;

variableInitializer: arrayInitializer | expression;

arrayInitializer: ACOLCHETE (variableInitializer (VIRGULA variableInitializer)* )? FCOLCHETE;

arguments: APARENTESES (expression (VIRGULA expression)*)? FPARENTESES;

type: referenceType | basicType;

basicType: BOOLEAN | CHAR | INT;

referenceType: basicType ACOLCHETE FCOLCHETE (ACOLCHETE FCOLCHETE)* | qualifiedIdentifier (ACOLCHETE FCOLCHETE)*;

statementExpression: expression;

expression: assignmentExpression;

assignmentExpression: conditionalAndExpression ((ATRIBUIACO | MAISIGUAL) assignmentExpression)?;

conditionalAndExpression: equalityExpression (E equalityExpression)*;

equalityExpression: relationalExpression (COMPARACAO relationalExpression)*;

relationalExpression: additiveExpression ((MAIOR | MENORIGUAL) additiveExpression | INSTANCEOF referenceType)?;

additiveExpression: multiplicativeExpression ((SOMA | MENOS) multiplicativeExpression)*;

multiplicativeExpression: unaryExpression (MULTIPLICACAO unaryExpression)*;

unaryExpression: MAISUM unaryExpression | MENOS unaryExpression | simpleUnaryExpression;

simpleUnaryExpression: NEGACAO unaryExpression | APARENTESES basicType FPARENTESES unaryExpression | APARENTESES referenceType FPARENTESES simpleUnaryExpression | postfixExpression;

postfixExpression: primary (selector)* (MENOSUM)*;

selector: PONTO qualifiedIdentifier (arguments)? | ( expression )?;

primary: parExpression | THIS (arguments)? | SUPER (arguments | PONTO ID (arguments)?) | literal | NEW creator | qualifiedIdentifier (arguments)?;

creator: (basicType | qualifiedIdentifier) (arguments | ACOLCHETE FCOLCHETE (ACOLCHETE FCOLCHETE)* (arrayInitializer)? | newArrayDeclarator);


newArrayDeclarator: ACOLCHETE expression FCOLCHETE (ACOLCHETE expression FCOLCHETE)* (ACOLCHETE FCOLCHETE)*;

literal: INTLITERAL | CHARLITERAL | STRINGLITERAL | TRUE | FALSE | NULL;

