import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                           .peek(System.out::println) //grizzly
                           .count();
        System.out.println(count); //1



        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();
        numbers.add(1);
        letters.add('a');
        Stream<List<?>> stream2 = Stream.of(numbers, letters);
        stream2.map(List::size).forEach(System.out::print); //11

        Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(x -> x.remove(0)) //MAL USO DE PEEK, DEBERIA SER SOLO PARA DEBUGING
           .map(List::size)
           .forEach(System.out::print); //00

    }
}
