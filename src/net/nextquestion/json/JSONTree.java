// $ANTLR 3.0 /development/JSON Parser/grammar/JSONTree.g 2007-06-03 19:51:41

package net.nextquestion.json;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "NUMBER", "OBJECT", "FIELD", "ARRAY", "COMMA", "TRUE", "FALSE", "NULL", "String", "Number", "Exponent", "Digit", "EscapeSequence", "UnicodeEscape", "HexDigit", "'true'", "'false'", "'null'", "'{'", "'}'", "'['", "']'", "':'"
    };
    public static final int COMMA=9;
    public static final int OBJECT=6;
    public static final int Exponent=15;
    public static final int ARRAY=8;
    public static final int Digit=16;
    public static final int HexDigit=19;
    public static final int NUMBER=5;
    public static final int STRING=4;
    public static final int FALSE=11;
    public static final int FIELD=7;
    public static final int String=13;
    public static final int UnicodeEscape=18;
    public static final int EscapeSequence=17;
    public static final int EOF=-1;
    public static final int NULL=12;
    public static final int Number=14;
    public static final int TRUE=10;

        public JSONTree(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/development/JSON Parser/grammar/JSONTree.g"; }


        private Object processNumber(String numberBody, CommonTree exponentToken) {
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



    // $ANTLR start value
    // /development/JSON Parser/grammar/JSONTree.g:28:1: value returns [Object result] : (s= string | n= number | TRUE | FALSE | NULL );
    public final Object value() throws RecognitionException {
        Object result = null;

        String s = null;

        Object n = null;


        try {
            // /development/JSON Parser/grammar/JSONTree.g:29:4: (s= string | n= number | TRUE | FALSE | NULL )
            int alt1=5;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt1=1;
                }
                break;
            case NUMBER:
                {
                alt1=2;
                }
                break;
            case TRUE:
                {
                alt1=3;
                }
                break;
            case FALSE:
                {
                alt1=4;
                }
                break;
            case NULL:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("28:1: value returns [Object result] : (s= string | n= number | TRUE | FALSE | NULL );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /development/JSON Parser/grammar/JSONTree.g:29:4: s= string
                    {
                    pushFollow(FOLLOW_string_in_value50);
                    s=string();
                    _fsp--;

                     result = s; 

                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSONTree.g:30:4: n= number
                    {
                    pushFollow(FOLLOW_number_in_value60);
                    n=number();
                    _fsp--;

                     result = n; 

                    }
                    break;
                case 3 :
                    // /development/JSON Parser/grammar/JSONTree.g:33:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_value69); 
                     result =Boolean.TRUE; 

                    }
                    break;
                case 4 :
                    // /development/JSON Parser/grammar/JSONTree.g:34:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_value76); 
                    result = Boolean.FALSE; 

                    }
                    break;
                case 5 :
                    // /development/JSON Parser/grammar/JSONTree.g:35:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_value83); 
                    result = null; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end value


    // $ANTLR start string
    // /development/JSON Parser/grammar/JSONTree.g:38:1: string returns [String result] : ^( STRING String ) ;
    public final String string() throws RecognitionException {
        String result = null;

        CommonTree String1=null;

        try {
            // /development/JSON Parser/grammar/JSONTree.g:39:4: ( ^( STRING String ) )
            // /development/JSON Parser/grammar/JSONTree.g:39:4: ^( STRING String )
            {
            match(input,STRING,FOLLOW_STRING_in_string101); 

            match(input, Token.DOWN, null); 
            String1=(CommonTree)input.LT(1);
            match(input,String,FOLLOW_String_in_string103); 

            match(input, Token.UP, null); 
             String s = String1.getText(); result = s.substring(1, s.length()-1); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end string


    // $ANTLR start number
    // /development/JSON Parser/grammar/JSONTree.g:46:1: number returns [Object result] : ^( NUMBER Number ( Exponent )? ) ;
    public final Object number() throws RecognitionException {
        Object result = null;

        CommonTree Number2=null;
        CommonTree Exponent3=null;

        try {
            // /development/JSON Parser/grammar/JSONTree.g:47:4: ( ^( NUMBER Number ( Exponent )? ) )
            // /development/JSON Parser/grammar/JSONTree.g:47:4: ^( NUMBER Number ( Exponent )? )
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_number130); 

            match(input, Token.DOWN, null); 
            Number2=(CommonTree)input.LT(1);
            match(input,Number,FOLLOW_Number_in_number132); 
            // /development/JSON Parser/grammar/JSONTree.g:47:20: ( Exponent )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Exponent) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /development/JSON Parser/grammar/JSONTree.g:47:20: Exponent
                    {
                    Exponent3=(CommonTree)input.LT(1);
                    match(input,Exponent,FOLLOW_Exponent_in_number134); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
             result = processNumber(Number2.getText(), Exponent3); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end number


 

    public static final BitSet FOLLOW_string_in_value50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_value69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_value76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_string103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_in_number130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Number_in_number132 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_Exponent_in_number134 = new BitSet(new long[]{0x0000000000000008L});

}