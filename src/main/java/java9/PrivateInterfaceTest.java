package java9;

public class PrivateInterfaceTest implements PrivateInterface {

    public static void main(String[] args) {
        PrivateInterface pi = new PrivateInterfaceTest();
        pi.doSomething();
    }
}
