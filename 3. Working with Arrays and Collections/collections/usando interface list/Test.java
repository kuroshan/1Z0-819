import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        List<String> linkend = new LinkedList<>();

        array.add("SD"); //SD
        array.add(0, "NY"); //NY, SD
        String elemnet =  array.set(1, "FL"); //NY, FL
        System.out.println(elemnet); //SD
        System.out.println(array.get(0)); //NY
        array.remove("NY"); //FL
        array.remove(0); //[]
        //array.set(0, "?"); //IndexOutOfBoundsException


        List<Integer> numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x*2);
        System.out.println(numbers); //[2, 4, 6]
    }
    
}
