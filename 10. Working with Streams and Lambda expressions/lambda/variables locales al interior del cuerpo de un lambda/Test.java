import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Test {

    public static void main(String[] args) {
        BiFunction<Integer, Boolean, Integer> bf1 = (x, y) -> {int z = 0; return 5;};
        BiFunction<Integer, Boolean, Integer> bf2 = (a, b) -> {int a = 0; return 5;}; //DOES NOT COMPILE
    }

    //este metodo tiene 3 errores
    public void variables(int a) {
        int b = 1;
        Predicate<Integer> p1 = a -> {
            int b = 0;
            int c = 0;
            return b == c;}//falta semicolon al despues de las llaves
    }

}