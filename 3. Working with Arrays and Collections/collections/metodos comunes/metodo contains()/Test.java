import java.util.Collection;

public class Test {

    public static void main(String[] args) {
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.contains("hawk")); //true, internamente ejecuta equals
        System.out.println(birds.contains("robin")); //false
    }
    
}
