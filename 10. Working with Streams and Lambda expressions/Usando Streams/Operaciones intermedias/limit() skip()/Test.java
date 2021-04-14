import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);
        stream.skip(5) //salta 5 posiciones
              .limit(2)
              .forEach(System.out::println); //67
    }
}
