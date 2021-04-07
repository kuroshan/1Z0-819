import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        Predicate<String> methodRef = String::isEmpty;
        Predicate<String> lambda = s -> s.isEmpty();
           
        BiPredicate<String, String> methodRef2 = String::startsWith;
        BiPredicate<String, String> lambda2 = (s, p) -> s.startsWith(p);
    }
    
}
