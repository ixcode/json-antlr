// $ANTLR 3.0 /development/JSON Parser/grammar/JSON.g 2007-06-01 12:50:01

package net.nextquestion.json;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class JSONParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "NUMBER", "OBJECT", "FIELD", "COMMA", "String", "Number", "Digit", "EscapeSequence", "UnicodeEscape", "HexDigit", "'{'", "'}'", "':'"
    };
    public static final int String=9;
    public static final int COMMA=8;
    public static final int OBJECT=6;
    public static final int UnicodeEscape=13;
    public static final int Digit=11;
    public static final int HexDigit=14;
    public static final int EscapeSequence=12;
    public static final int EOF=-1;
    public static final int NUMBER=5;
    public static final int STRING=4;
    public static final int Number=10;
    public static final int FIELD=7;

        public JSONParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[5+1];
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
    // /development/JSON Parser/grammar/JSON.g:22:1: value : ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) | object );
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String1=null;
        Token Number2=null;
        object_return object3 = null;


        Object String1_tree=null;
        Object Number2_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");

        try {
            // /development/JSON Parser/grammar/JSON.g:23:4: ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) | object )
            int alt1=3;
            switch ( input.LA(1) ) {
            case String:
                {
                alt1=1;
                }
                break;
            case Number:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("22:1: value : ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) | object );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:23:4: String
                    {
                    String1=(Token)input.LT(1);
                    match(input,String,FOLLOW_String_in_value67); if (failed) return retval;
                    if ( backtracking==0 ) stream_String.add(String1);


                    // AST REWRITE
                    // elements: String
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 23:11: -> ^( STRING String )
                    {
                        // /development/JSON Parser/grammar/JSON.g:23:14: ^( STRING String )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_String.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSON.g:24:4: Number
                    {
                    Number2=(Token)input.LT(1);
                    match(input,Number,FOLLOW_Number_in_value80); if (failed) return retval;
                    if ( backtracking==0 ) stream_Number.add(Number2);


                    // AST REWRITE
                    // elements: Number
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 24:11: -> ^( NUMBER Number )
                    {
                        // /development/JSON Parser/grammar/JSON.g:24:14: ^( NUMBER Number )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(NUMBER, "NUMBER"), root_1);

                        adaptor.addChild(root_1, stream_Number.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // /development/JSON Parser/grammar/JSON.g:25:4: object
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_in_value93);
                    object3=object();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, object3.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start object
    // /development/JSON Parser/grammar/JSON.g:28:1: object : '{' members '}' -> ^( OBJECT members ) ;
    public final object_return object() throws RecognitionException {
        object_return retval = new object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal4=null;
        Token char_literal6=null;
        members_return members5 = null;


        Object char_literal4_tree=null;
        Object char_literal6_tree=null;
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleSubtreeStream stream_members=new RewriteRuleSubtreeStream(adaptor,"rule members");
        try {
            // /development/JSON Parser/grammar/JSON.g:28:10: ( '{' members '}' -> ^( OBJECT members ) )
            // /development/JSON Parser/grammar/JSON.g:28:10: '{' members '}'
            {
            char_literal4=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_object103); if (failed) return retval;
            if ( backtracking==0 ) stream_15.add(char_literal4);

            pushFollow(FOLLOW_members_in_object105);
            members5=members();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_members.add(members5.getTree());
            char_literal6=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_object107); if (failed) return retval;
            if ( backtracking==0 ) stream_16.add(char_literal6);


            // AST REWRITE
            // elements: members
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 29:4: -> ^( OBJECT members )
            {
                // /development/JSON Parser/grammar/JSON.g:29:7: ^( OBJECT members )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, "OBJECT"), root_1);

                adaptor.addChild(root_1, stream_members.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end object

    public static class members_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start members
    // /development/JSON Parser/grammar/JSON.g:32:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );
    public final members_return members() throws RecognitionException {
        members_return retval = new members_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA8=null;
        pair_return pair7 = null;

        pair_return pair9 = null;

        pair_return pair10 = null;


        Object COMMA8_tree=null;

        try {
            // /development/JSON Parser/grammar/JSON.g:32:10: ( ( pair COMMA )=> pair ( COMMA pair )+ | pair )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==String) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
                    switch ( input.LA(3) ) {
                    case String:
                        {
                        int LA3_3 = input.LA(4);

                        if ( (LA3_3==16) ) {
                            alt3=2;
                        }
                        else if ( (LA3_3==COMMA) && (synpred1())) {
                            alt3=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("32:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 3, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Number:
                        {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==COMMA) && (synpred1())) {
                            alt3=1;
                        }
                        else if ( (LA3_4==16) ) {
                            alt3=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("32:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 3, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 15:
                        {
                        int LA3_5 = input.LA(4);

                        if ( (synpred1()) ) {
                            alt3=1;
                        }
                        else if ( (true) ) {
                            alt3=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("32:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 3, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("32:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("32:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("32:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:32:10: ( pair COMMA )=> pair ( COMMA pair )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pair_in_members136);
                    pair7=pair();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pair7.getTree());
                    // /development/JSON Parser/grammar/JSON.g:32:31: ( COMMA pair )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==COMMA) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /development/JSON Parser/grammar/JSON.g:32:32: COMMA pair
                    	    {
                    	    COMMA8=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_members139); if (failed) return retval;
                    	    pushFollow(FOLLOW_pair_in_members142);
                    	    pair9=pair();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, pair9.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSON.g:33:4: pair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pair_in_members149);
                    pair10=pair();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pair10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end members

    public static class pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pair
    // /development/JSON Parser/grammar/JSON.g:36:1: pair : String ':' value -> ^( FIELD String value ) ;
    public final pair_return pair() throws RecognitionException {
        pair_return retval = new pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String11=null;
        Token char_literal12=null;
        value_return value13 = null;


        Object String11_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /development/JSON Parser/grammar/JSON.g:36:8: ( String ':' value -> ^( FIELD String value ) )
            // /development/JSON Parser/grammar/JSON.g:36:8: String ':' value
            {
            String11=(Token)input.LT(1);
            match(input,String,FOLLOW_String_in_pair161); if (failed) return retval;
            if ( backtracking==0 ) stream_String.add(String11);

            char_literal12=(Token)input.LT(1);
            match(input,17,FOLLOW_17_in_pair163); if (failed) return retval;
            if ( backtracking==0 ) stream_17.add(char_literal12);

            pushFollow(FOLLOW_value_in_pair165);
            value13=value();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_value.add(value13.getTree());

            // AST REWRITE
            // elements: value, String
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:4: -> ^( FIELD String value )
            {
                // /development/JSON Parser/grammar/JSON.g:37:7: ^( FIELD String value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FIELD, "FIELD"), root_1);

                adaptor.addChild(root_1, stream_String.next());
                adaptor.addChild(root_1, stream_value.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end pair

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // /development/JSON Parser/grammar/JSON.g:32:10: ( pair COMMA )
        // /development/JSON Parser/grammar/JSON.g:32:11: pair COMMA
        {
        pushFollow(FOLLOW_pair_in_synpred1129);
        pair();
        _fsp--;
        if (failed) return ;
        match(input,COMMA,FOLLOW_COMMA_in_synpred1131); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_String_in_value67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_value80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_object103 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_members_in_object105 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_object107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_in_members136 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_members139 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_pair_in_members142 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_pair_in_members149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_pair161 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_pair163 = new BitSet(new long[]{0x0000000000008600L});
    public static final BitSet FOLLOW_value_in_pair165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_in_synpred1129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_COMMA_in_synpred1131 = new BitSet(new long[]{0x0000000000000002L});

}