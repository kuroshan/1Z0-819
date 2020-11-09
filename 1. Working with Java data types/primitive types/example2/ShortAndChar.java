public class ShortAndChar {

    public static void main(String[] args) {
        short bird = 'd';
        char mamal = (short)83; //char solo admite caracteres y numeros positivos (-128 a 127)
        System.out.println(bird); //100: valor unicode
        System.out.println(mamal); //S
        short reptile = 65535; //DOES NOT COMPILE
        char fish = (short)-1; //DOES NOT COMPILE
        long max = 3123456789L;

        byte b = (byte)128;
        System.out.println(b); //-128: al superar su maximo (127) vuelve a empezar en su minimo y suma la diferecia (-128)
    }
    
}