package java16;

public class PatternMatching {

    public static int getStringLength(Object obj){
        // checks the type and links the value of obj to a new variable s
        if (obj instanceof String s){
            return s.length();
        }
        return -1;
    }
}
