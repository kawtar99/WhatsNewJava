package java10;

import java.util.ArrayList;

/**
 * Enhance the Java Language to extend type inference
 * to declarations of local variables with initializers.
 */
public class VarExample {

    public static void main(String[] args) {
        var array = new ArrayList<Integer>();
        System.out.println(array.getClass().getName());

        var simpleString = "test string";
        System.out.println(simpleString.getClass().getName());
    }
}
