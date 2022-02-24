package java11;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 11 introduces var in lambda parameters
 * this allows us to use annotate these variables in Lambda expressions
 */
public class LocalVariableLambda {

    public static void main(String[] args) {
        List<String> sampleList = Arrays.asList("Java", "C++");
        String resultString = sampleList.stream()
                .map((@NotNull var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(sampleList);
    }
}
