import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        method(consumer);



        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie");
        c2.accept("Annie");


        

        BiConsumer<String, String> c3 = (x, y) -> System.out.println(x + " " + y);
        c3.accept("Annie", "Luu");




        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chicken", 7);

    }

    public static void method(Consumer<String> funcInterface) {
        funcInterface.accept("TEST");
    }
}
