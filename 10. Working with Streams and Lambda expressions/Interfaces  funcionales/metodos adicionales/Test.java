import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        Predicate<String> brownEggs2 = egg.and(brown);
        Predicate<String> otherEggs2 = egg.and(brown.negate());




        Consumer<String> c1 = x -> System.out.println("1: " + x);
        Consumer<String> c2 = x -> System.out.println("2: " + x);
        Consumer<String> combined1 = c1.andThen(c2);
        combined1.accept("Annie");


        
        
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined2 = after.compose(before);
        System.out.println(combined2.apply(3)); //8: primero se ejecuta before y el resultado se lo pasa a after
    }
}
