grammar TrabalhoParser;

import TrabalhoLexer;


compilationUnit: (PACKAGE qualifiedIdentifier PONTOEVIRGULA)?
(IMPORT qualifiedIdentifier PONTOEVIRGULA)*
(typeDeclaration)* EOF;

qualifiedIdentifier: ID (PONTO ID)*;

typeDeclaration: modifiers classDeclaration;

modifiers: (PUBLIC | PRIVATE | PROTECTED | STATIC | ABSTRACT)*;

classDeclaration: CLASS ID (EXTENDS qualifiedIdentifier)? classBody;

classBody: ACHAVE ( modifiers memberDecl  )* FCHAVE;

memberDecl: ID formalParameters block
| (VOID | type) ID formalParameters (block | PONTOEVIRGULA)
| type variableDeclarators PONTOEVIRGULA;

block: ACHAVE( blockStatement )* FCHAVE;

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

arrayInitializer: ACHAVE (variableInitializer (VIRGULA variableInitializer)* )? FCHAVE;

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

selector: PONTO qualifiedIdentifier (arguments)? | ACOLCHETE expression FCOLCHETE ;

primary: parExpression | THIS (arguments)? | SUPER (arguments | PONTO ID (arguments)?) | literal | NEW creator | qualifiedIdentifier (arguments)?;

creator: (basicType | qualifiedIdentifier) (arguments | ACOLCHETE FCOLCHETE (ACOLCHETE FCOLCHETE)* (arrayInitializer)? | newArrayDeclarator);

newArrayDeclarator: ACOLCHETE expression FCOLCHETE (ACOLCHETE expression FCOLCHETE)* (ACOLCHETE FCOLCHETE)*;

literal: INTLITERAL | CHARLITERAL | STRINGLITERAL | TRUE | FALSE | NULL;