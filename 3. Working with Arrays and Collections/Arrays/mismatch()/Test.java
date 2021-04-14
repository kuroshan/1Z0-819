import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        //INDICA LA POSICION EN LA QUE DIFIEREN

        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1})); //-1

        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"})); //0

        System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1})); //1
    }
}
