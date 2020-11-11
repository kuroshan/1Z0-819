public class Scope {

    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two; //new String("a") es candidato para el GC porque no hay variable que lo referencie
        String three = one;

        one = null;
    }

}