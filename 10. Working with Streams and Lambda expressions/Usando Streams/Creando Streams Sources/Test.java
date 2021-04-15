import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<String> empty = Stream.empty(); //count=0
        Stream<Integer> singleElement = Stream.of(1); //count=1
        Stream<String> fromArray = Stream.of(1,2,3); //count=3
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        


        //Stream Infinitos
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Double> oddNumbers = Stream.iterate(1, n -> n + 2);



        Stream<Integer> oddNumberUnder100 = Stream.iterate(1, //seed
                                                           n -> n > 100, //Predicate to specify when done 
                                                           n -> n + 2); //UnaryOperator to get next value
        //

    }
}
