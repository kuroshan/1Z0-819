import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
        method(comparator);
    }

    public static void method(Comparator<String> funcInterface) {
       int x = funcInterface.compare("a", "b");
    }
}
