package java10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ToUnmodifiableTest {

    List<Integer> list = List.of(1, 2, 3, 4, 5, 88, -5, 0, 4, 38);

    @Test
    public void shouldReturnUnmodifiableList(){
        List<Integer> evenList = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toUnmodifiableList());

        assertEquals(evenList.size(), 6);
        assertThrows(UnsupportedOperationException.class,
                () -> evenList.add(6));
    }

    @Test
    public void shouldReturnUnmodifiableSet(){
        Set<Integer> set = list.stream()
                .collect(Collectors.toUnmodifiableSet());

        assertEquals(set.size(), 9);
        assertThrows(UnsupportedOperationException.class,
                () -> set.add(6));
    }

}