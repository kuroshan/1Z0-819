import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        //ANTES
        List<Integer> list = new ArrayList<Integer>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<Long, List<Integer>> mapLists = new HashMap<Long, List<Integer>>();

        //AHORA
        List<Integer> list2 = new ArrayList<>();
        Map<String, Integer> map2 = new HashMap<>();
        Map<Long, List<Integer>> mapLists2 = new HashMap<>();


        List<> list3 = new ArrayList<Integer>(); //DOES NOT COMPILE
        Map<> map3 = new HashMap<String, Integer>(); //DOES NOT COMPILE
        class InvalidUse {
            void use(List<> data) {} //DOES NOT COMPILE
        }


        var list4 = new ArrayList<Integer>(); //ArrayList of Integer
        var list5 = new ArrayList<>(); //ArrayList of Object
    }
    
}
