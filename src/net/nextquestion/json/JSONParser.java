// $ANTLR 3.0 /development/JSON Parser/grammar/JSON.g 2007-06-01 13:04:13

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "NUMBER", "OBJECT", "FIELD", "ARRAY", "COMMA", "String", "Number", "Digit", "EscapeSequence", "UnicodeEscape", "HexDigit", "'{'", "'}'", "'['", "']'", "':'"
    };
    public static final int String=10;
    public static final int COMMA=9;
    public static final int OBJECT=6;
    public static final int UnicodeEscape=14;
    public static final int ARRAY=8;
    public static final int Digit=12;
    public static final int HexDigit=15;
    public static final int EscapeSequence=13;
    public static final int EOF=-1;
    public static final int NUMBER=5;
    public static final int STRING=4;
    public static final int Number=11;
    public static final int FIELD=7;

        public JSONParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[7+1];
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
    // /development/JSON Parser/grammar/JSON.g:22:1: value : ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) | object | array );
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String1=null;
        Token Number2=null;
        object_return object3 = null;

        array_return array4 = null;


        Object String1_tree=null;
        Object Number2_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");

        try {
            // /development/JSON Parser/grammar/JSON.g:23:4: ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) | object | array )
            int alt1=4;
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
            case 16:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("22:1: value : ( String -> ^( STRING String ) | Number -> ^( NUMBER Number ) | object | array );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:23:4: String
                    {
                    String1=(Token)input.LT(1);
                    match(input,String,FOLLOW_String_in_value70); if (failed) return retval;
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
                    match(input,Number,FOLLOW_Number_in_value83); if (failed) return retval;
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

                    pushFollow(FOLLOW_object_in_value96);
                    object3=object();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, object3.getTree());

                    }
                    break;
                case 4 :
                    // /development/JSON Parser/grammar/JSON.g:26:4: array
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_array_in_value101);
                    array4=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, array4.getTree());

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
    // /development/JSON Parser/grammar/JSON.g:29:1: object : '{' members '}' -> ^( OBJECT members ) ;
    public final object_return object() throws RecognitionException {
        object_return retval = new object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal5=null;
        Token char_literal7=null;
        members_return members6 = null;


        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleSubtreeStream stream_members=new RewriteRuleSubtreeStream(adaptor,"rule members");
        try {
            // /development/JSON Parser/grammar/JSON.g:29:10: ( '{' members '}' -> ^( OBJECT members ) )
            // /development/JSON Parser/grammar/JSON.g:29:10: '{' members '}'
            {
            char_literal5=(Token)input.LT(1);
            match(input,16,FOLLOW_16_in_object111); if (failed) return retval;
            if ( backtracking==0 ) stream_16.add(char_literal5);

            pushFollow(FOLLOW_members_in_object113);
            members6=members();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_members.add(members6.getTree());
            char_literal7=(Token)input.LT(1);
            match(input,17,FOLLOW_17_in_object115); if (failed) return retval;
            if ( backtracking==0 ) stream_17.add(char_literal7);


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
            // 30:4: -> ^( OBJECT members )
            {
                // /development/JSON Parser/grammar/JSON.g:30:7: ^( OBJECT members )
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

    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start array
    // /development/JSON Parser/grammar/JSON.g:33:1: array : '[' elements ']' -> ^( ARRAY elements ) ;
    public final array_return array() throws RecognitionException {
        array_return retval = new array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        elements_return elements9 = null;


        Object char_literal8_tree=null;
        Object char_literal10_tree=null;
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleSubtreeStream stream_elements=new RewriteRuleSubtreeStream(adaptor,"rule elements");
        try {
            // /development/JSON Parser/grammar/JSON.g:33:9: ( '[' elements ']' -> ^( ARRAY elements ) )
            // /development/JSON Parser/grammar/JSON.g:33:9: '[' elements ']'
            {
            char_literal8=(Token)input.LT(1);
            match(input,18,FOLLOW_18_in_array137); if (failed) return retval;
            if ( backtracking==0 ) stream_18.add(char_literal8);

            pushFollow(FOLLOW_elements_in_array139);
            elements9=elements();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_elements.add(elements9.getTree());
            char_literal10=(Token)input.LT(1);
            match(input,19,FOLLOW_19_in_array141); if (failed) return retval;
            if ( backtracking==0 ) stream_19.add(char_literal10);


            // AST REWRITE
            // elements: elements
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 34:4: -> ^( ARRAY elements )
            {
                // /development/JSON Parser/grammar/JSON.g:34:7: ^( ARRAY elements )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ARRAY, "ARRAY"), root_1);

                adaptor.addChild(root_1, stream_elements.next());

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
    // $ANTLR end array

    public static class elements_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elements
    // /development/JSON Parser/grammar/JSON.g:37:1: elements : value ( ( COMMA value )+ | ) ;
    public final elements_return elements() throws RecognitionException {
        elements_return retval = new elements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA12=null;
        value_return value11 = null;

        value_return value13 = null;


        Object COMMA12_tree=null;

        try {
            // /development/JSON Parser/grammar/JSON.g:37:11: ( value ( ( COMMA value )+ | ) )
            // /development/JSON Parser/grammar/JSON.g:37:11: value ( ( COMMA value )+ | )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_value_in_elements161);
            value11=value();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, value11.getTree());
            // /development/JSON Parser/grammar/JSON.g:38:9: ( ( COMMA value )+ | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==COMMA) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("38:9: ( ( COMMA value )+ | )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:39:11: ( COMMA value )+
                    {
                    // /development/JSON Parser/grammar/JSON.g:39:11: ( COMMA value )+
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
                    	    // /development/JSON Parser/grammar/JSON.g:39:12: COMMA value
                    	    {
                    	    COMMA12=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_elements185); if (failed) return retval;
                    	    pushFollow(FOLLOW_value_in_elements188);
                    	    value13=value();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, value13.getTree());

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
                    // /development/JSON Parser/grammar/JSON.g:41:9: 
                    {
                    }
                    break;

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
    // $ANTLR end elements

    public static class members_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start members
    // /development/JSON Parser/grammar/JSON.g:44:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );
    public final members_return members() throws RecognitionException {
        members_return retval = new members_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA15=null;
        pair_return pair14 = null;

        pair_return pair16 = null;

        pair_return pair17 = null;


        Object COMMA15_tree=null;

        try {
            // /development/JSON Parser/grammar/JSON.g:44:10: ( ( pair COMMA )=> pair ( COMMA pair )+ | pair )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==String) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==20) ) {
                    switch ( input.LA(3) ) {
                    case String:
                        {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==17) ) {
                            alt5=2;
                        }
                        else if ( (LA5_3==COMMA) && (synpred1())) {
                            alt5=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("44:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 5, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Number:
                        {
                        int LA5_4 = input.LA(4);

                        if ( (LA5_4==17) ) {
                            alt5=2;
                        }
                        else if ( (LA5_4==COMMA) && (synpred1())) {
                            alt5=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("44:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 5, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 16:
                        {
                        int LA5_5 = input.LA(4);

                        if ( (synpred1()) ) {
                            alt5=1;
                        }
                        else if ( (true) ) {
                            alt5=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("44:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 5, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 18:
                        {
                        int LA5_6 = input.LA(4);

                        if ( (synpred1()) ) {
                            alt5=1;
                        }
                        else if ( (true) ) {
                            alt5=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("44:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 5, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("44:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 5, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("44:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("44:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:44:10: ( pair COMMA )=> pair ( COMMA pair )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pair_in_members231);
                    pair14=pair();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pair14.getTree());
                    // /development/JSON Parser/grammar/JSON.g:44:31: ( COMMA pair )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /development/JSON Parser/grammar/JSON.g:44:32: COMMA pair
                    	    {
                    	    COMMA15=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_members234); if (failed) return retval;
                    	    pushFollow(FOLLOW_pair_in_members237);
                    	    pair16=pair();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, pair16.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSON.g:45:4: pair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pair_in_members244);
                    pair17=pair();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pair17.getTree());

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
    // /development/JSON Parser/grammar/JSON.g:48:1: pair : String ':' value -> ^( FIELD String value ) ;
    public final pair_return pair() throws RecognitionException {
        pair_return retval = new pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String18=null;
        Token char_literal19=null;
        value_return value20 = null;


        Object String18_tree=null;
        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /development/JSON Parser/grammar/JSON.g:48:8: ( String ':' value -> ^( FIELD String value ) )
            // /development/JSON Parser/grammar/JSON.g:48:8: String ':' value
            {
            String18=(Token)input.LT(1);
            match(input,String,FOLLOW_String_in_pair256); if (failed) return retval;
            if ( backtracking==0 ) stream_String.add(String18);

            char_literal19=(Token)input.LT(1);
            match(input,20,FOLLOW_20_in_pair258); if (failed) return retval;
            if ( backtracking==0 ) stream_20.add(char_literal19);

            pushFollow(FOLLOW_value_in_pair260);
            value20=value();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_value.add(value20.getTree());

            // AST REWRITE
            // elements: String, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:4: -> ^( FIELD String value )
            {
                // /development/JSON Parser/grammar/JSON.g:49:7: ^( FIELD String value )
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
        // /development/JSON Parser/grammar/JSON.g:44:10: ( pair COMMA )
        // /development/JSON Parser/grammar/JSON.g:44:11: pair COMMA
        {
        pushFollow(FOLLOW_pair_in_synpred1224);
        pair();
        _fsp--;
        if (failed) return ;
        match(input,COMMA,FOLLOW_COMMA_in_synpred1226); if (failed) return ;

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


 

    public static final BitSet FOLLOW_String_in_value70 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_value83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_object111 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_members_in_object113 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_object115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_array137 = new BitSet(new long[]{0x0000000000050C00L});
    public static final BitSet FOLLOW_elements_in_array139 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_array141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_elements161 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_elements185 = new BitSet(new long[]{0x0000000000050C00L});
    public static final BitSet FOLLOW_value_in_elements188 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_pair_in_members231 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_members234 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_pair_in_members237 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_pair_in_members244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_pair256 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_pair258 = new BitSet(new long[]{0x0000000000050C00L});
    public static final BitSet FOLLOW_value_in_pair260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_in_synpred1224 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_synpred1226 = new BitSet(new long[]{0x0000000000000002L});

}