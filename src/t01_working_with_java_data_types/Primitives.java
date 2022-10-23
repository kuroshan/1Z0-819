package t01_working_with_java_data_types;

public class Primitives {

    private int a;
    private boolean b;
    private double d;
    private String s;
    private char c;

    public static void main(String[] args) {
        int x = 5;
        byte b = -123;

        Primitives primitive = new Primitives();
        System.out.println(primitive.a);
        System.out.println(primitive.b);
        System.out.println(primitive.d);
        System.out.println(primitive.s);
        System.out.println(primitive.c);
        System.out.println(x);

        int decimal = 12423442;
        int b1 = 0B11; //binario
        int o1 = 010; //octal
        int h1 = 0x0001; //hexadecimal
        int h2 = 0x7f; //hexadecimal
        int h3 = 0x7F; //hexadecimal
        System.out.println(b1);
        System.out.println(o1);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        int literal = 1_000_000;
        System.out.println(literal);

        long v1 = 493L;

        double d1 = 1323.2323;
        double d2 = 1323.2323D;
        float f1 = 2323.2323F;
        float f1 = 2323.2323; //Error de conversion el dato es double y la variable float
        

    }
    
}
