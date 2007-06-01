// $ANTLR 3.0 /development/JSON Parser/grammar/JSON.g 2007-06-01 12:10:39

package net.nextquestion.json;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONLexer extends Lexer {
    public static final int String=6;
    public static final int UnicodeEscape=10;
    public static final int Digit=8;
    public static final int EscapeSequence=9;
    public static final int HexDigit=11;
    public static final int NUMBER=5;
    public static final int EOF=-1;
    public static final int STRING=4;
    public static final int Tokens=12;
    public static final int Number=7;
    public JSONLexer() {;} 
    public JSONLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/development/JSON Parser/grammar/JSON.g"; }

    // $ANTLR start Number
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            // /development/JSON Parser/grammar/JSON.g:26:10: ( ( '-' )? ( Digit )+ ( '.' ( Digit )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? ( Digit )+ )? )
            // /development/JSON Parser/grammar/JSON.g:26:10: ( '-' )? ( Digit )+ ( '.' ( Digit )+ )? ( ( 'E' | 'e' ) ( '+' | '-' )? ( Digit )+ )?
            {
            // /development/JSON Parser/grammar/JSON.g:26:10: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:26:10: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /development/JSON Parser/grammar/JSON.g:26:15: ( Digit )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /development/JSON Parser/grammar/JSON.g:26:15: Digit
            	    {
            	    mDigit(); 

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

            // /development/JSON Parser/grammar/JSON.g:26:22: ( '.' ( Digit )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:26:23: '.' ( Digit )+
                    {
                    match('.'); 
                    // /development/JSON Parser/grammar/JSON.g:26:27: ( Digit )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /development/JSON Parser/grammar/JSON.g:26:27: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            // /development/JSON Parser/grammar/JSON.g:26:36: ( ( 'E' | 'e' ) ( '+' | '-' )? ( Digit )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='E'||LA7_0=='e') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:26:37: ( 'E' | 'e' ) ( '+' | '-' )? ( Digit )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // /development/JSON Parser/grammar/JSON.g:26:47: ( '+' | '-' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='+'||LA5_0=='-') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /development/JSON Parser/grammar/JSON.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }

                    // /development/JSON Parser/grammar/JSON.g:26:58: ( Digit )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /development/JSON Parser/grammar/JSON.g:26:58: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Number

    // $ANTLR start String
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            // /development/JSON Parser/grammar/JSON.g:29:2: ( '\"' ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"' )
            // /development/JSON Parser/grammar/JSON.g:29:2: '\"' ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"'
            {
            match('\"'); 
            // /development/JSON Parser/grammar/JSON.g:29:6: ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>=' ' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFE')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // /development/JSON Parser/grammar/JSON.g:29:8: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // /development/JSON Parser/grammar/JSON.g:29:25: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' )
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end String

    // $ANTLR start EscapeSequence
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /development/JSON Parser/grammar/JSON.g:34:10: ( '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /development/JSON Parser/grammar/JSON.g:34:10: '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            // /development/JSON Parser/grammar/JSON.g:34:15: ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 'u':
                {
                alt9=1;
                }
                break;
            case 'b':
                {
                alt9=2;
                }
                break;
            case 't':
                {
                alt9=3;
                }
                break;
            case 'n':
                {
                alt9=4;
                }
                break;
            case 'f':
                {
                alt9=5;
                }
                break;
            case 'r':
                {
                alt9=6;
                }
                break;
            case '\"':
                {
                alt9=7;
                }
                break;
            case '\'':
                {
                alt9=8;
                }
                break;
            case '\\':
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("34:15: ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:34:16: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSON.g:34:31: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // /development/JSON Parser/grammar/JSON.g:34:35: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // /development/JSON Parser/grammar/JSON.g:34:39: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // /development/JSON Parser/grammar/JSON.g:34:43: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // /development/JSON Parser/grammar/JSON.g:34:47: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 7 :
                    // /development/JSON Parser/grammar/JSON.g:34:51: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 8 :
                    // /development/JSON Parser/grammar/JSON.g:34:56: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // /development/JSON Parser/grammar/JSON.g:34:61: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end EscapeSequence

    // $ANTLR start UnicodeEscape
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // /development/JSON Parser/grammar/JSON.g:38:4: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // /development/JSON Parser/grammar/JSON.g:38:4: 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end UnicodeEscape

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // /development/JSON Parser/grammar/JSON.g:42:4: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
            // /development/JSON Parser/grammar/JSON.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // /development/JSON Parser/grammar/JSON.g:46:4: ( '0' .. '9' )
            // /development/JSON Parser/grammar/JSON.g:46:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    public void mTokens() throws RecognitionException {
        // /development/JSON Parser/grammar/JSON.g:1:10: ( Number | String )
        int alt10=2;
        int LA10_0 = input.LA(1);

        if ( (LA10_0=='-'||(LA10_0>='0' && LA10_0<='9')) ) {
            alt10=1;
        }
        else if ( (LA10_0=='\"') ) {
            alt10=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( Number | String );", 10, 0, input);

            throw nvae;
        }
        switch (alt10) {
            case 1 :
                // /development/JSON Parser/grammar/JSON.g:1:10: Number
                {
                mNumber(); 

                }
                break;
            case 2 :
                // /development/JSON Parser/grammar/JSON.g:1:17: String
                {
                mString(); 

                }
                break;

        }

    }


 

}