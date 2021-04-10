import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test {

    public static void printList(List<Object> list) {
        for(Object x: list) 
            System.out.println(x);
    }

    public static void printList2(List<?> list) {
        for(Object x: list) 
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        //printList(keywords); //DOES NOT COMPILE: incompatible types: List<String> cannot be converted to List<Object>

        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(42));
        //List<Object> objects = numbers; //DOES NOT COMPILE: incompatible types: List<Integer> cannot be converted to List<Object>
        //objects.add("forty two");



        printList2(keywords);


        List<?> x1 = new ArrayList<>(); //x1: List<Object>
        var x2 = new ArrayList<>(); //x2: ArrayList<Object>
        System.out.println(x1 instanceof List); //true
        System.out.println(x1 instanceof ArrayList); //true
        System.out.println(x1 instanceof Collection); //true
        System.out.println(x2 instanceof List); //true
        System.out.println(x2 instanceof ArrayList); //true
        System.out.println(x1 instanceof Collection); //true

    }
    
}
