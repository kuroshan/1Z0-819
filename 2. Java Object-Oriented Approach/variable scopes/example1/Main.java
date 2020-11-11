public class Main {

    public void eatIfHungry(boolean hungry) {
        if(hungry) {
            int bitesOfCheese = 1;
        } //bitesOfCheese goes out of scope here


        System.out.println(bitesOfCheese); //DOES NOT COMPILE
    }

}