import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); //[f, l, o, w]



        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        Set<String> set2 = stream2.collect(Collectors.toSet());
        System.out.println(set2); //[f, w, l, o]

    }
}
