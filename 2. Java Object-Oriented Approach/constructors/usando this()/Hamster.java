public class Hamster {
    
    private String color;
    private int  weight;

    /*
    public Hamster(int weight) {
        Hamster(weight, "brown"); //DOES NOT COMPILE
    }
     */

    /*
    public Hamster(int weight) {
        new Hamster(weight, "brown"); //COMPILES, BUT INCORRECT
    }
     */

    /*
    public Hamster(int weight) {
        this(weight); //DOES NOT COMPILE: recursive constructor invocation
    }
     */

    public Hamster(int weight) {
        this(weight, "brown");
    }


    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {
        new Hamster(25);
    }

}
