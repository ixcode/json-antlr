lexer grammar JSON;
@header {
package net.nextquestion.json;
}

COMMA : ',' ;
T19 : 'true' ;
T20 : 'false' ;
T21 : 'null' ;
T22 : '{' ;
T23 : '}' ;
T24 : '[' ;
T25 : ']' ;
T26 : ':' ;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 55
Number	: '-'? Digit+ ('.' Digit+)? (('E'|'e') ('+'|'-')? Digit+)?;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 57
String 	:
	'"' ( EscapeSequence | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
	;

	
// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 62
fragment EscapeSequence
    	:   '\\' (UnicodeEscape |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 66
fragment UnicodeEscape
	: 'u' HexDigit HexDigit HexDigit HexDigit
	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 70
fragment HexDigit
	: '0'..'9' | 'A'..'F' | 'a'..'f'
	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 74
fragment Digit
	: '0'..'9'
	;

