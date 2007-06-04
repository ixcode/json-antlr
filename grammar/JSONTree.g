tree grammar JSONTree;

options { 
tokenVocab=JSON; // reuse token types 
ASTLabelType=CommonTree; // $label will have type CommonTree 
} 


@header {
package net.nextquestion.json;
}

value returns [Object result]
	: s=string { $result = s; } 
//	| number
//	| object
//	| array
	| TRUE { $result=Boolean.TRUE; }
	| FALSE {$result = Boolean.FALSE; }
	| NULL {$result = null; }
	;

string returns [String result]
	: ^(STRING String)
	  { String s = $String.text; $result = s.substring(1, s.length()-1); }
	;
	
// object	: ^(OBJECT pair+)
//	;

// number	: ^(NUMBER .)
//	;

// array	: (ARRAY value+)
//	;
	 
// pair	: ^(FIELD string value) 
//	;




