import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {

    public static void main(String[] args) {
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canHop());
        print(animals, a -> a.canSwim());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for(Animal animal: animals) {
            if (checker.test(animal)) {
                System.out.println(animal + " ");
            }
        }
    }
}