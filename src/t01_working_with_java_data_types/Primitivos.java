package t01_working_with_java_data_types;

public class Primitivos {

    private int a;
    private boolean b;
    private double d;
    private String s;
    private char c;

    public static void main(String[] args) {
        int x = 5;
        byte b = -123;

        Primitivos primitive = new Primitivos();
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
        int i3 = (byte)1;
        short s = 3;
        int i4 = s;
        short ss = (short)i4;
        float f1 = 2323.2323F;
        float f2 = 2323.2323; //Error de conversion el dato es double y la variable float
        float f3 = (float)2323.2323;
        boolean t = true;
        boolean t1 = 0; //no existe la asignación de entero a boleano

        char letraA = 'a';
        char arroba = '@';
        char letraN = '\u004E';
        char b5 = 921;
        char c = 0x892;


        //byte < short < int < long
        //float < double
        //char
        //boolean

        //pregunta 1
        byte b4 = 4;
        int i1 = 123456;
        long L1 = (long)i1;		// line A
        short s2 = (short)i1;		// line B
        byte b2 = (byte)i1;		// line C
        int i2 = (int)123.456;		// line D
        byte b3 = b4 + 7;			// line E


    
    
}
