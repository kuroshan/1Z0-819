public class Test {

    public static void main(String[] args) {
        
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.println("Zoo animal receives: " + reward + " reward points");

        int pelican = !5; //DOES NOT COMPILE
        boolean penguin = -true; //DOES NOT COMPILE
        boolean peacock = !0; //DOES NOT COMPILE

    }
    
}
