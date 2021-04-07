public class Test {

    public static void main(String[] args) {
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;
        
    }

    public static void openZoo(Number time) {
        if(time instanceof Integer)
            System.out.println((Integer)time + " O'clock");
        else if (time instanceof String) //DOES NOT COMPILE: Number cannot be converted to String
            System.out.println("error");
        else
            System.out.println(time);
    }
    
}
