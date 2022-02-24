package java10;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OrELseThrowTest {

    @Test
    public void shouldFindElement(){
        Integer num = Stream.of(10, 20, 30).findAny().orElseThrow();

        assertEquals(num, 10);
    }

    @Test
    public void shouldThrowException(){
        assertThrows(NoSuchElementException.class,
                () -> Stream.of(10, 20, 30).filter(x -> x == 1).findAny().orElseThrow());
    }

}