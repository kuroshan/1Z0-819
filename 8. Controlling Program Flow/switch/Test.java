public class Test {

    public static void main(String[] args) {

        int month = 5;
        /*
        switch month { //DOES NOT COMPILE
            case 1: System.out.println("January");            
        }

        switch (month) //DOES NOT COMPILE
            case 1: System.out.println("January"); 
        
        switch (month)   {
            case 1: 2: System.out.println("January"); //DOES NOT COMPILE
        }

        switch (month)   {
            case 1 || 2: System.out.println("January"); //DOES NOT COMPILE
        }
         */

        //ES VALIDO
        switch (month) { }

        //ES VALIDO
        switch (month)   {
            case 1 | 2: System.out.println("January"); 
        }

        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 'a'|'b': 
                System.out.println('c');
        }

        var dayOfWeekVar = 5;
        switch (dayOfWeekVar) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }

        
    }
}
