public interface Carnivore {
    
    public default void eatMeat(); //DOES NOT COMPILE
    
    public int getRequiredFooAmount() { //DOES NOT COMPILE
        return 13;
    }
    
}
