import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();
        map.put('x', "spot");
        System.out.println("X marks the " + map.get('x')); //X marks the x
        System.out.println("X marks the " + map.getOrDefault('x', "")); //X marks the x
        System.out.println("Y marks the " + map.get('y')); //Y marks the null
        System.out.println("Y marks the " + map.getOrDefault('u', "")); //Y marks the 

        
    }
}
