public class Test {
    public static void main(String[] args) {
        
        int checkDate = 0;
        while (checkDate < 10) {
            checkDate++;
            if (checkDate > 100) {
                break;
                checkDate++; //DOES NOT COMPILE
            }
        }



        

        int minute = 1;
        WATCH: while(minute > 2) {
            if (minute++>2) {
                continue WATCH;
                System.out.println(minute); //DOES NOT COMPILE
            }
        }





        int hour = 2;
        switch (hour) {
            case 1: return; hour++; //DOES NOT COMPILE
            case 2:
        }

    }
}
