package net.nextquestion.json;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: rdclark
 * Date: May 30, 2007
 * Time: 8:11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class JSONTests {


    @Test
    public void testSimpleString() throws IOException, RecognitionException {
        JSONParser parser = createParser("\"abcd\"");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(STRING \"abcd\")") : "Expected (STRING \"abcd\"), but found " + st;
    }

    @Test
    public void testCharacterEscapes() throws IOException, RecognitionException {
        JSONParser parser = createParser("\"ab\\\\cd\"");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(STRING \"ab\\\\cd\")") : "Expected (STRING \"ab\\\\cd\"), but found " + st;
    }

    @Test
    public void testUnicodeCharacter() throws IOException, RecognitionException {
        JSONParser parser = createParser("\"\\u001C\"");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(STRING \"\\u001C\")") : "Expected (DocFlavor.STRING\"\\u001C\"), but found " + st;
    }


    @Test
    public void testPositiveInteger() throws IOException, RecognitionException {
        JSONParser parser = createParser("12345");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(NUMBER 12345)") : "Expected (NUMBER 12345), but found " + st;
    }

    @Test
    public void testNegativeInteger() throws IOException, RecognitionException {
        JSONParser parser = createParser("-12345");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(NUMBER -12345)") : "Expected (NUMBER -12345), but found " + st;
    }

    @Test
    public void testPositiveRealNoExponent() throws IOException, RecognitionException {
        JSONParser parser = createParser("123.45");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(NUMBER 123.45)") : "Expected (NUMBER 123.45), but found " + st;
    }

    @Test
    public void testNegativeRealNoExponent() throws IOException, RecognitionException {
        JSONParser parser = createParser("-123.45");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(NUMBER -123.45)") : "Expected (NUMBER -123.45), but found " + st;
    }

    @Test
    public void testPositiveRealExponent() throws IOException, RecognitionException {
        JSONParser parser = createParser("123.45e4");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(NUMBER 123.45e4)") : "Expected (NUMBER 123.45e4), but found " + st;
    }

    @Test
    public void testNegativeRealExponent() throws IOException, RecognitionException {
        JSONParser parser = createParser("123.45E-4");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(NUMBER 123.45E-4)") : "Expected (NUMBER 123.45E-4), but found " + st;
    }

    @Test
    public void testDoubleZero() throws IOException, RecognitionException {
        JSONParser parser = createParser("00");
        // TODO signal an invalid item and continue
        ParserRuleReturnScope result = parser.value();
//        assert result == null : "Null result expected";
    }

    @Test
    public void testZero() throws IOException, RecognitionException {
        JSONParser parser = createParser("0");
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals("(NUMBER 0)") : "Expected (NUMBER 0), but found " + st;
    }


    private JSONParser createParser(JSONLexer lexer) throws IOException {
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        return parser;
    }

    private JSONParser createParser(String testString) throws IOException {
        JSONLexer lexer = createLexer(testString);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JSONParser parser = new JSONParser(tokens);
        return parser;
    }

    private JSONLexer createLexer(String testString) throws IOException {
        CharStream stream = new ANTLRStringStream(testString);
        JSONLexer lexer = new JSONLexer(stream);
        return lexer;
    }

    private String toStringTree(ParserRuleReturnScope result) {
        assert result != null;
        String st = ((Tree) result.getTree()).toStringTree();
        return st;
    }

}
