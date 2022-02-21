package java9;


/**
 * Since Java 9
 * Interfaces are allowed to have private methods
 */
public interface PrivateInterface {

    default void doSomething(){
        privateDoSomething();
    }

    private void privateDoSomething(){
        System.out.println("Do something from private method");
    }

}
