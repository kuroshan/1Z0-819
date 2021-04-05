import java.util.*;

public class NeverDoThis {

    //TIENE QUE SER UN METODO FINAL
    @SafeVarargs
    final int thisIsUnsafe(List<Integer>... carrot) {
        Object[] stick = carrot;
        stick[0] = Arrays.asList("nope!");
        return carrot[0].get(0); //ClassCastException at runtime
    }

    public static void main(String[] a) {
        var carrot = new ArrayList<Integer>();
        new NeverDoThis().thisIsUnsafe(carrot);
    }
    
}
