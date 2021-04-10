import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {
    static class Rabbit { int id; }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        //Collections.sort(rabbits); //DOES NOT COMPILE: no se implemento la interface Comparable
        Comparator<Rabbit> lambda = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, lambda);
    }
}
