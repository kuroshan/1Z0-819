import java.util.List;
import java.util.ArrayList;

public class Test {

    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }

    /* TYPE ERASURE
    public static long total(List list) {
        long count = 0;
        for (Object obj: list) {
            Number number = (Number) obj;
            count += number.longValue();
        }
        return count;
    }
     */



    static class Sparrow extends Bird { }
    static class Bird { }


    static interface Flyer { void fly(); }
    static class HangGlider implements Flyer { public void fly() {} }
    static class Goose implements Flyer { public void fly() {} }

    static private void anyFlyper(List<Flyer> flyer) {}
    static private void groupOfFlyers(List<? extends Flyer> flyer) {}


    public static void main(String[] args) {
        //ArrayList<Number> list = new ArrayList<Integer>(); //DOES NOT COMPILE: ArrayList<Integer> cannot be converted to ArrayList<Number>
        ArrayList<? extends Number> list2 = new ArrayList<Integer>();
        total(list2);



        List<? extends Bird> birds = new ArrayList<Bird>(); //? extends: es IMMUTABLE
        //birds.add(new Sparrow()); //DOES NOT COMPILE
        //birds.add(new Bird()); //DOES NOT COMPILE



        List<Flyer> flyer = new ArrayList<>();
        anyFlyper(flyer);
        groupOfFlyers(flyer);
        List<Goose> gooses = new ArrayList<>();
        //anyFlyper(gooses); //DOES NOT COMPILE
        groupOfFlyers(gooses);
    }
}
