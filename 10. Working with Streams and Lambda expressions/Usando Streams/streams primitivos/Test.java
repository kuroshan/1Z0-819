import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.mapToInt(x -> x).sum()); //6

        
        
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble()); //2.0

    }
}
