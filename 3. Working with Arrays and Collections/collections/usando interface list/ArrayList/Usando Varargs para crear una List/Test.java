import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one", "two");
        List<String> list2 = List.of("one", "two");


        List<String> fixedSizeList = Arrays.asList("a", "b", "c"); //tamaño fijo
        List<String> expandableList = new ArrayList<>(fixedSizeList); //tamaño expandible
    }
}
