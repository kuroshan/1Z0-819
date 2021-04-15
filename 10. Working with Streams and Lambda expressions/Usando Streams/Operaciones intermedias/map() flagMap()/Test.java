import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        stream.map(String::length)
              .forEach(System.out::println); //6
                                             //7
                                             //6

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(m -> m.stream())
               .forEach(System.out::println);
    }
}
