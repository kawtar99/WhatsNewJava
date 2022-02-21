package java13;

/**
 * Since Java 13, switch statements include a yield statement
 * that enables returning values from a switch expression
 */
public class YieldSwitch {

    public static int executeOperation(String operation, int a){
        int result = switch (operation) {
            case "double":
                yield a + a;
            case "square":
                yield a * a;
            default:
                yield a;
        };
        return result;
    }
}
