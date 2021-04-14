import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "TEST";
        method(supplier);



        Supplier<LocalDate> s1 = LocalDate::new;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();


        
        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
        ArrayList<String> a1 = s3.get();

    }

    public static void method(Supplier<String> funcInterface) {
        String test = funcInterface.get();
    }
}
