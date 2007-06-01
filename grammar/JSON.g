grammar JSON;

options {
	output = AST;
}

tokens {
	STRING; NUMBER;
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
	;

Number	: '-'? Digit+ ('.' Digit+)?;

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

