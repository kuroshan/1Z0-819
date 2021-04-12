public class Test {
    public static void main(String[] args) {
        String x1 = "Hello World";
        String y1 = "Hello World";
        System.out.println(x1 == y1); //true

        String x2 = "Hello World";
        String z2 = "Hello World".trim();
        System.out.println(x2 == z2); //false


        
        String x3 = "Hello World";
        String y3 = new String("Hello World");
        System.out.println(x3 == y3); //false




        String singleString = "hello world";
        String oneLine = "hello " + "world";
        System.out.println(singleString == oneLine); //true




        String singleString2 = "hello world";
        String concat = "hello ";
        concat += "world"; //genera nuevo string
        System.out.println(singleString2 == concat); //false




        String name = "Hello World";
        String name2 = new String("Hello World").intern();
        System.out.println(name == name2); //true




        String first = "rat" + 1;
        String second = "r" + "a" + "t" + 1;
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second); //true
        System.out.println(first == second.intern()); //true
        System.out.println(first == third); //false
        System.out.println(first == third.intern()); //true

    }
}
