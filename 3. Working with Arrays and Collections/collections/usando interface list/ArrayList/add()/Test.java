import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(Boolean.TRUE);
        System.out.println(list); //[hawk, true]



        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //safer.add(Boolean.TRUE); //DOES NOT COMPILE


        
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); //[hawk]
        birds.add(1, "robin"); //[hawk, robin]
        birds.add(0, "blue jay"); //[blue jay, hawk, robin]
        birds.add(1, "cardinal"); //[blue jay, cardinal, hawk, robin]
        System.out.println(birds); //[blue jay, cardinal, hawk, robin]

    }
}
