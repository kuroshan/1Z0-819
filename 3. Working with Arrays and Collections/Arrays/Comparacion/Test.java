import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println(Arrays.compare(new int[1], new int[2]));

        System.out.println(Arrays.compare(new int[]{1}, new String[]{"a"})); //DOES NOT COMPILE
        
    }
}
