package java11;

import java.util.List;
import java.util.function.Predicate;

/**
 * not() method returns the negation of the predicate in parameters
 */
public class NotPredicate {

    public static List<String> filterEmptyString(List<String> list){
        Predicate<String> notEmpty = Predicate.not(String::isEmpty);

        return list.stream()
                .filter(notEmpty)
                .toList();
    }
}
