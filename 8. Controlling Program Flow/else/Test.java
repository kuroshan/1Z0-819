public class Test {
    public static void main(String[] args) {
        int hourOfDay = 5;

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15){
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }




        if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else if (hourOfDay < 11){
            System.out.println("Good Morning"); //COMPILES BUT IS UNREACHABLE
        } else {
            System.out.println("Good Evening");
        }



        if (hourOfDay) { //DOES NOT COMPILE: int cannot be converted to boolean
        }

        if (hourOfDay = 5) { //DOES NOT COMPILE: int cannot be converted to boolean
        }
    }
}
