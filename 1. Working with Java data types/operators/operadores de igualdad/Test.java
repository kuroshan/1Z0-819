public class Test {

    public static void main(String[] args) {
        boolean a = 5==5.0; //true

        boolean monkey = true == 3; //DOES NOT COMPILE
        boolean ape = false != "Grape"; //DOES NOT COMPILE
        boolean gorilla = 10.2 == "Koko"; //DOES NOT COMPILE

        boolean bear = false;
        boolean polar = (bear=true);
        System.out.println(polar); //true
    }
    
}
