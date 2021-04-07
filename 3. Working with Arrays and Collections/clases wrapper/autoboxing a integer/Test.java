import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1); //autoboxing
        numbers.add(Integer.valueOf(3));
        numbers.add(Integer.valueOf(5));
        numbers.remove(1); //DELETE FOR INDEX
        numbers.remove(Integer.valueOf(5)); //DELETE FOR OBJECT
        System.out.println(numbers);
    }
    
}
