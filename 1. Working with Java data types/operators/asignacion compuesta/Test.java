public class Test {

    public static void main(String[] args) {
        int camel = 2, giraffe = 3;
        camel = camel * giraffe; //simple assignment operator
        camel *= giraffe; //compound assignment operator

        long goat = 10;
        int sheep = 5;
        sheep = sheep*goat; //DOES NOT COMPILE
        sheep *= goat;

        long wolf = 5;
        long coyote = (wolf=3);
        System.out.println(wolf); //3
        System.out.println(coyote); //3

        boolean healthy = false;
        if (healthy = true)
            System.err.println("Good!");
    }
    
}
