public class Test2 {

    public int notValid() {
        int y = 10;
        int x;
        int reply = x + y; //DOES NOT COMPILE: variable x might not have been initialized
        return reply;
    }

    public int valid() {
        int y = 10;
        int x; //x is declared here
        x = 3; //and initialized here
        int reply = x + y;
        return reply;
    }

    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); //DOES NOT COMPILE
    }

    public void checkAnswer() {
        boolean value;
        findAnswer(value); //DOES NOT COMPILE
    }

}