public class Test {

    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    void fall() {
        throw new RuntimeException();
    }

    static void fall2() {}

    public static void main(String[] args) {
        
        try {
            fall2();
        } finally {
            System.out.println("all better");
        }

    }
}
