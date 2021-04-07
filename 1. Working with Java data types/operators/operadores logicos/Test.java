public class Test {

    public static void main(String[] args) {
        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;
        System.out.println(resting); //true
        System.out.println(asleep); //true
        System.out.println(awake); //false

        //short-circuit
        int hour = 10;
        boolean zooOpen = true || (hour > 4);
        System.out.println(zooOpen); //true


        int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println(bunny); //6
    }

}