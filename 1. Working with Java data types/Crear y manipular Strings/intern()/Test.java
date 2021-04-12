public class Test {
    public static void main(String[] args) {
        String string1 = "string";
        String string2 = new String("string");
        System.out.println(string1 == string2); //false
        System.out.println(string1 == string2.intern()); //true
    }
}
