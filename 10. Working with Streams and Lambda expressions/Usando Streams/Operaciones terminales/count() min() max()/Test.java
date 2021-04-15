import java.util.Optional;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<String> s = Stream.of("monkey", "gorrilla", "bonobo");
        System.out.println(s.count()); //3



        Stream<String> st2 = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = st2.min((s1, s2) -> s1.length()-s2.length());
        min.ifPresent(System.out::println); //ape

     
        
        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); //false
    }
}
