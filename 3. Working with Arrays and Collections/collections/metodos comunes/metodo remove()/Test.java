import java.util.ArrayList;
import java.util.Collection;

public class Test {
    
    public static void main(String[] args) {
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("toucan");
        birds.add("hawk");
        birds.add("canari");
        System.out.println(birds.remove("cardinal")); //false
        System.out.println(birds.remove("hawk")); //true
        System.out.println(birds);


        //OJO en List
        int index = 1;
        System.out.println(birds.remove(1)); //false, no elimina por que el metodo remove(index) es especifico de List no de Collection
        System.out.println(birds);
    }
}
