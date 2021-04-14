import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        list.clear();
        System.out.println(objectArray.length);
        System.out.println(stringArray.length);




        
        String[] array = {"hawk", "robin"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.size());
        list2.set(1, "test");
        array[0] = "new";
        System.out.println(Arrays.toString(array));
        //list2.remove(1); //RUNTIME: UnsupportedOperationException




        String[] array3 = {"hawk", "robin"};
        List<String> list3 = List.of(array3); //LISTA INMUTABLE
        System.out.println(list3.size());
        array3[0] = "new";
        System.out.println(Arrays.toString(array));
        System.out.println(list3);
        list3.set(1, "test"); //RUNTIME: UnsupportedOperationException

    }
}
