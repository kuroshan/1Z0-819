public class Test {

    public static void main(String[] args) {
        
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.println("Zoo animal receives: " + reward + " reward points");


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

        int pelican = !5; //DOES NOT COMPILE
        boolean penguin = -true; //DOES NOT COMPILE
        boolean peacock = !0; //DOES NOT COMPILE

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
