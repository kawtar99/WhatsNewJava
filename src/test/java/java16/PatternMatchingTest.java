package java16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingTest {

    @Test
    void getStringLengthOfStringObject() {

        Object obj = new String("Test");
        int length = PatternMatching.getStringLength(obj);

        assertEquals(length, 4);
    }

    @Test
    void getStringLengthOfRegularObject() {

        Object obj = new Object();
        int length = PatternMatching.getStringLength(obj);

        assertEquals(length, -1);
    }
}