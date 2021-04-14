import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        ArrayList<String> list4 = new ArrayList<String>(); //java 5
        ArrayList<String> list5 = new ArrayList<>(); //java 7
        
        var strings = new ArrayList<String>();
        strings.add("a");
        for (String s : strings) {}

        var list6 = new ArrayList<>();

        var list7 = new ArrayList<>();
        list7.add("a");
        for (String s : list7) {} //DOES NOT COMPILE

        List<String> list8 = new ArrayList<>();
        ArrayList<String> list7 = new List<>(); //DOES NOT COMPILE
        
    }
}
