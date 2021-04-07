import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {
        Supplier<List<String>> methodRef = ArrayList::new;
        Supplier<List<String>> lambda = () -> new ArrayList();


        Function<Integer, List<String>> methodRef2 = ArrayList::new;
        Function<Integer, List<String>> lambda2 = x -> new ArrayList(x);
    }
    
}
