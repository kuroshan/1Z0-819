public class Test {
    public static void main(String[] args) {
        String start = "AnimaL ";
        String trimmed = start.trim();
        String lowercase = trimmed.toLowerCase();
        String result = lowercase.replace('a', 'A');
        System.out.println(result); //AnimAl

        result = "AnimaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result); //AnimAl





        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
