import java.util.function.Function;
import java.util.function.BiFunction;

public class Test {

    public static void main(String[] args) {
        
        Function<String, Integer> f1 = (var num) -> 1;
        Function<String, Integer> f2 = var w -> 99;
        BiFunction<Integer, Boolean, String> bf1 = (var a, var d) -> "Hello";
        BiFunction<Integer, Integer, Boolean> bf2 = (var a, Integer d) -> true;
        MyFunction1 mf1 = (String x, var y, Integer z) -> true;
        MyFunction2 mf2 = (var b, var k, var m) -> 3.14159;
        BiFunction<Integer, Boolean, String> bf3 = (var x, y) -> "goodbye";

    }

}