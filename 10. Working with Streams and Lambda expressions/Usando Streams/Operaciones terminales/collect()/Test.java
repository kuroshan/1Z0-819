import java.util.TreeSet;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new, //Supplier (crea)
                                            StringBuilder::append, //BiConsumer (acumula)
                                            StringBuilder::append); //BiConsumer (combia)
        System.out.println(word); //wolf



        //NO SE PUEDE USAR LA VARIABLE stream PORQUE DARIA ERROR EN RUNTIME: IllegalStateException: stream has already been operated upon or closed
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream2.collect(TreeSet::new, //Supplier (crea)
                                             TreeSet::add, //BiConsumer (acumula)
                                             TreeSet::addAll); //BiConsumer (combia)
        System.out.println(set); //[f, l, o, w]       
        



    }
}
