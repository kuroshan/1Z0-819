import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {
        var str = "abc";
        Predicate<String> methodRef = str::startsWith;
        Predicate<String> lambda = s -> str.startsWith(s);


        var random = new Random();
        Supplier<Integer> methodRef2 = random::nextInt;
        Supplier<Integer> lambda2 = () -> random.nextInt();
        
    }
    
}
