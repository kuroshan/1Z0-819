public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-"); //animals-
        sb.insert(0, "-"); //-animals-
        sb.insert(4, "-"); //-ani-mals-
        System.out.println(sb);
    }
}
