public class Test {

    public static void main(String[] args) {
        int fish = 1.0; //DOES NOT COMPILE
        short bird = 1921222; //DOES NOT COMPILE
        int mammal = 9f; //DOES NOT COMPILE
        long reptile = 192301398193810323; //DOES NOT COMPILE

        //APLICANDO CASTING

        int trainer = (int)1.0;
        short ticketTaker = (short)1921222; //Shored as 20678
        int usher = (int)9f;
        long manager = 192301398193810323L;

        //OJO: Overflow y Underflow

        //valor maximo de un int es 2147483647
        System.out.println(2147483647+1); //-2147483648

        short mouse = 10;
        short hamster = 3;
        short capybara1 = mouse*hamster; //DOES NOT COMPILE
        short capybara2 = (short)mouse*hamster; //DOES NOT COMPILE
        short gerbil = 1 + (short)(mouse*hamster); //DOES NOT COMPILE

    }
    
}
