public class Test {

    public static void main(String[] args) {

        int price1 = 2 * 5 + 3 * 4 - 8; //14
        System.out.println(price1);
        int price2 = 2 * ((5 + 3) * 4 - 8); //48
        System.out.println(price2);

        /*
        long pigeon = 1 + ((3 * 5)) / 3; //DOES NOT COMPILE
        int blueJay = (9 + 2) + 3) / (2 * 4; //DOES NOT COMPILE
        short robin = 3 + [(4 * 2) + 4]; //DOES NOT COMPILE
        */
        
        System.out.println(9/3); //3
        System.out.println(9%3); //0

        System.out.println(10/3); //3
        System.out.println(110%3); //1

        System.out.println(11/3); //3
        System.out.println(11%3); //2

        System.out.println(12/3); //4
        System.out.println(12%3); //0


        int x1 = 1;
        long y1 = 33;
        var z1 = x1*y1; //long

        double x2 = 39.21;
        float y2 = 2.1; //DOES NOT COMPILE
        var z2 = x2 + y2;

        short x3 = 10;
        short y3 = 3;
        var z3 = x3*y3;

        short w4 = 14;
        float x4 = 13;
        double y4 = 30;
        var z4 = w4*x4*y4; //double

    }
    
}
