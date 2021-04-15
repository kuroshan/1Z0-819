import java.util.Set;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); //MonkeyGorillaBonobo


        Stream<Integer> s1 = Stream.of(1);
        for (Integer i : s1) {} //DOES NOT COMPILE 

    }
}
