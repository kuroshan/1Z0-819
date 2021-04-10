import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {
    static class Rabbit { int id; }

    public static void main(String[] args) {
        Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit()); //RuntimeException: ClassCastException porque Rabbit no implemento Comparable
                                   //y es requerido por TreeSet para ordenar la lista

        Set<Rabbit> rabbits2 = new TreeSet<>((r1, r2) -> r1.id - r2.id); //SOLUCION
        rabbits2.add(new Rabbit());
    }
}
