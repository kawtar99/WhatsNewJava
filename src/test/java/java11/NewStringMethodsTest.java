package java11;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NewStringMethodsTest {

    @Test
    // repeat() allows concatenating a String with itself a given number of times
    public void testRepeat(){
        var string = "foo bar ";
        var result = string.repeat(2);

        assertEquals(result, "foo bar foo bar");
    }

    @Test
    // isBlank() can check if a String instance is empty or contains whitespace
    public void testIsBlank(){
        var isBlank = "   ".isBlank();
       assertTrue(isBlank);
    }

    @Test
    //strip()  can get rid of all leading and trailing whitespaces
    public void testStrip(){
        var strippedString = "  f oo  ".strip();
        assertEquals(strippedString, "f oo");
    }

    @Test
    // lines() can split a String instance into a Stream<String> of separate lines
    public void testLines(){
        List<String> lines = "foo\nbar".lines().toList();

        assertThat(lines).containsExactly("foo", "bar");
    }
}