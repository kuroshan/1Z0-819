import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface ZooAttraction {}

@ZooAttraction class RollerCoaster {} //DOES NOT COMPILE

class Events {
    @ZooAttraction String rideTrain() {
        return (@ZooAttraction String) "Fun!"; //DOES NOT COMPILE
    }
    @ZooAttraction Events(@ZooAttraction String description) { //DOES NOT COMPILE for PARAMETERS
        super();
    }
    @ZooAttraction int numPassengers; //DOES NOT COMPILE
}