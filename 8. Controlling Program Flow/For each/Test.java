import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for (String name : names) {
            System.out.println(name + ", ");
        }

        List<String> values = new ArrayList<String>();
        values.add("Liza");
        values.add("Kevin");
        values.add("Roger");
        for (var value : values) {
            System.out.println(value + ", ");
        }





        String names1 = "Lisa";
        for (String name : names1) { //DOES NOT COMPILE
            System.out.println(name + ", ");
        }





        String[] names3 = new String[3];
        for (int name : names3) { //DOES NOT COMPILE
            System.out.println(name + ", ");
        }
    }
}
