//name the grammar Parser
grammar Parser;

//programs are statements or newlines + end of file
program : (statement | '\n' | '\r\n')* EOF;

//comments start with a # are skipped
COMMENT : '#' ~[\r\n]* -> skip;
//anything between two '\\\' are skipped
BLOCKCOMMENT : '\'\'\'' .*? '\'\'\'' -> skip;

//there are six statements
statement
    : assign_statement
    | if_statement
    | while_statement
    | for_loop
    | elif_statement
    | else_statement
    ;

// a while statement starts with 'while'
// and then has a condition_expression with or without '()'
// then a colon and a block
while_statement
    : 'while' ( '(' condition_expression ')' | condition_expression )
      COLON ('\n' | '\r\n') block? block2? block3?
    ;

//a for loop statement starts with 'for' and then a variable and then 'in'
//then followed by a sizeofloop with a colon and a block
for_loop
    : 'for' variable 'in' sizeofloop
      COLON ('\n' | '\r\n') block? block2? block3?
    ;

//a sizeofloop statement can be a 'range' with expressions
//or it can be an array or variable
sizeofloop
    : 'range' '(' expression (',' expression (',' expression)?)? ')'
    | array
    | variable
    ;

//assign_statement is a variable assign_op expression
assign_statement
    : variable assign_op expression
    ;

//assignment operators are as follows:
assign_op
    : '=' | '+=' | '-=' | '*=' | '/=' | '%='
    ;

//expression can be variable, array, NUMBER, or STRING
expression
    : expression op=('*'|'/'|'%') expression
    | expression op=('+'|'-') expression
    | variable
    | array
    | NUMBER
    | STRING
    ;

//if statement must start with 'if' and then a condition_expression with or without '()'
//also has option to use 'and' or 'or'. followed by colon and a block
if_statement
    : 'if' ( '(' condition_expression ')' | condition_expression )
      ( ('and' | 'or') condition_expression )*
      COLON ('\n' | '\r\n') ( elif_statement | else_statement | block | block2 | block3)+
    ;

//elifstatemt is same as if statement but starts with 'elif' and blocks
elif_statement
    : 'elif' ( '(' condition_expression ')' | condition_expression )
      ( ('and' | 'or') condition_expression )*
      COLON ('\n' | '\r\n') block? block2? block3?
    ;

//else_statement doesn't have option for condition_expression
else_statement
    : 'else' COLON ('\n' | '\r\n') block? block2? block3?
    ;

//a block starts with one INDENT and the a statement followed by a newline
block
    : (INDENT statement ('\n' | '\r\n')? )+;

//a block starts with two INDENTs and the a statement followed by a newline
block2
    : (INDENT INDENT statement ('\n' | '\r\n')?)+;

//a block starts with three INDENTs and the a statement followed by a newline
block3
    : (INDENT INDENT INDENT statement ('\n' | '\r\n'))+;

//condition_expression allows for not, and, and or. Or just a cond_op
condition_expression
    : cond_op
    | 'not' cond_op
    | cond_op op=('and' | 'or') cond_op
    ;

//cond_op is a variable, array, NUMBER, or STRING then a conditional operator then variable, array, NUMBER, or STRING
//Or it can just be a variable, array, NUMBER, or STRING.
cond_op
    : (variable | array | NUMBER | STRING)
      op=('=='|'>'|'<'|'<='|'>='|'!=')
      (variable | array | NUMBER | STRING)
    | (variable | array | NUMBER | STRING)
    ;

//variable is an IDENTIFIER
variable : IDENTIFIER;

//array is a list of expressions
array    : '[' (expression (',' expression)*)? ']';

//IDENTIFIER must start with a letter, then letters, numbers, or _ after
IDENTIFIER : [a-zA-Z_][a-zA-Z_0-9]*;
//numbers can be negative and have decimals
NUMBER     : '-'?[0-9]+ ('.' [0-9]+)?;
//Strings can be letters, numbers, or characthers enclosed in ' or ".
STRING     : ('"' ( ~["\\] | '\\' . )* '"' ) | ( '\'' ( ~['\\] | '\\' . )* '\'' );
//A colone is just ':'
COLON      : ':';
//An indent can be 4 spaces or a tab
INDENT : ('    ' | '\t');
//whitespace is skipped
WS : [ ] -> skip;