public class Main {

    public int notValid() {
        int y = 10;
        int x;
        int reply = x + y; //DOES NOT COMPILE: variable x might not have been initialized
        return reply;
    }

}