import java.util.ArrayList;
import java.util.Collection;

public class Test {

    public static void main(String[] args) {
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        birds.add("hawk");

        for (String bird : birds) //RUNTIME: ConcurrentModificationException
            birds.remove(bird);
    }
    
}
