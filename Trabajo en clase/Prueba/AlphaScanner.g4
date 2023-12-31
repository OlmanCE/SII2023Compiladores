lexer grammar AlphaScanner;

//símbolos
PyCOMA  : ';' ;
ASSIGN  : ':=';
PIZQ    : '(';
PDER    : ')';
VIR     : '~';
DOSPUN  : ':';
SUM     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
//------------------------------------------
MODU    : '%';
EQUALITY: '==';
DIF     : '!=';
MINOR   : '<';
MAJOR   : '>';
MINEUQU : '<=';
MAEQUAL : '>=';
//palabras reservadas
IF      : 'if' ;
WHILE   : 'while' ;
LET     : 'let';
THEN    : 'then';
ELSE    : 'else';
IN      : 'in';
DO      : 'do';
BEGIN   : 'begin';
END     : 'end';
CONST   : 'const';
VAR     : 'var';

ID : LETTER (LETTER|DIGIT)* ;
NUM : DIGIT DIGIT* ;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;

WS  :   [ \t\n\r]+ -> skip ;