// $ANTLR 3.0 /development/JSON Parser/grammar/JSON.g 2007-06-01 11:54:50

package net.nextquestion.json;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JSONParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "NUMBER", "String", "Number", "Digit", "EscapeSequence", "UnicodeEscape", "HexDigit"
    };
    public static final int String=6;
    public static final int UnicodeEscape=10;
    public static final int Digit=8;
    public static final int HexDigit=11;
    public static final int EscapeSequence=9;
    public static final int EOF=-1;
    public static final int NUMBER=5;
    public static final int STRING=4;
    public static final int Number=7;

        public JSONParser(TokenStream input) {
            super(input);
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/development/JSON Parser/grammar/JSON.g"; }


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start value
    // /development/JSON Parser/grammar/JSON.g:21:1: value : ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) );
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String1=null;
        Token Number2=null;

        Object String1_tree=null;
        Object Number2_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");

        try {
            // /development/JSON Parser/grammar/JSON.g:22:4: ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==String) ) {
                alt1=1;
            }
            else if ( (LA1_0==Number) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("21:1: value : ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:22:4: String
                    {
                    String1=(Token)input.LT(1);
                    match(input,String,FOLLOW_String_in_value53); 
                    stream_String.add(String1);


                    // AST REWRITE
                    // elements: String
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 22:11: -> ^( STRING String )
                    {
                        // /development/JSON Parser/grammar/JSON.g:22:14: ^( STRING String )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_String.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSON.g:23:4: Number
                    {
                    Number2=(Token)input.LT(1);
                    match(input,Number,FOLLOW_Number_in_value66); 
                    stream_Number.add(Number2);


                    // AST REWRITE
                    // elements: Number
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 23:11: -> ^( NUMBER Number )
                    {
                        // /development/JSON Parser/grammar/JSON.g:23:14: ^( NUMBER Number )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(NUMBER, "NUMBER"), root_1);

                        adaptor.addChild(root_1, stream_Number.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }



                    }
                    break;

            }
            retval.stop = input.LT(-1);

                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end value


 

    public static final BitSet FOLLOW_String_in_value53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_value66 = new BitSet(new long[]{0x0000000000000002L});

}