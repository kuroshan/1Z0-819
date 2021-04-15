public class Test {

    {
        System.out.println("instance");
    }

    static {
        System.out.println("static");
    }
    
    public static void main(String[] args) {
        System.out.println("main");
        new Test2();
    }

}
