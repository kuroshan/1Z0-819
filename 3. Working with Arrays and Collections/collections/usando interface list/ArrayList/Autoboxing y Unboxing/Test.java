import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> weights = new ArrayList<>();
        Integer w = 50; //autoboxing
        weights.add(w);
        weights.add(Integer.valueOf(60));
        weights.remove(Integer.valueOf(50));
        double first = weights.get(0); //unboxing



        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        //int h = heights.get(0); //RUNTIME: NullPointerException


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers); //[1]
    }
}
