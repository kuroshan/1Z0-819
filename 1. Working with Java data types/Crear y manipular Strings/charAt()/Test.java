public class Test {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.charAt(0)); //a
        System.out.println(string.charAt(6)); //s
        System.out.println(string.charAt(7)); //RUNTIME: StringIndexOutOfBoundsException: String index out of range: 7
    }
}
