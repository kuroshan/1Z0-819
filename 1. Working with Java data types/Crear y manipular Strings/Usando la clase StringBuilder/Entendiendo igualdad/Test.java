public class Test {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); //false
        System.out.println(one == three); //true
        


        

        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x.equals(z)); //true, compara el contenido
        System.out.println(x == z); //false, compara las referencias de memoria




        String string = "a";
        StringBuilder builder = new StringBuilder("a");

        System.out.println(string.equals(builder)); //false
        System.out.println(string == builder); //DOES NOT COMPILE

    }
}
