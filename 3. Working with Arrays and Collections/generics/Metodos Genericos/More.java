public class More {
    public static <T> void sink(T t) {}
    public static <T> T identity(T t) { return t; }
    public static T noGood(T t) { return t; } //DOES NOT COMPILE
}
