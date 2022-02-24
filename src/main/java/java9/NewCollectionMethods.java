package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Some methods have been added to the Collection framework to create immutable collections
 */
public class NewCollectionMethods {

    public static void main(String[] args) {
        List<String> newList = List.of("New", "List", "method");
        Set<String> newSet = Set.of("New", "List", "method");
        Map<String,Integer> newMap = Map.of("Hello", 1, "Java9", 1 );

        System.out.println(newList);
        System.out.println(newSet);
        System.out.println(newMap);
    }
}
