import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[]  array = new String[] {"a", "b", "c"};
        
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array); //IMMUTABLE
        List<String> copy = List.copyOf(asList); //IMMUTABLE
        
        array[0] = "z";

        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);

        asList.set(0, "x");
        System.out.println(Arrays.toString(array));

        copy.add("y"); //UnsupportedOperationException
    }
}
