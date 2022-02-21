package java12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewStringMethodsTest {

    @Test
    //  n spaces are inserted at the beginning of each line
    public void testPositiveIndentAString(){
        String multilineStr = "This is\na multiline\nstring.";
        String outputStr = "   This is\n   a multiline\n   string.\n";

        String postIndent = multilineStr.indent(3);

        assertEquals(postIndent, outputStr);
    }

    @Test
    //  n spaces are removed from the beginning of each line
    // if given line does not contain sufficient white space, then all leading white space characters are removed.
    public void testNegativeIndentAString(){
        String multilineStr = "   This is\n   a multiline\n   string.";
        String outputStr = " This is\n a multiline\n string.\n";

        String postIndent = multilineStr.indent(-2);

       assertEquals(postIndent, outputStr);
    }

    @Test
    // takes a Function as parameter. Transforms given string to produce a result
    public void testTrasform(){
        String result = "Java".transform(str -> str + " 11");

        assertEquals(result, "Java 11");
    }
}