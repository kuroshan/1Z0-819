public class Chick {

    private String name = "Fluffy";

    {
        System.out.println("setting field"); //2. imprime
    }

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor"); // 3. imprime
    }

    public static void main(String[] args) {
        Chick chick = new Chick(); //1. java intenta crear un nuevo objeto
        System.out.println(chick.name); //4. imprime
    }

}