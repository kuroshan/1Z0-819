import java.io.File;

public class Test {

    public static void main(String[] args) {
        File monday = new File("schedule.txt");
        File tuesday = new File("schedule.txt");
        File wednesday = tuesday;
        System.out.println(monday == tuesday); //false
        System.out.println(tuesday == wednesday); //true

        System.out.println(null==null); //true en JAVA
    }
    
}
