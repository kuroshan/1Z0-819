public class Test {

    public static void main(String[] args) {
        
        Season s = Season.SUMMER;
        System.out.println(Season.SUMMER);
        System.out.println(s == Season.SUMMER);
        //System.out.println(s.equals(Season.SUMMER))); //en los enums no existe le metodo equals
        
        System.out.println("name\tordinal");
        for (Season season : Season.values()) {    
            System.out.println(season.name() + "\t" + season.ordinal());
        }

        //if (Season.SUMMER == 2){} //DOES NOT COMPILE

        Season s2 = Season.valueOf("SUMMER"); //SUMMER

        //Season s3 = Season.valueOf("summer"); //Throws an exception at runtime

        Season summer = Season.SUMMER;

        switch (summer) {
            case WINTER: 
                System.out.println("Get out the sled!");
                break;
            case Season.FALL: //DOES NOT COMPILE
                System.out.println("fall!");
                break;
            case 0: //DOES NOT COMPILE
                System.out.println("zero!");
                break;
            case SUMMER:
                System.out.println("Time for the pool!");
                break;
            default:
                System.out.println("Is it summer yet?");
        }

    }
    
}
