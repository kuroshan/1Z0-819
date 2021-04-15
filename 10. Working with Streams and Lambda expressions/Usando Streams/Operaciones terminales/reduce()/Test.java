import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        var array = new String[] {"w", "o", "l", "f"};
        var result = "";
        for (var s : array) result = result + s;
        System.out.println(result); //wolf


        
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); //wolf



        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        String word2 = stream2.reduce("", String::concat);
        System.out.println(word2); //wolf



        Stream<Integer> stream3 = Stream.of(3, 5, 6);
        System.out.println(stream3.reduce(1, (a, b) -> a*b));



        BinaryOperator<Integer> op = (a, b) -> a*b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty.reduce(op).ifPresent(System.out::println); //no output
        oneElement.reduce(op).ifPresent(System.out::println); //3
        threeElements.reduce(op).ifPresent(System.out::println); //90

        

        Stream<String> stream4 = Stream.of("w", "o", "l", "f!");
        int length = stream4.reduce(0, (i, s) -> i + s.length(), (a, b) -> a+b);
        System.out.println(length); //5
    }    
}