import java.util.function.Predicate;

public class Crow {

    private String color;

    public void caw1(String name) {
        String volume = "loudly";
        Predicate<String> p = s -> (name+volume+color).length()==10;
    }

    public void caw2(String name) {
        String volume = "loudly";
        color = "allowed";
        name = "not allowed";

        volume = "not allowed";
        Predicate<String> p = s -> (name+volume+color).length()==9; //DOES NOT COMPILE
    }
}