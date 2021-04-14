public class Test {
    public static void main(String[] args) {
        
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]); //monkey




        String[] birds = new String[6];
        System.out.println(birds.length);




        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) 
            numbers[i] = i + 5;
        

        
        numbers[10] = 3;
        numbers[numbers.length] = 5; //RUNTIME: ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
        for (int i = 0; i < numbers.length; i++) numbers[i] = i + 5;

    }
}


