
grammar Program;

// Entry rule for the program
program: 'BEGIN' programName inputDeclarations outputDeclarations memoryDeclarations logicStatements endProgram;

// Identifier for the program
programName: identifier;

// Input declarations
inputDeclarations: 'INPUT' var '.' var ';';

// Output declarations
outputDeclarations: 'OUTPUT' var '.' var ';';

// Memory declarations
memoryDeclarations: 'RAM' ram '.' ram ';';

// Variable declarations
var: 'I' x2Value | 'Q' x2Value | 'M' x2Value;

// x2 is a 2-digit number
x2Value: DIGIT DIGIT;

// RAM declarations
ram: CN01 '.' 'AND' coils | CN02 '.' 'OR' coils | CN03 '.' 'XOR' coils | CN04 '.' 'NOT' coils;
CN01: 'CN01';
CN02: 'CN02';
CN03: 'CN03';
CN04: 'CN04';

// Coils within RAM
coils: coil ('.' coil)*;
coil: var;

// Logical statements within the program
logicStatements: statement ('.' statement)*;
statement: var ':=' logicOp;
logicOp: var 'AND' var | var 'OR' var | var 'XOR' var | 'NOT' var;

// Identifier rules
identifier: ALPHA (ALPHANUM)*;
ALPHA: [a-zA-Z];
ALPHANUM: ALPHA DIGIT;
DIGIT: [0-7];

// End rule for the program
endProgram: 'END';

// Skip white space
WS: [ \t\r\n]+ -> skip;

















