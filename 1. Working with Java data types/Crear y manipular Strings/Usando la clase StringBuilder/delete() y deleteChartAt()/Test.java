public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3); //adef
        sb.deleteCharAt(5); //RUNTIME: StringIndexOutOfBoundsException: index 5,length 4

        StringBuilder sb2 = new StringBuilder("abcdef");
        sb2.delete(1, 100); //a
    }
}
