public class Box {
    static <T> void ship(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        Box.<String>ship("package");
        Box.<String[]>ship(args);
    }
}
