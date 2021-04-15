public class Zebra extends Animal {
    
    public Zebra(int age) {
        super(age);
    }

    /*
    public Zebra() {
        //DOES NOT COMPILE: no existe constructor sin parametros en Animal
                            para super()
    }
     */

    public Zebra() {
        super(4);
    }

    public static void main(String[] args) {
        new Zebra();
        new Zebra(10);
    }

}
