package java11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NotPredicateTest {

    @Test
    void filterEmptyString() {

        List<String> list = Arrays.asList("not empty", "", "not empty 2", "");

        List<String> result = NotPredicate.filterEmptyString(list);
        System.out.println(result);
        assertEquals(result.size(), 2);
        assertThat(result).containsExactly("not empty", "not empty 2");
    }
}