public class Test {
    public static void main(String[] args) {
        
        System.out.println(1 + 2); //3
        System.out.println("a" + "b"); //ab
        System.out.println("a" + "b" + 3); //ab3
        System.out.println(1 + 2 + "c"); //3c
        System.out.println("c" + 1 + 2); //c12




        String s = "1";
        s += "2";
        s += 3;
        System.out.println(s); //123




        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //64
    }
}
