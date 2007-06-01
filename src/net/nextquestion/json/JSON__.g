lexer grammar JSON;
@header {
package net.nextquestion.json;
}

COMMA : ',' ;
T16 : '{' ;
T17 : '}' ;
T18 : '[' ;
T19 : ']' ;
T20 : ':' ;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 52
Number	: '-'? Digit+ ('.' Digit+)? (('E'|'e') ('+'|'-')? Digit+)?;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 54
String 	:
	'"' ( EscapeSequence | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
	;

	
// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 59
fragment EscapeSequence
    	:   '\\' (UnicodeEscape |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 63
fragment UnicodeEscape
	: 'u' HexDigit HexDigit HexDigit HexDigit
	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 67
fragment HexDigit
	: '0'..'9' | 'A'..'F' | 'a'..'f'
	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 71
fragment Digit
	: '0'..'9'
	;

