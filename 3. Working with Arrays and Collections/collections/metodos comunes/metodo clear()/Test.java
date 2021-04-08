import java.util.ArrayList;
import java.util.Collection;

public class Test {
    
    public static void main(String[] args) {
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.isEmpty()); //false
        System.out.println(birds.size()); //2
        birds.clear();
        System.out.println(birds.isEmpty()); //true
        System.out.println(birds.size()); //0
    }

}
