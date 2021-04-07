import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Integer pounds = 120; //autoboxing
        Character letter = "robot".charAt(0); //autoboxig
        char r = letter; //unboxing


        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0); //NullPointerException


        
    }
    
}
