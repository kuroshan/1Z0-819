public class Test {
    public static void main(String[] args) {
        System.out.println("abc".equals("ABC")); //false
        System.out.println("ABC".equals("ABC")); //true
        System.out.println("abc".equalsIgnoreCase("ABC")); //true
    }
}
