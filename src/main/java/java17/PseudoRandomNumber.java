package java17;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

/**
 * New RandomGenerator API
 * for generation Pseudo-Random Number
 * RandomGeneratorFactory can use different algorithms interchangeably to generate numbers
 */
public class PseudoRandomNumber {

    public static void main(String[] args) {
        // L128X256MixRandom The random number generator algorithm used
        // Other algorithms can be specified
        // throws an IllegalArgumentException if the named algorithm is not found.
        IntStream intStream = RandomGeneratorFactory.of("L128X256MixRandom")
                .create()
                .ints(16, 0,100);

        intStream.forEach(System.out::println);
    }
}
