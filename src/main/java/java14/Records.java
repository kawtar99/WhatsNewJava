package java14;

/**
 * Records are immutable objects representing simple data structures
 * Records are introduced in java 14 to reduce boilerplate code and enhance code lisibility
 */
public class Records {

    public record Person (String name, String address){}

    public static Person createPerson(String name, String address){
        return new Person(name, address);
    }
}
