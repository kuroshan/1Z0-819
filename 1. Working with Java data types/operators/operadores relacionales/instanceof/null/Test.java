public class Test {

    public static void main(String[] args) {
        System.err.println(null instanceof Object); //false

        Object nObjectHere = null;
        System.out.println(nObjectHere instanceof String); //false

        System.out.println(null instanceof null); //DOES NOT COMPILE
    }
    
}
