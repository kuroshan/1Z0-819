import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        for (String string : list) {
            System.out.println(string);
        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String string = iter.next();
            System.out.println(string);
        }


        
    }
    
}
