// $ANTLR 3.0 /development/JSON Parser/grammar/JSONTree.g 2007-06-03 17:47:14

package net.nextquestion.json;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "NUMBER", "OBJECT", "FIELD", "ARRAY", "COMMA", "TRUE", "FALSE", "NULL", "String", "Number", "Digit", "EscapeSequence", "UnicodeEscape", "HexDigit", "'true'", "'false'", "'null'", "'{'", "'}'", "'['", "']'", "':'"
    };
    public static final int String=13;
    public static final int COMMA=9;
    public static final int OBJECT=6;
    public static final int UnicodeEscape=17;
    public static final int ARRAY=8;
    public static final int Digit=15;
    public static final int EscapeSequence=16;
    public static final int HexDigit=18;
    public static final int NUMBER=5;
    public static final int EOF=-1;
    public static final int STRING=4;
    public static final int NULL=12;
    public static final int FALSE=11;
    public static final int Number=14;
    public static final int TRUE=10;
    public static final int FIELD=7;

        public JSONTree(TreeNodeStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/development/JSON Parser/grammar/JSONTree.g"; }



    // $ANTLR start value
    // /development/JSON Parser/grammar/JSONTree.g:13:1: value returns [Object result] : (s= string | TRUE | FALSE | NULL );
    public final Object value() throws RecognitionException {
        Object result = null;

        String s = null;


        try {
            // /development/JSON Parser/grammar/JSONTree.g:14:4: (s= string | TRUE | FALSE | NULL )
            int alt1=4;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt1=1;
                }
                break;
            case TRUE:
                {
                alt1=2;
                }
                break;
            case FALSE:
                {
                alt1=3;
                }
                break;
            case NULL:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("13:1: value returns [Object result] : (s= string | TRUE | FALSE | NULL );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /development/JSON Parser/grammar/JSONTree.g:14:4: s= string
                    {
                    pushFollow(FOLLOW_string_in_value45);
                    s=string();
                    _fsp--;

                     result = s; 

                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSONTree.g:18:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_value56); 
                     result =Boolean.TRUE; 

                    }
                    break;
                case 3 :
                    // /development/JSON Parser/grammar/JSONTree.g:19:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_value63); 
                    result = Boolean.FALSE; 

                    }
                    break;
                case 4 :
                    // /development/JSON Parser/grammar/JSONTree.g:20:4: NULL
                    {
                    match(input,NULL,FOLLOW_NULL_in_value70); 
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
    // /development/JSON Parser/grammar/JSONTree.g:23:1: string returns [String result] : ^( STRING String ) ;
    public final String string() throws RecognitionException {
        String result = null;

        CommonTree String1=null;

        try {
            // /development/JSON Parser/grammar/JSONTree.g:24:4: ( ^( STRING String ) )
            // /development/JSON Parser/grammar/JSONTree.g:24:4: ^( STRING String )
            {
            match(input,STRING,FOLLOW_STRING_in_string88); 

            match(input, Token.DOWN, null); 
            String1=(CommonTree)input.LT(1);
            match(input,String,FOLLOW_String_in_string90); 

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


 

    public static final BitSet FOLLOW_string_in_value45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_value56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_value63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_value70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_String_in_string90 = new BitSet(new long[]{0x0000000000000008L});

}