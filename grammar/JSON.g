grammar JSON;

options {
	output = AST;
}

tokens {
	STRING; NUMBER; OBJECT; FIELD; ARRAY;
	COMMA = ',';
	TRUE; FALSE; NULL;
}

@header {
package net.nextquestion.json;
}

@lexer::header {
package net.nextquestion.json;
}


value
	: string
	| number
	| object
	| array
	| 'true' -> TRUE
	| 'false' -> FALSE
	| 'null' -> NULL
	;

string 	: String
	  -> ^(STRING String)
	;

number	: Number Exponent? 
	  -> ^(NUMBER Number Exponent?)
	;

object	: '{' members '}' 
	  -> ^(OBJECT members)
	;
	
array	: '[' elements ']'
	  -> ^(ARRAY elements)
	;

elements:(value COMMA) => value (COMMA! value)+
	| value
	;
	
members	:(pair COMMA) => pair (COMMA! pair)+
	| pair
	;
	 
pair	: String ':' value 
	  -> ^(FIELD String value) 
	;

Number	: '-'? Digit+ ( '.' Digit+)?;

Exponent: ('e'|'E') '-'? Digit+;

String 	:
	'"' ( EscapeSequence | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
	;

WS: (' '|'\n'|'\r'|'\t')+ {$channel=HIDDEN;} ; // ignore whitespace 

fragment EscapeSequence
    	:   '\\' (UnicodeEscape |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    	;

fragment UnicodeEscape
	: 'u' HexDigit HexDigit HexDigit HexDigit
	;

fragment HexDigit
	: '0'..'9' | 'A'..'F' | 'a'..'f'
	;

fragment Digit
	: '0'..'9'
	;

