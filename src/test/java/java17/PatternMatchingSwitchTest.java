package java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingSwitchTest {

    @Test
    public void shouldFormatAnInteger(){
        String result = PatternMatchingSwitch.formatterPatternSwitch(2);
        assertEquals(result, "int 2");
    }

    @Test
    public void shouldFormatAString(){
        String result = PatternMatchingSwitch.formatterPatternSwitch("Hello!");
        assertEquals(result, "String Hello!");
    }

    @Test
    public void shouldFormatADouble(){
        String result = PatternMatchingSwitch.formatterPatternSwitch(2.0D);
        assertEquals(result, "double 2.000000");
    }

    @Test
    public void shouldFormatAnObject(){
        String result = PatternMatchingSwitch.formatterPatternSwitch(new Object());
        assertTrue(result.startsWith("java.lang.Object"));
    }
}