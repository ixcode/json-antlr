// $ANTLR 3.0 /development/antlr/JSON Parser/grammar/JSON.g 2007-06-26 13:59:59

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "STRING", "NUMBER", "OBJECT", "FIELD", "ARRAY", "COMMA", "TRUE", "FALSE", "NULL", "String", "Number", "Exponent", "Digit", "EscapeSequence", "WS", "UnicodeEscape", "HexDigit", "'true'", "'false'", "'null'", "'{'", "'}'", "'['", "']'", "':'"
    };
    public static final int COMMA=9;
    public static final int OBJECT=6;
    public static final int Exponent=15;
    public static final int ARRAY=8;
    public static final int Digit=16;
    public static final int HexDigit=20;
    public static final int NUMBER=5;
    public static final int WS=18;
    public static final int STRING=4;
    public static final int FALSE=11;
    public static final int FIELD=7;
    public static final int String=13;
    public static final int UnicodeEscape=19;
    public static final int EscapeSequence=17;
    public static final int EOF=-1;
    public static final int NULL=12;
    public static final int Number=14;
    public static final int TRUE=10;

        public JSONParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[10+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/development/antlr/JSON Parser/grammar/JSON.g"; }


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start value
    // /development/antlr/JSON Parser/grammar/JSON.g:22:1: value : ( string | number | object | array | 'true' -> TRUE | 'false' -> FALSE | 'null' -> NULL );
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token string_literal6=null;
        Token string_literal7=null;
        string_return string1 = null;

        number_return number2 = null;

        object_return object3 = null;

        array_return array4 = null;


        Object string_literal5_tree=null;
        Object string_literal6_tree=null;
        Object string_literal7_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");

        try {
            // /development/antlr/JSON Parser/grammar/JSON.g:23:4: ( string | number | object | array | 'true' -> TRUE | 'false' -> FALSE | 'null' -> NULL )
            int alt1=7;
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
            case 24:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            case 22:
                {
                alt1=6;
                }
                break;
            case 23:
                {
                alt1=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("22:1: value : ( string | number | object | array | 'true' -> TRUE | 'false' -> FALSE | 'null' -> NULL );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:23:4: string
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_string_in_value79);
                    string1=string();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, string1.getTree());

                    }
                    break;
                case 2 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:24:4: number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_number_in_value84);
                    number2=number();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, number2.getTree());

                    }
                    break;
                case 3 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:25:4: object
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_object_in_value89);
                    object3=object();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, object3.getTree());

                    }
                    break;
                case 4 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:26:4: array
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_array_in_value94);
                    array4=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, array4.getTree());

                    }
                    break;
                case 5 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:27:4: 'true'
                    {
                    string_literal5=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_value99); if (failed) return retval;
                    if ( backtracking==0 ) stream_21.add(string_literal5);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 27:11: -> TRUE
                    {
                        adaptor.addChild(root_0, adaptor.create(TRUE, "TRUE"));

                    }

                    }

                    }
                    break;
                case 6 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:28:4: 'false'
                    {
                    string_literal6=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_value108); if (failed) return retval;
                    if ( backtracking==0 ) stream_22.add(string_literal6);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:12: -> FALSE
                    {
                        adaptor.addChild(root_0, adaptor.create(FALSE, "FALSE"));

                    }

                    }

                    }
                    break;
                case 7 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:29:4: 'null'
                    {
                    string_literal7=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_value117); if (failed) return retval;
                    if ( backtracking==0 ) stream_23.add(string_literal7);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 29:11: -> NULL
                    {
                        adaptor.addChild(root_0, adaptor.create(NULL, "NULL"));

                    }

                    }

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

    public static class string_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start string
    // /development/antlr/JSON Parser/grammar/JSON.g:32:1: string : String -> ^( STRING String ) ;
    public final string_return string() throws RecognitionException {
        string_return retval = new string_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String8=null;

        Object String8_tree=null;
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");

        try {
            // /development/antlr/JSON Parser/grammar/JSON.g:32:11: ( String -> ^( STRING String ) )
            // /development/antlr/JSON Parser/grammar/JSON.g:32:11: String
            {
            String8=(Token)input.LT(1);
            match(input,String,FOLLOW_String_in_string132); if (failed) return retval;
            if ( backtracking==0 ) stream_String.add(String8);


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
            // 33:4: -> ^( STRING String )
            {
                // /development/antlr/JSON Parser/grammar/JSON.g:33:7: ^( STRING String )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(STRING, "STRING"), root_1);

                adaptor.addChild(root_1, stream_String.next());

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
    // $ANTLR end string

    public static class number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start number
    // /development/antlr/JSON Parser/grammar/JSON.g:36:1: number : Number ( Exponent )? -> ^( NUMBER Number ( Exponent )? ) ;
    public final number_return number() throws RecognitionException {
        number_return retval = new number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Number9=null;
        Token Exponent10=null;

        Object Number9_tree=null;
        Object Exponent10_tree=null;
        RewriteRuleTokenStream stream_Exponent=new RewriteRuleTokenStream(adaptor,"token Exponent");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");

        try {
            // /development/antlr/JSON Parser/grammar/JSON.g:36:10: ( Number ( Exponent )? -> ^( NUMBER Number ( Exponent )? ) )
            // /development/antlr/JSON Parser/grammar/JSON.g:36:10: Number ( Exponent )?
            {
            Number9=(Token)input.LT(1);
            match(input,Number,FOLLOW_Number_in_number153); if (failed) return retval;
            if ( backtracking==0 ) stream_Number.add(Number9);

            // /development/antlr/JSON Parser/grammar/JSON.g:36:17: ( Exponent )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Exponent) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:36:17: Exponent
                    {
                    Exponent10=(Token)input.LT(1);
                    match(input,Exponent,FOLLOW_Exponent_in_number155); if (failed) return retval;
                    if ( backtracking==0 ) stream_Exponent.add(Exponent10);


                    }
                    break;

            }


            // AST REWRITE
            // elements: Number, Exponent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 37:4: -> ^( NUMBER Number ( Exponent )? )
            {
                // /development/antlr/JSON Parser/grammar/JSON.g:37:7: ^( NUMBER Number ( Exponent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(NUMBER, "NUMBER"), root_1);

                adaptor.addChild(root_1, stream_Number.next());
                // /development/antlr/JSON Parser/grammar/JSON.g:37:23: ( Exponent )?
                if ( stream_Exponent.hasNext() ) {
                    adaptor.addChild(root_1, stream_Exponent.next());

                }
                stream_Exponent.reset();

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
    // $ANTLR end number

    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start object
    // /development/antlr/JSON Parser/grammar/JSON.g:40:1: object : '{' members '}' -> ^( OBJECT members ) ;
    public final object_return object() throws RecognitionException {
        object_return retval = new object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal11=null;
        Token char_literal13=null;
        members_return members12 = null;


        Object char_literal11_tree=null;
        Object char_literal13_tree=null;
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_members=new RewriteRuleSubtreeStream(adaptor,"rule members");
        try {
            // /development/antlr/JSON Parser/grammar/JSON.g:40:10: ( '{' members '}' -> ^( OBJECT members ) )
            // /development/antlr/JSON Parser/grammar/JSON.g:40:10: '{' members '}'
            {
            char_literal11=(Token)input.LT(1);
            match(input,24,FOLLOW_24_in_object181); if (failed) return retval;
            if ( backtracking==0 ) stream_24.add(char_literal11);

            pushFollow(FOLLOW_members_in_object183);
            members12=members();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_members.add(members12.getTree());
            char_literal13=(Token)input.LT(1);
            match(input,25,FOLLOW_25_in_object185); if (failed) return retval;
            if ( backtracking==0 ) stream_25.add(char_literal13);


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
            // 41:4: -> ^( OBJECT members )
            {
                // /development/antlr/JSON Parser/grammar/JSON.g:41:7: ^( OBJECT members )
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
    // /development/antlr/JSON Parser/grammar/JSON.g:44:1: array : '[' elements ']' -> ^( ARRAY elements ) ;
    public final array_return array() throws RecognitionException {
        array_return retval = new array_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        elements_return elements15 = null;


        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_elements=new RewriteRuleSubtreeStream(adaptor,"rule elements");
        try {
            // /development/antlr/JSON Parser/grammar/JSON.g:44:9: ( '[' elements ']' -> ^( ARRAY elements ) )
            // /development/antlr/JSON Parser/grammar/JSON.g:44:9: '[' elements ']'
            {
            char_literal14=(Token)input.LT(1);
            match(input,26,FOLLOW_26_in_array208); if (failed) return retval;
            if ( backtracking==0 ) stream_26.add(char_literal14);

            pushFollow(FOLLOW_elements_in_array210);
            elements15=elements();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_elements.add(elements15.getTree());
            char_literal16=(Token)input.LT(1);
            match(input,27,FOLLOW_27_in_array212); if (failed) return retval;
            if ( backtracking==0 ) stream_27.add(char_literal16);


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
            // 45:4: -> ^( ARRAY elements )
            {
                // /development/antlr/JSON Parser/grammar/JSON.g:45:7: ^( ARRAY elements )
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
    // /development/antlr/JSON Parser/grammar/JSON.g:48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );
    public final elements_return elements() throws RecognitionException {
        elements_return retval = new elements_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA18=null;
        value_return value17 = null;

        value_return value19 = null;

        value_return value20 = null;


        Object COMMA18_tree=null;

        try {
            // /development/antlr/JSON Parser/grammar/JSON.g:48:10: ( ( value COMMA )=> value ( COMMA value )+ | value )
            int alt4=2;
            switch ( input.LA(1) ) {
            case String:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==COMMA) && (synpred1())) {
                    alt4=1;
                }
                else if ( (LA4_1==27) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case Number:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==Exponent) ) {
                    int LA4_10 = input.LA(3);

                    if ( (LA4_10==27) ) {
                        alt4=2;
                    }
                    else if ( (LA4_10==COMMA) && (synpred1())) {
                        alt4=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 10, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_2==27) ) {
                    alt4=2;
                }
                else if ( (LA4_2==COMMA) && (synpred1())) {
                    alt4=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==String) ) {
                    int LA4_11 = input.LA(3);

                    if ( (LA4_11==28) ) {
                        int LA4_12 = input.LA(4);

                        if ( (synpred1()) ) {
                            alt4=1;
                        }
                        else if ( (true) ) {
                            alt4=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 12, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 11, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                int LA4_4 = input.LA(2);

                if ( (synpred1()) ) {
                    alt4=1;
                }
                else if ( (true) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==27) ) {
                    alt4=2;
                }
                else if ( (LA4_5==COMMA) && (synpred1())) {
                    alt4=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6==COMMA) && (synpred1())) {
                    alt4=1;
                }
                else if ( (LA4_6==27) ) {
                    alt4=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            case 23:
                {
                int LA4_7 = input.LA(2);

                if ( (LA4_7==27) ) {
                    alt4=2;
                }
                else if ( (LA4_7==COMMA) && (synpred1())) {
                    alt4=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 7, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("48:1: elements : ( ( value COMMA )=> value ( COMMA value )+ | value );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:48:10: ( value COMMA )=> value ( COMMA value )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_elements239);
                    value17=value();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, value17.getTree());
                    // /development/antlr/JSON Parser/grammar/JSON.g:48:33: ( COMMA value )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /development/antlr/JSON Parser/grammar/JSON.g:48:34: COMMA value
                    	    {
                    	    COMMA18=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_elements242); if (failed) return retval;
                    	    pushFollow(FOLLOW_value_in_elements245);
                    	    value19=value();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, value19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:49:4: value
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_value_in_elements252);
                    value20=value();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, value20.getTree());

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
    // $ANTLR end elements

    public static class members_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start members
    // /development/antlr/JSON Parser/grammar/JSON.g:52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );
    public final members_return members() throws RecognitionException {
        members_return retval = new members_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMA22=null;
        pair_return pair21 = null;

        pair_return pair23 = null;

        pair_return pair24 = null;


        Object COMMA22_tree=null;

        try {
            // /development/antlr/JSON Parser/grammar/JSON.g:52:10: ( ( pair COMMA )=> pair ( COMMA pair )+ | pair )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==String) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==28) ) {
                    switch ( input.LA(3) ) {
                    case String:
                        {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3==25) ) {
                            alt6=2;
                        }
                        else if ( (LA6_3==COMMA) && (synpred2())) {
                            alt6=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Number:
                        {
                        int LA6_4 = input.LA(4);

                        if ( (LA6_4==Exponent) ) {
                            int LA6_12 = input.LA(5);

                            if ( (LA6_12==25) ) {
                                alt6=2;
                            }
                            else if ( (LA6_12==COMMA) && (synpred2())) {
                                alt6=1;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 12, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA6_4==25) ) {
                            alt6=2;
                        }
                        else if ( (LA6_4==COMMA) && (synpred2())) {
                            alt6=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 24:
                        {
                        int LA6_5 = input.LA(4);

                        if ( (synpred2()) ) {
                            alt6=1;
                        }
                        else if ( (true) ) {
                            alt6=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 26:
                        {
                        int LA6_6 = input.LA(4);

                        if ( (synpred2()) ) {
                            alt6=1;
                        }
                        else if ( (true) ) {
                            alt6=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 21:
                        {
                        int LA6_7 = input.LA(4);

                        if ( (LA6_7==COMMA) && (synpred2())) {
                            alt6=1;
                        }
                        else if ( (LA6_7==25) ) {
                            alt6=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 22:
                        {
                        int LA6_8 = input.LA(4);

                        if ( (LA6_8==COMMA) && (synpred2())) {
                            alt6=1;
                        }
                        else if ( (LA6_8==25) ) {
                            alt6=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 8, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 23:
                        {
                        int LA6_9 = input.LA(4);

                        if ( (LA6_9==25) ) {
                            alt6=2;
                        }
                        else if ( (LA6_9==COMMA) && (synpred2())) {
                            alt6=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 9, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("52:1: members : ( ( pair COMMA )=> pair ( COMMA pair )+ | pair );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:52:10: ( pair COMMA )=> pair ( COMMA pair )+
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pair_in_members270);
                    pair21=pair();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pair21.getTree());
                    // /development/antlr/JSON Parser/grammar/JSON.g:52:31: ( COMMA pair )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /development/antlr/JSON Parser/grammar/JSON.g:52:32: COMMA pair
                    	    {
                    	    COMMA22=(Token)input.LT(1);
                    	    match(input,COMMA,FOLLOW_COMMA_in_members273); if (failed) return retval;
                    	    pushFollow(FOLLOW_pair_in_members276);
                    	    pair23=pair();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, pair23.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /development/antlr/JSON Parser/grammar/JSON.g:53:4: pair
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_pair_in_members283);
                    pair24=pair();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pair24.getTree());

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
    // /development/antlr/JSON Parser/grammar/JSON.g:56:1: pair : String ':' value -> ^( FIELD String value ) ;
    public final pair_return pair() throws RecognitionException {
        pair_return retval = new pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token String25=null;
        Token char_literal26=null;
        value_return value27 = null;


        Object String25_tree=null;
        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // /development/antlr/JSON Parser/grammar/JSON.g:56:8: ( String ':' value -> ^( FIELD String value ) )
            // /development/antlr/JSON Parser/grammar/JSON.g:56:8: String ':' value
            {
            String25=(Token)input.LT(1);
            match(input,String,FOLLOW_String_in_pair295); if (failed) return retval;
            if ( backtracking==0 ) stream_String.add(String25);

            char_literal26=(Token)input.LT(1);
            match(input,28,FOLLOW_28_in_pair297); if (failed) return retval;
            if ( backtracking==0 ) stream_28.add(char_literal26);

            pushFollow(FOLLOW_value_in_pair299);
            value27=value();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_value.add(value27.getTree());

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
            // 57:4: -> ^( FIELD String value )
            {
                // /development/antlr/JSON Parser/grammar/JSON.g:57:7: ^( FIELD String value )
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
        // /development/antlr/JSON Parser/grammar/JSON.g:48:10: ( value COMMA )
        // /development/antlr/JSON Parser/grammar/JSON.g:48:11: value COMMA
        {
        pushFollow(FOLLOW_value_in_synpred1232);
        value();
        _fsp--;
        if (failed) return ;
        match(input,COMMA,FOLLOW_COMMA_in_synpred1234); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // /development/antlr/JSON Parser/grammar/JSON.g:52:10: ( pair COMMA )
        // /development/antlr/JSON Parser/grammar/JSON.g:52:11: pair COMMA
        {
        pushFollow(FOLLOW_pair_in_synpred2263);
        pair();
        _fsp--;
        if (failed) return ;
        match(input,COMMA,FOLLOW_COMMA_in_synpred2265); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
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


 

    public static final BitSet FOLLOW_string_in_value79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_value84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_value89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_value94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_value99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_value108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_value117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_string132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_number153 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_Exponent_in_number155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_object181 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_members_in_object183 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_object185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_array208 = new BitSet(new long[]{0x0000000005E06000L});
    public static final BitSet FOLLOW_elements_in_array210 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_array212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_elements239 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_elements242 = new BitSet(new long[]{0x0000000005E06000L});
    public static final BitSet FOLLOW_value_in_elements245 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_value_in_elements252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_in_members270 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_members273 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pair_in_members276 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_pair_in_members283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_pair295 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_pair297 = new BitSet(new long[]{0x0000000005E06000L});
    public static final BitSet FOLLOW_value_in_pair299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_synpred1232 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_synpred1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pair_in_synpred2263 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_synpred2265 = new BitSet(new long[]{0x0000000000000002L});

}