import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 9, 1, 8);
        Collections.sort(list); //[1, 6, 8, 9]

        //binarySearch requiere una lista ordenada

        System.out.println(Collections.binarySearch(list, 6)); //1
        System.out.println(Collections.binarySearch(list, 3)); //-2, devuelve el indice donde deberia estar y se le resta 1
        System.out.println(Collections.binarySearch(list, 7)); //-3


        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c); //-1, porque la lista esta en orden natural(ascendente), 
        System.out.println(index);                               //pero la condición indica que deberia buscar en orden descendente
        
    }
}
