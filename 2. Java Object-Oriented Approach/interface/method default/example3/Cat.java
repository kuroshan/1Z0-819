public class Cat implements Walk, Run {

    //DOES NOT COMPILE
    /**
     * class Cat inherits unrelated defaults for getSpeed() from types Walk and Run
    */

    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }

}
