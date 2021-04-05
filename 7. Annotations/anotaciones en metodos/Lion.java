public class Lion {

    @ZooSchedule(hours={"9am","5pm","10pm"})
    void feedLions() {
        System.out.println("Time to feed the lions!");
    }
    
}
