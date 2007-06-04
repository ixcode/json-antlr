tree grammar JSONTree;

options { 
tokenVocab=JSON; // reuse token types 
ASTLabelType=CommonTree; // $label will have type CommonTree 
} 

@header {
package net.nextquestion.json;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
}

@members {
    private Object extractNumber(CommonTree numberToken, CommonTree exponentToken) {
        String numberBody = numberToken.getText();
        String exponent = (exponentToken == null) ? null : exponentToken.getText().substring(1); // remove the 'e' prefix if there
        boolean isReal = numberBody.indexOf('.') >= 0 || exponent != null;
        if (!isReal) {
            return new Integer(numberBody);
        } else {
            double result = Double.parseDouble(numberBody);
            if (exponent != null) {
                result = result * Math.pow(10.0f, Double.parseDouble(exponent));
            }
            return new Double(result);
        }
    }
    
    private String extractString(CommonTree token) {
        String s = token.getText();
        return s.substring(1, s.length() - 1);
    }

}

value returns [Object result]
	: s=string { $result = s; } 
	| n=number { $result = n; }
	| o=object { $result = o; }
//	| array
	| TRUE { $result=Boolean.TRUE; }
	| FALSE {$result = Boolean.FALSE; }
	| NULL {$result = null; }
	;

string returns [String result]
	: ^(STRING String)
	  { $result = extractString($String); }
	;
	
object returns [Map result]
@init { result = new HashMap(); }
	: ^(OBJECT pair[$result]+)
	;

number	returns [Object result] 
	: ^(NUMBER Number Exponent?)
	  { $result = extractNumber($Number, $Exponent); }
	;

array	returns [List list]
@init{ list = new ArrayList(); }
	: (ARRAY member[list]+)
	;
	
pair [Map map]
	: ^(FIELD key=String v=value) 
	   { $map.put(extractString($key), v); }
	;

member[List list]
	: v=value
	  {list.add(v); }
	;


