import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Integer> hash = new HashSet<>(); //no permite duplicados, coleccion desordenada
        Set<Integer> tree = new TreeSet<>(); //no permite duplicados, coleccion ordenada, pero disminuye le performance en lectura

        //el hashcode() tiene que ser unico, sino java llama al equas por cada elememto (afecta al performance)
        boolean b1 = hash.add(66); //true
        boolean b2 = hash.add(10); //true
        boolean b3 = hash.add(66); //false
        boolean b4 = hash.add(8); //true
        hash.forEach(System.out::println); //imprime de forma arbitraria

        

        b1 = tree.add(66); //true
        b2 = tree.add(10); //true
        b3 = tree.add(66); //false
        b4 = tree.add(8); //true
        tree.forEach(System.out::println); //imprime de forma arbitraria        
        


        Set<Character> letters = Set.of('z', 'o', 'o'); //IllegalArgumentException: duplicate element: o
        Set<Character> copy = Set.copyOf(letters);

    }
}
