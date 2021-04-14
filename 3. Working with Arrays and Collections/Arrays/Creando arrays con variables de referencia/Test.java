public class Test {
    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); //true
        System.out.println(bugs.toString()); //[Ljava.lang.String;@63355449



        
        String[] strings = {"stringValues"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); //DOES NOT COMPILE
        objects[0] = new StringBuilder(); //RUNTIME: ArrayStoreException: java.lang.StringBuilder

    }
}

class Names {
    String names[]; //null
}

class Names2 {
    String names[] = new String[2]; //{null, null}
}