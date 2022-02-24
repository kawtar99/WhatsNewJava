package java13;

/**
 * This feature allows us to embed JSON, XML ... in a more readable way
 */
public class TextBlock {

    //Before Java 13:
    public static String JSON_STRING_PRE12 = "{\r\n" + "\"name\" : \"Toto\",\r\n" + "\"address\" : \"Rue Gay Lussac\"\r\n" + "}";

    // Since Java 13:
    public static String JSON_STRING_12 =  """
    {
        "name" : "Toto",
        "address" : "Rue Gay Lussac"
    }
    """;

}
