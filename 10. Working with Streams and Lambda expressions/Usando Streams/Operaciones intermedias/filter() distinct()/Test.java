import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        stream.filter(x -> x.startsWith("m"))
              .forEach(System.out::println); //monkey



        Stream<String> stream2 = Stream.of("duck", "duck", "duck", "goose");
        stream2.distinct()
               .forEach(System.out::print); //duckgoose
        
    }
}
