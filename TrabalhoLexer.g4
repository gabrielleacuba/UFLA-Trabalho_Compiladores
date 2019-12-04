lexer grammar TrabalhoLexer;

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
