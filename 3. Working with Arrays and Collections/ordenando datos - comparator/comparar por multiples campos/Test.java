import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Squirrel> squirrels = Arrays.asList(new Squirrel(5, "A"), new Squirrel(2, "B"), new Squirrel(1, "A"));
        
        Comparator<Squirrel> methodRef = Comparator.comparing(Squirrel::getSpecies).thenComparingInt(Squirrel::getWeight);

        var reverse = Comparator.comparing(Squirrel::getSpecies).reversed();

        //Collections.sort(squirrels, new MultiFieldComparator());
        //Collections.sort(squirrels, methodRef);
        Collections.sort(squirrels, reverse);

        squirrels.forEach(System.out::println);
    }
    
}
