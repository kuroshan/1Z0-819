public class Test {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.indexOf('a')); //0
        System.out.println(string.indexOf("al")); //4
        System.out.println(string.indexOf('a', 4)); //4
        System.out.println(string.indexOf("al", 5)); //-1
    }
}
