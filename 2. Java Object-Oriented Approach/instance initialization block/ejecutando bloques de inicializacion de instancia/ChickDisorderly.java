public class ChickDisorderly {

    {
        System.out.println(name); //DOES NOT COMPILE
    }

    private String name = "Fluffy";

    public static void main(String[] args) {
        Chick chick = new Chick();
    }

}