public class Dog extends Canine {
    
    @Override
    public boolean playFetch() { //DOES NOT COMPILE
        return true;
    }

    @Override
    void howl(int timeOfDay){ } //DOES NOT COMPILE
}
