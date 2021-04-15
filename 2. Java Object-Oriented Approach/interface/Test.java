import java.util.List;

public class Test {
    public static void main(String[] args) {
        Number tickets = 5;
        if (tickets instanceof List) {
            System.out.println("ok");
        }
    }
}
