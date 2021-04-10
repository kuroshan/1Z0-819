import java.util.Comparator;

public class Test {

    public static void main(String[] args) {
        var byWeight = new Comparator<Duck>(){ //DOES NOT COMPILE: is not abstract and does not override abstract method compare(Duck,Duck) in Comparator
            public int compareTo(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };
    }
    
}
