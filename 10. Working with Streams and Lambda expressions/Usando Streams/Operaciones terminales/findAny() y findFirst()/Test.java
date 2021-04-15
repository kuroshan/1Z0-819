import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<String> finite = Stream.of("monkey", "gorrilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        finite.findAny().ifPresent(System.out::println); //monkey (usually)
        infinite.findAny().ifPresent(System.out::println); //chimp
        
    }
}
