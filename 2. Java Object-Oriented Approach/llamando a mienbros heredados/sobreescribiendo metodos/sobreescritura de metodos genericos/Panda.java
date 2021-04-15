public class Panda extends Bear {
    
    public void sneeze() { //DOES NOT COMPILE
        System.out.println("Bear is sneezing");
    }
    
    public static void hibernate() { //DOES NOT COMPILE
        System.out.println("Bear is hibernating");
    }

    protected static void laugh() {
        System.out.println("Bear is laughing");
    }

}
