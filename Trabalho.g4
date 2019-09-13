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
ATIBUICAO: '=';
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
LETRA:'a'..'z'|'A'..'Z';
DIGITO:'0'..'9';
ESC: '\\'('n'|'r'|'t'|'b'|'f'|'\''|'"'|'\\');
INTLITERAL: '0'|DIGITO DIGITO*;
CHARLITERAL: '\''(ESC|~('\''|'\\'|'\n'|'\r'))'\'';
STRINGLITERAL: '"'(ESC|~('"'|'\\'|'\n'|'\r'))'"';

//Adicionais
LINECOMMENT: '//'~[\r\n]* -> skip;
WHITESPACE: ('\t'|' '|'\r'|'\n'|'\u000C')+ -> skip;

//ID
ID: (LETRA|'_'|'$')(LETRA|DIGITO|'_'|'$')*;

