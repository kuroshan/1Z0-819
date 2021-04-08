import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); //true
        System.out.println(list.add("Sparrow")); //true

        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow 1")); //true
        System.out.println(set.add("Sparrow 1")); //false, no acepta agregar denuevo el mismo valor
    }
    
}
