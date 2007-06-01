lexer grammar JSON;
@header {
package net.nextquestion.json;
}

COMMA : ',' ;
T15 : '{' ;
T16 : '}' ;
T17 : ':' ;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 40
Number	: '-'? Digit+ ('.' Digit+)? (('E'|'e') ('+'|'-')? Digit+)?;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 42
String 	:
	'"' ( EscapeSequence | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
	;

	
// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 47
fragment EscapeSequence
    	:   '\\' (UnicodeEscape |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 51
fragment UnicodeEscape
	: 'u' HexDigit HexDigit HexDigit HexDigit
	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 55
fragment HexDigit
	: '0'..'9' | 'A'..'F' | 'a'..'f'
	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 59
fragment Digit
	: '0'..'9'
	;

