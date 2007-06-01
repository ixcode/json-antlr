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
	: String -> ^(STRING String)
	| Number -> ^(NUMBER Number)
	| object
	| array
	| 'true' -> TRUE
	| 'false' -> FALSE
	| 'null' -> NULL
	;

object	: '{' members '}' 
	  -> ^(OBJECT members)
	;

array	: '[' elements ']'
	  -> ^(ARRAY elements)
	;

elements: value 
        (
          (COMMA! value)+
          | // no additional elements
        )
	;
	
members	:(pair COMMA) => pair (COMMA! pair)+
	| pair
	;
	 
pair	: String ':' value 
	  -> ^(FIELD String value) 
	;

Number	: '-'? Digit+ ('.' Digit+)? (('E'|'e') ('+'|'-')? Digit+)?;

String 	:
	'"' ( EscapeSequence | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
	;

	
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

