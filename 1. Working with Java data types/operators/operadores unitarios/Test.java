public class Test {

    public static void main(String[] args) {

        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep); //false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep); //true

        double zooTemperature = 1.21;
        System.out.println(zooTemperature); //1.21
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature); //-1.21
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature); //-1.21

        int parkAttendance = 0;
        System.out.println(parkAttendance); //0
        System.out.println(++parkAttendance); //1
        System.out.println(parkAttendance); //1
        System.out.println(parkAttendance--); //1
        System.out.println(parkAttendance); //0

        int lion = 3;
        int tiger = ++lion * 5 / lion--;
        System.out.println("lion is " + lion); //3
        System.out.println("tiger is " + tiger); //5
        
    }
    
}
