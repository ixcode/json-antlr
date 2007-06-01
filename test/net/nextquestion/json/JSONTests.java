package net.nextquestion.json;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.io.IOException;

import com.sun.java_cup.internal.lexer;
import com.sun.java_cup.internal.parser;

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
        testViaTree("\"abcd\"", "(STRING \"abcd\")");
    }

    @Test
    public void testCharacterEscapes() throws IOException, RecognitionException {
        testViaTree("\"ab\\\\cd\"", "(STRING \"ab\\\\cd\")");
    }

    @Test
    public void testUnicodeCharacter() throws IOException, RecognitionException {
        testViaTree("\"\\u001C\"", "(STRING \"\\u001C\")");
    }


    @Test
    public void testPositiveInteger() throws IOException, RecognitionException {
        testViaTree("12345", "(NUMBER 12345)");
    }

    @Test
    public void testNegativeInteger() throws IOException, RecognitionException {
        testViaTree("-12345", "(NUMBER -12345)");
    }

    @Test
    public void testPositiveRealNoExponent() throws IOException, RecognitionException {
        testViaTree("123.45", "(NUMBER 123.45)");
    }

    @Test
    public void testNegativeRealNoExponent() throws IOException, RecognitionException {
        testViaTree("-123.45", "(NUMBER -123.45)");
    }

    @Test
    public void testPositiveRealExponent() throws IOException, RecognitionException {
        testViaTree("123.45e4", "(NUMBER 123.45e4)");
    }

    @Test
    public void testNegativeRealExponent() throws IOException, RecognitionException {
        testViaTree("123.45E-4", "(NUMBER 123.45E-4)");
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
        testViaTree("0", "(NUMBER 0)");
    }

    @Test
    public void testObject() throws IOException, RecognitionException {
        testViaTree("{\"name\":\"anObject\",\"value\":5}",
                "(OBJECT (FIELD \"name\" (STRING \"anObject\")) (FIELD \"value\" (NUMBER 5)))");
    }

    @Test
    public void testArray() throws IOException, RecognitionException {
        testViaTree("[\"one\",2]", "(ARRAY (STRING \"one\") (NUMBER 2))");
    }

    @Test
    public void testTrue() throws IOException, RecognitionException {
        testViaTree("true", "TRUE");
    }

    @Test
    public void testFalse() throws IOException, RecognitionException {
        testViaTree("false", "FALSE");
    }

    @Test
    public void testNull() throws IOException, RecognitionException {
        testViaTree("null", "NULL");
    }

    private void testViaTree(String source, String expected) throws IOException, RecognitionException {
        JSONParser parser = createParser(source);
        ParserRuleReturnScope result = parser.value();
        String st = toStringTree(result);
        assert st.equals(expected) : "Expected " + expected + ", but found " + st;
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
