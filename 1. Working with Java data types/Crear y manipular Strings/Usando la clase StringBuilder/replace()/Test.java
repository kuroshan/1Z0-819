public class Test {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "xy");
        System.out.println(builder); //pigxy
    }
}
