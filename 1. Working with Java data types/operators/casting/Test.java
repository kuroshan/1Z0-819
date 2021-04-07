public class Test {

    public static void main(String[] args) {
        int fur = (int)5; //innecesario
        int hair = (short)2;
        String type = (String)    "bird";
        short tail = (short)(4 + 10);
        long feathers = 10(long); //DOES NOT COMPILE

        float egg = 2.0/9; //DOES NOT COMPILE
        int tadpole = (int)5*2L; //DOES NOT COMPILE
        short frog = 3-2.0; //DOES NOT COMPILE
    }
    
}
