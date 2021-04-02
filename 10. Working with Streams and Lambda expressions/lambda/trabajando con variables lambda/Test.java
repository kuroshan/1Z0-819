import java.util.List;
import java.util.function.Predicate;

public class Test {
    
    public static void main(String[] args) {
        
        Predicate<String> p1 = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;
    }

    public void whatAmI() {
        test((var x) -> x > 2, 123);
    }

    public void test(Predicate<Integer> c, int num) {
        c.test(num);
    }

    public void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
    }

}