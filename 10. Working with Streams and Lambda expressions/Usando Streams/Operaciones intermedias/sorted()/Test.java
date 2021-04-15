import java.util.Comparator;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<String> stream = Stream.of("brown-", "bear-");
        stream.sorted()
              .forEach(System.out::print); //bear-brown-
        
        
        Stream<String> stream2 = Stream.of("brown-", "bear-");
        stream2.sorted(Comparator.reverseOrder()) //NO APLICA METODO DE REFERENCIA
               .forEach(System.out::print); //brown-bear-
    }
}
