package net.nextquestion.json;

import org.testng.annotations.Test;
import org.antlr.runtime.RecognitionException;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: rdclark
 * Date: Jun 3, 2007
 * Time: 12:59:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class JSONTreeParserTests extends AbstractJSONTests {

    @Test
    public void testString() throws IOException, RecognitionException {
        testViaTreeParser("\"testing\"", "testing");
    }

    @Test
    public void testBooleans() throws IOException, RecognitionException {
        testViaTreeParser("true", Boolean.TRUE);
        testViaTreeParser("false", Boolean.FALSE);
    }

    @Test
    public void testNull() throws IOException, RecognitionException {
        JSONTree parser = createTreeParser("null");
        Object result = parser.value();
        assert result == null : "Expected null, found " + result;
    }

    @Test
    public void testInteger() throws IOException, RecognitionException {
        testViaTreeParser("12345", new Integer(12345));
        testViaTreeParser("-12345", new Integer(-12345));
    }

    @Test
    public void testFloat() throws IOException, RecognitionException {
        testViaTreeParser("123.45", new Double(123.45));
        testViaTreeParser("-123.45", new Double(-123.45));
    }


    protected void testViaTreeParser(String testString, Object expected) throws IOException, RecognitionException {
        JSONTree parser = createTreeParser(testString);
        Object result = parser.value();
        assert expected.equals(result) : "Expected " + expected + " but found " + result;
    }

}
