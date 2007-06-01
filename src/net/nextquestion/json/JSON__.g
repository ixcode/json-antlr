lexer grammar JSON;
@header {
package net.nextquestion.json;
}

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 26
Number	: '-'? Digit+ ('.' Digit+)? (('E'|'e') ('+'|'-')? Digit+)?;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 28
String 	:
	'"' ( EscapeSequence | ~('\u0000'..'\u001f' | '\\' | '\"' ) )* '"'
	;

	
// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 33
fragment EscapeSequence
    	:   '\\' (UnicodeEscape |'b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 37
fragment UnicodeEscape
	: 'u' HexDigit HexDigit HexDigit HexDigit
	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 41
fragment HexDigit
	: '0'..'9' | 'A'..'F' | 'a'..'f'
	;

// $ANTLR src "/development/JSON Parser/grammar/JSON.g" 45
fragment Digit
	: '0'..'9'
	;

