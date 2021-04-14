import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); //[hawk]
        System.out.println(birds.size()); //1
        birds.set(0, "robin"); //[robin]
        System.out.println(birds.size()); //1
        birds.set(1, "robin"); //RUNTIME: IndexOutOfBoundsException
    }
}
