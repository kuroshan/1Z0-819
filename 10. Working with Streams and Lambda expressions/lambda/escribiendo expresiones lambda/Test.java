import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.BiPredicate;

public class Test {

    public static void main(String[] args) {
        //COMPILE
        Supplier<Duck> s1 = () -> new Duck();
        Function<Duck, String> f1 = d -> { return d.quack();};
        Function<Duck, String> f2 = (Duck d) -> d.quack();
        BiFunction<Animal, Duck, String> bf1 = (Animal a, Duck d) -> d.quack();

        //DOES NOT COMPILE
        BiFunction<String, Duck, Boolean> bf2 = a, b -> a.startsWith("test");
        Function<Duck, Boolean> f3 = Duck d -> d.canQuack();
        Function<String, Boolean> f4 = a -> { a.startsWith("test") };
        Function<String, Boolean> f5 = a -> { return a.startsWith("test") };
        BiPredicate<Swan, Duck> bf3 = (Swan s, t) -> s.compareTo(t) != 0;

    }
}