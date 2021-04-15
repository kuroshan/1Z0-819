import java.util.ArrayList;
import java.util.List;

public class Anteater extends LongTailAnimal {

    /*
    protected void chew(List<Double> input) {} //DOES NOT COMPILE
     */
    
    protected void chew(ArrayList<Double> input) {}//OVERLOAD

    protected void otherChew(List<Double> input) {} //OVERRIDE

}