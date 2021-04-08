import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<String, String> hash = new HashMap<>();
        Map<String, String> linkedHash = new LinkedHashMap<>();
        Map<String, String> tree = new TreeMap<>();



        hash.put("koala", "bamboo");
        hash.put("lion", "meat");
        hash.put("giraffe", "leaf");
        String food = hash.get("koala"); //bamboo
        for (String key : hash.keySet()) 
            System.out.print(key + ",");
        System.out.println();

        

        tree.put("koala", "bamboo");
        tree.put("lion", "meat");
        tree.put("giraffe", "leaf");
        food = tree.get("koala"); //bamboo
        for (String key : tree.keySet()) 
            System.out.print(key + ",");
        System.out.println();



        System.out.println(hash.contains("lion")); //DOES NOT COMPILE, el metodo contains pertenece a Collection
        System.out.println(hash.containsKey("lion")); //true
        System.out.println(hash.containsValue("lion")); //false

        System.out.println(hash.size()); //3
        hash.clear();
        System.out.println(hash.size()); //0
        System.out.println(hash.isEmpty()); //true



        Map<String, String> map1 = Map.of("key1", "value1", "key2", "value2");
        //Map<String, String> map2 = Map.of("key1", "value1", "key2"); //Excepton
        Map<String, String> map3 = Map.ofEntries(
            Map.entry("key1", "value1"),
            Map.entry("key2", "value2")
        );
        Map<String, String> map4 = Map.copyOf(map3);
        
    }
}
