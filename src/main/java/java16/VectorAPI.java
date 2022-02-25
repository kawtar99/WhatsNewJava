package java16;


import java.util.stream.Stream;

/**
 * Vector API provides methods that perform optimally computations (on supporting CPU architectures)
 */
public class VectorAPI {

    /*
    // Example : this program will calculate the result of multiplying two arrays
    // without going through the arrays
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        // The size of the vector is  128 bits. The Vector will be able to hold the whole array
        // since the array has 4 integers of 4 bytes (4 * 32 = 128 bits)
        var vectorA = IntVector.fromArray(IntVector.SPECIES_128, a, 0);
        var vectorB = IntVector.fromArray(IntVector.SPECIES_128, b, 0);

        var vectorC = vectorA.mul(vectorB);

        var c = new int[a.length];
        vectorC.intoArray(c, 0);
        Stream.of(c)
                .forEach(System.out::println);
    }

     */
}
