import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal")); //false
        System.out.println(birds.remove("hawk")); //true
        System.out.println(birds.remove(0)); //hawk
        System.out.println(birds); //[]
    }
}
