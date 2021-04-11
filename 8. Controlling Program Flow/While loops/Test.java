public class Test {

    int roomInBelly = 5;

    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }

    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            double price = counter*10;
            System.out.println(price);
            counter++;
        }
    }
}