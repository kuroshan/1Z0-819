public class Test {

    public static void main(String[] args) {

        int value = null; //DOES NOT COMPILE
        String s = null;
        String reference = "hello";
        int len = reference.length();
        int bad = len.length(); //DOES NOT COMPILE
        
    }
}