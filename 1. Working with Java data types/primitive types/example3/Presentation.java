public class Presentation {

    public static void main(String[] args) {
        //OCTAL: 0-7
        System.out.println(017); //15: porque esta en base 8

        //hexadecimal 0-9 ABCDEF (puede mayusculas o minisculas)
        System.out.println(0XFF); //255

        //Binary 0-1
        System.out.println(0b10); //2

        double notAtStart = _1000.00; //DOES NOT COMPILE
        double notAtEnd = 1000.00_; //DOES NOT COMPILE
        double notByDecimal = 1000_.00; //DOES NOT COMPILE

        double annoyingButLegal = 1_00_0.0_0; //Ungly, but compiles
        double reallyUngly = 1_____________2; //Also compeles
    }

}