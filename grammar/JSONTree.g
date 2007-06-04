tree grammar JSONTree;

options { 
tokenVocab=JSON; // reuse token types 
ASTLabelType=CommonTree; // $label will have type CommonTree 
} 

@header {
package net.nextquestion.json;
}

@members {
    private Object processNumber(String numberBody, CommonTree exponentToken) {
        String exponent = (exponentToken == null) ? null : exponentToken.getText().substring(1); // remove the 'e' prefix if there
        boolean isReal = numberBody.indexOf('.') >= 0 || exponent != null;
        if (!isReal) {
            return Integer.getInteger(numberBody);
        } else {
            double result = Double.parseDouble(numberBody);
            if (exponent != null) {
                result = result * Math.pow(10.0f, Double.parseDouble(exponent));
            }
            return new Double(result);
        }
    }
}

value returns [Object result]
	: s=string { $result = s; } 
	| n=number { $result = n; }
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

number	returns [Object result] 
	: ^(NUMBER Number Exponent?)
	  { $result = processNumber($Number.text, $Exponent); }
	;

// array	: (ARRAY value+)
//	;
	 
// pair	: ^(FIELD string value) 
//	;




