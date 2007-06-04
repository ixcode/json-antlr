// $ANTLR 3.0 /development/JSON Parser/grammar/JSON.g 2007-06-04 10:28:32

package net.nextquestion.json;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JSONLexer extends Lexer {
    public static final int T21=21;
    public static final int COMMA=9;
    public static final int OBJECT=6;
    public static final int Exponent=15;
    public static final int ARRAY=8;
    public static final int Digit=16;
    public static final int T22=22;
    public static final int HexDigit=20;
    public static final int NUMBER=5;
    public static final int WS=18;
    public static final int STRING=4;
    public static final int FALSE=11;
    public static final int T28=28;
    public static final int T23=23;
    public static final int FIELD=7;
    public static final int String=13;
    public static final int T25=25;
    public static final int UnicodeEscape=19;
    public static final int EscapeSequence=17;
    public static final int T26=26;
    public static final int EOF=-1;
    public static final int NULL=12;
    public static final int Tokens=29;
    public static final int T27=27;
    public static final int Number=14;
    public static final int T24=24;
    public static final int TRUE=10;
    public JSONLexer() {;} 
    public JSONLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/development/JSON Parser/grammar/JSON.g"; }

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // /development/JSON Parser/grammar/JSON.g:6:9: ( ',' )
            // /development/JSON Parser/grammar/JSON.g:6:9: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // /development/JSON Parser/grammar/JSON.g:7:7: ( 'true' )
            // /development/JSON Parser/grammar/JSON.g:7:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // /development/JSON Parser/grammar/JSON.g:8:7: ( 'false' )
            // /development/JSON Parser/grammar/JSON.g:8:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // /development/JSON Parser/grammar/JSON.g:9:7: ( 'null' )
            // /development/JSON Parser/grammar/JSON.g:9:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // /development/JSON Parser/grammar/JSON.g:10:7: ( '{' )
            // /development/JSON Parser/grammar/JSON.g:10:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // /development/JSON Parser/grammar/JSON.g:11:7: ( '}' )
            // /development/JSON Parser/grammar/JSON.g:11:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // /development/JSON Parser/grammar/JSON.g:12:7: ( '[' )
            // /development/JSON Parser/grammar/JSON.g:12:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // /development/JSON Parser/grammar/JSON.g:13:7: ( ']' )
            // /development/JSON Parser/grammar/JSON.g:13:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // /development/JSON Parser/grammar/JSON.g:14:7: ( ':' )
            // /development/JSON Parser/grammar/JSON.g:14:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start Number
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            // /development/JSON Parser/grammar/JSON.g:63:10: ( ( '-' )? ( Digit )+ ( '.' ( Digit )+ )? )
            // /development/JSON Parser/grammar/JSON.g:63:10: ( '-' )? ( Digit )+ ( '.' ( Digit )+ )?
            {
            // /development/JSON Parser/grammar/JSON.g:63:10: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:63:10: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /development/JSON Parser/grammar/JSON.g:63:15: ( Digit )+
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
            	    // /development/JSON Parser/grammar/JSON.g:63:15: Digit
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

            // /development/JSON Parser/grammar/JSON.g:63:22: ( '.' ( Digit )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:63:24: '.' ( Digit )+
                    {
                    match('.'); 
                    // /development/JSON Parser/grammar/JSON.g:63:28: ( Digit )+
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
                    	    // /development/JSON Parser/grammar/JSON.g:63:28: Digit
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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Number

    // $ANTLR start Exponent
    public final void mExponent() throws RecognitionException {
        try {
            int _type = Exponent;
            // /development/JSON Parser/grammar/JSON.g:65:11: ( ( 'e' | 'E' ) ( '-' )? ( Digit )+ )
            // /development/JSON Parser/grammar/JSON.g:65:11: ( 'e' | 'E' ) ( '-' )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /development/JSON Parser/grammar/JSON.g:65:21: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:65:21: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /development/JSON Parser/grammar/JSON.g:65:26: ( Digit )+
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
            	    // /development/JSON Parser/grammar/JSON.g:65:26: Digit
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Exponent

    // $ANTLR start String
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            // /development/JSON Parser/grammar/JSON.g:68:2: ( '\"' ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"' )
            // /development/JSON Parser/grammar/JSON.g:68:2: '\"' ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"'
            {
            match('\"'); 
            // /development/JSON Parser/grammar/JSON.g:68:6: ( EscapeSequence | ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>=' ' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFE')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // /development/JSON Parser/grammar/JSON.g:68:8: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // /development/JSON Parser/grammar/JSON.g:68:25: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' )
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
            	    break loop7;
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

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /development/JSON Parser/grammar/JSON.g:71:5: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // /development/JSON Parser/grammar/JSON.g:71:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // /development/JSON Parser/grammar/JSON.g:71:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /development/JSON Parser/grammar/JSON.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start EscapeSequence
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // /development/JSON Parser/grammar/JSON.g:74:10: ( '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // /development/JSON Parser/grammar/JSON.g:74:10: '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 
            // /development/JSON Parser/grammar/JSON.g:74:15: ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    new NoViableAltException("74:15: ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /development/JSON Parser/grammar/JSON.g:74:16: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 2 :
                    // /development/JSON Parser/grammar/JSON.g:74:31: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // /development/JSON Parser/grammar/JSON.g:74:35: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // /development/JSON Parser/grammar/JSON.g:74:39: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // /development/JSON Parser/grammar/JSON.g:74:43: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // /development/JSON Parser/grammar/JSON.g:74:47: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 7 :
                    // /development/JSON Parser/grammar/JSON.g:74:51: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 8 :
                    // /development/JSON Parser/grammar/JSON.g:74:56: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // /development/JSON Parser/grammar/JSON.g:74:61: '\\\\'
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
            // /development/JSON Parser/grammar/JSON.g:78:4: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // /development/JSON Parser/grammar/JSON.g:78:4: 'u' HexDigit HexDigit HexDigit HexDigit
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
            // /development/JSON Parser/grammar/JSON.g:82:4: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )
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
            // /development/JSON Parser/grammar/JSON.g:86:4: ( '0' .. '9' )
            // /development/JSON Parser/grammar/JSON.g:86:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    public void mTokens() throws RecognitionException {
        // /development/JSON Parser/grammar/JSON.g:1:10: ( COMMA | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | Number | Exponent | String | WS )
        int alt10=13;
        switch ( input.LA(1) ) {
        case ',':
            {
            alt10=1;
            }
            break;
        case 't':
            {
            alt10=2;
            }
            break;
        case 'f':
            {
            alt10=3;
            }
            break;
        case 'n':
            {
            alt10=4;
            }
            break;
        case '{':
            {
            alt10=5;
            }
            break;
        case '}':
            {
            alt10=6;
            }
            break;
        case '[':
            {
            alt10=7;
            }
            break;
        case ']':
            {
            alt10=8;
            }
            break;
        case ':':
            {
            alt10=9;
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt10=10;
            }
            break;
        case 'E':
        case 'e':
            {
            alt10=11;
            }
            break;
        case '\"':
            {
            alt10=12;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt10=13;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( COMMA | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | Number | Exponent | String | WS );", 10, 0, input);

            throw nvae;
        }

        switch (alt10) {
            case 1 :
                // /development/JSON Parser/grammar/JSON.g:1:10: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 2 :
                // /development/JSON Parser/grammar/JSON.g:1:16: T21
                {
                mT21(); 

                }
                break;
            case 3 :
                // /development/JSON Parser/grammar/JSON.g:1:20: T22
                {
                mT22(); 

                }
                break;
            case 4 :
                // /development/JSON Parser/grammar/JSON.g:1:24: T23
                {
                mT23(); 

                }
                break;
            case 5 :
                // /development/JSON Parser/grammar/JSON.g:1:28: T24
                {
                mT24(); 

                }
                break;
            case 6 :
                // /development/JSON Parser/grammar/JSON.g:1:32: T25
                {
                mT25(); 

                }
                break;
            case 7 :
                // /development/JSON Parser/grammar/JSON.g:1:36: T26
                {
                mT26(); 

                }
                break;
            case 8 :
                // /development/JSON Parser/grammar/JSON.g:1:40: T27
                {
                mT27(); 

                }
                break;
            case 9 :
                // /development/JSON Parser/grammar/JSON.g:1:44: T28
                {
                mT28(); 

                }
                break;
            case 10 :
                // /development/JSON Parser/grammar/JSON.g:1:48: Number
                {
                mNumber(); 

                }
                break;
            case 11 :
                // /development/JSON Parser/grammar/JSON.g:1:55: Exponent
                {
                mExponent(); 

                }
                break;
            case 12 :
                // /development/JSON Parser/grammar/JSON.g:1:64: String
                {
                mString(); 

                }
                break;
            case 13 :
                // /development/JSON Parser/grammar/JSON.g:1:71: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}