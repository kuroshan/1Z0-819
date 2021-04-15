public class BactrianCamel extends Camel {

    private int getNumberOfHumps() { //DOES NOT COMPILE: attempting to assign weaker access privileges; was public
        return 2;
    }
    
}
