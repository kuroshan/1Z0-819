import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));



        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (s1, s2) -> s1.concat(s2);
        System.out.println(b1.apply("baby", "chirp"));
        System.out.println(b2.apply("baby", "chirp"));

    }
    
}
