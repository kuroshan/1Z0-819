public class Peacock {

    @ZooSchedule(hours={"4am","5pm"})
    void cleanPeacocksPen() {
        System.out.println("Time to sweep up!");
    }
    
}
