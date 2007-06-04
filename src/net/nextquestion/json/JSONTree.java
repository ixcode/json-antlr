// $ANTLR 3.0 /development/JSON Parser/grammar/JSONTree.g 2007-06-03 22:05:21

package net.nextquestion.json;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;




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




    // $ANTLR start value
    // /development/JSON Parser/grammar/JSONTree.g:42:1: value returns [Object result] : (s= string | n= number | o= object | TRUE | FALSE | NULL );
    public final Object value() throws RecognitionException {
        Object result = null;

        String s = null;

        Object n = null;

        Map o = null;


        try {
            // /development/JSON Parser/grammar/JSONTree.g:43:4: (s= string | n= number | o= object | TRUE | FALSE | NULL )
            int alt1=6;
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
            case OBJECT:
                {
                alt1=3;
                }
                break;
            case TRUE:
                {
                alt1=4;
                }
                break;
            case FALSE:
                {
                alt1=5;
                }
                break;
            case NULL:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("42:1: value returns [Object result] : (s= string | n= number | o= object | TRUE | FALSE | NULL );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /development/JSON Parser/grammar/JSONTree.g:43:4: s= string
                    {
                    pushFollow(FOLLOW_string_in_value50);
                    s=string();
                    _fsp--;

                     result = s; 

                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSONTree.g:44:4: n= number
                    {
                    pushFollow(FOLLOW_number_in_value60);
                    n=number();
                    _fsp--;

                     result = n; 

                    }
                    break;
                case 3 :
                    // /development/JSON Parser/grammar/JSONTree.g:45:4: o= object
                    {
                    pushFollow(FOLLOW_object_in_value69);
                    o=object();
                    _fsp--;

                     result = o; 

                    }
                    break;
                case 4 :
                    // /development/JSON Parser/grammar/JSONTree.g:47:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_value77); 
                     result =Boolean.TRUE; 

                    }
                    break;
                case 5 :
                    // /development/JSON Parser/grammar/JSONTree.g:48:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_value84); 
                    result = Boolean.FALSE; 

                    }
                    break;
                case 6 :
                    // /development/JSON Parser/grammar/JSONTree.g:49:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_value91); 
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
    // /development/JSON Parser/grammar/JSONTree.g:52:1: string returns [String result] : ^( STRING String ) ;
    public final String string() throws RecognitionException {
        String result = null;

        CommonTree String1=null;

        try {
            // /development/JSON Parser/grammar/JSONTree.g:53:4: ( ^( STRING String ) )
            // /development/JSON Parser/grammar/JSONTree.g:53:4: ^( STRING String )
            {
            match(input,STRING,FOLLOW_STRING_in_string109); 

            match(input, Token.DOWN, null); 
            String1=(CommonTree)input.LT(1);
            match(input,String,FOLLOW_String_in_string111); 

            match(input, Token.UP, null); 
             result = extractString(String1); 

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


    // $ANTLR start object
    // /development/JSON Parser/grammar/JSONTree.g:57:1: object returns [Map result] : ^( OBJECT ( pair[$result] )+ ) ;
    public final Map object() throws RecognitionException {
        Map result = null;

         result = new HashMap(); 
        try {
            // /development/JSON Parser/grammar/JSONTree.g:59:4: ( ^( OBJECT ( pair[$result] )+ ) )
            // /development/JSON Parser/grammar/JSONTree.g:59:4: ^( OBJECT ( pair[$result] )+ )
            {
            match(input,OBJECT,FOLLOW_OBJECT_in_object139); 

            match(input, Token.DOWN, null); 
            // /development/JSON Parser/grammar/JSONTree.g:59:13: ( pair[$result] )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FIELD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /development/JSON Parser/grammar/JSONTree.g:59:13: pair[$result]
            	    {
            	    pushFollow(FOLLOW_pair_in_object141);
            	    pair(result);
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 

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
    // $ANTLR end object


    // $ANTLR start number
    // /development/JSON Parser/grammar/JSONTree.g:62:1: number returns [Object result] : ^( NUMBER Number ( Exponent )? ) ;
    public final Object number() throws RecognitionException {
        Object result = null;

        CommonTree Number2=null;
        CommonTree Exponent3=null;

        try {
            // /development/JSON Parser/grammar/JSONTree.g:63:4: ( ^( NUMBER Number ( Exponent )? ) )
            // /development/JSON Parser/grammar/JSONTree.g:63:4: ^( NUMBER Number ( Exponent )? )
            {
            match(input,NUMBER,FOLLOW_NUMBER_in_number161); 

            match(input, Token.DOWN, null); 
            Number2=(CommonTree)input.LT(1);
            match(input,Number,FOLLOW_Number_in_number163); 
            // /development/JSON Parser/grammar/JSONTree.g:63:20: ( Exponent )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Exponent) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /development/JSON Parser/grammar/JSONTree.g:63:20: Exponent
                    {
                    Exponent3=(CommonTree)input.LT(1);
                    match(input,Exponent,FOLLOW_Exponent_in_number165); 

                    }
                    break;

            }


            match(input, Token.UP, null); 
             result = extractNumber(Number2, Exponent3); 

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


    // $ANTLR start pair
    // /development/JSON Parser/grammar/JSONTree.g:70:1: pair[Map map] : ^( FIELD key= String v= value ) ;
    public final void pair(Map map) throws RecognitionException {
        CommonTree key=null;
        Object v = null;


        try {
            // /development/JSON Parser/grammar/JSONTree.g:71:4: ( ^( FIELD key= String v= value ) )
            // /development/JSON Parser/grammar/JSONTree.g:71:4: ^( FIELD key= String v= value )
            {
            match(input,FIELD,FOLLOW_FIELD_in_pair191); 

            match(input, Token.DOWN, null); 
            key=(CommonTree)input.LT(1);
            match(input,String,FOLLOW_String_in_pair195); 
            pushFollow(FOLLOW_value_in_pair199);
            v=value();
            _fsp--;


            match(input, Token.UP, null); 
             map.put(extractString(key), v); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end pair


 

    public static final BitSet FOLLOW_string_in_value50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_value77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_value84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_string111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OBJECT_in_object139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pair_in_object141 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_NUMBER_in_number161 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_Number_in_number163 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_Exponent_in_number165 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_in_pair191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_pair195 = new BitSet(new long[]{0x0000000000001C70L});
    public static final BitSet FOLLOW_value_in_pair199 = new BitSet(new long[]{0x0000000000000008L});

}