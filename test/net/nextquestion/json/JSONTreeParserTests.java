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
    public void testParserCreation() throws IOException, RecognitionException {
        JSONTree parser = createTreeParser("foo");
        assert parser != null : "null parser";
    }

    @Test
    public void testString() throws IOException, RecognitionException {
        testViaTreeParser("\"testing\"", "testing");
    }

    
    protected void testViaTreeParser(String testString, Object expected) throws IOException, RecognitionException {
        JSONTree parser = createTreeParser(testString);
        Object result = parser.value();
        assert result.equals(expected) : "Expected " + expected + " but found " + result;
    }


}
