import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] names = {"Jango", "Amaya", "Mayra"};
        for (String name : names) {
            System.out.println(name +", ");
        }
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name +", ");
        }





        int[] values = new int[3];
        values[0] = 1;
        values[1] = Integer.valueOf(3);
        values[2] = 6;
        for (int value : values) {
            System.out.println(value + ", ");
        }
        for( Iterator<Integer> i = values.iterator(); //DOES NOT COMPILE: ARRAY NO TIENE EL METODO iterator(), sino Collection
             i.hasNext(); ) {
            int value = i.next();
            System.out.println(value + ", ");
        }

    }
}
