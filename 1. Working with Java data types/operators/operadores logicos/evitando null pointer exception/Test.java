public class Test {

    public static void main(String[] args) {
        Duck duck = null;

        if (duck!=null && duck.getAge()<5) {
            //Do something
        }        

        if (duck!=null & duck.getAge()<5) { //Could throw a NullPointerException
            //Do something
        }

    }
    
}
