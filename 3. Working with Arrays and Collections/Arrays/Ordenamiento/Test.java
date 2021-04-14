import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " "); //1 6 9
        
        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " "); //10 100 9
    }
}
