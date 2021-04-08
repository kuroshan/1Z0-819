import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 4);
        Integer original = map.replace(2, 10); //4
        System.out.println(map);
        map.replaceAll((k, v) -> k + v);
        System.out.println(map);
    }
}
