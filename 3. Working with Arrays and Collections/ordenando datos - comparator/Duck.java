import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() { return name; }

    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };

        Comparator<Duck> byWeightLambda = (d1, d2) -> d1.getWeight() - d2.getWeight();
        
        Comparator<Duck> byWeightMethodRef = Comparator.comparing(Duck::getWeight);

        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks); //[Puddles, Quack]
        Collections.sort(ducks, byWeight);
        System.out.println(ducks); //[Quack, Puddles]
    }


}
