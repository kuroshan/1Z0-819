import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck>{

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public String toString() { //use readable output
        return name;
    }

    public int compareTo(Duck d) {
        return name.compareTo(d.name); //sort ascendingly by name
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks); //sort by name
        System.out.println(ducks); //[Puddles, Quack]
    }
    
}
