import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        Consumer<List<Integer>> methodRef = Collections::sort;
        Consumer<List<Integer>> lambda = x -> Collections.sort(x);
    }
    
}
