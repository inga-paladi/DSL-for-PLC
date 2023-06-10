grammar Program;

program:
    programBegin
    inputDeclarations
    outputDeclarations
    memoryDeclarations?
    programBody
    'END';

programBegin: 'BEGIN' programName ';';
programName: IDENTIFIER;

inputDeclarations: (inputVarDeclaration)+;
inputVarDeclaration: 'INPUT' InputVar ';';
InputVar: 'I' X2Value;

outputDeclarations: (outputVarDeclaration)+;
outputVarDeclaration: 'OUTPUT' OutputVar ';';
OutputVar: 'Q' X2Value;

memoryDeclarations: (memoryDeclaration)+;
memoryDeclaration: 'RAM' MemVar ';';
MemVar: 'M' X2Value;

X2Value: DECIM_DIGIT DECIM_DIGIT;

programBody: statements infiniteLoop?;

statements: (conditionalStatement | statement)+;

infiniteLoop:
    'LOOP:'
    statements
    'END LOOP';

conditionalStatement: 'IF' condition ':' statements 'END IF';

condition: InputVar | MemVar;

statement: waitFor | assignment;

NUMBER: [0-9]+;

waitFor: 'WAIT' NUMBER ';';

assignment: (OutputVar | MemVar) ':=' (var | NUMBER | operation) ';';

var: InputVar | OutputVar | MemVar;

operation: operand operator operand;

operand: var | NUMBER;

operator: logicOperator | arithmeticOperator;
logicOperator: 'AND' | 'OR' | 'XOR' | 'NOT';
arithmeticOperator: '+' | '-';

IDENTIFIER: ([a-zA-Z][a-zA-Z0-9]*);
ALPHA: [a-zA-Z];
ALPHANUM: ALPHA | DECIM_DIGIT;
DECIM_DIGIT: [0-9];
OCTAL_DIGIT: [0-7];

// Skip white space
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;