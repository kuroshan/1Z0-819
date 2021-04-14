import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.equals("TEST");
        method(predicate);



        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = s -> s.isEmpty();
        System.out.println(p1.test("")); //true
        System.out.println(p2.test("")); //true



        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (s1, s2) -> s1.startsWith(s2);
        System.out.println(b1.test("chicken", "chick")); //true
        System.out.println(b2.test("chicken", "chick")); //true
    }

    public static void method(Predicate<String> funcInterface) {
        boolean b = funcInterface.test("TEST");
    }
}
