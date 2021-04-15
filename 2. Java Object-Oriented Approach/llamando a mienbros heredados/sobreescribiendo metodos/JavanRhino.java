public class JavanRhino extends Rhino {
    
    public String getName() { //extends from CharSequence
        return "javan rhino";
    }

    public CharSequence getColor() { //DOES NOT COMPILE: super from String
        return "grey";
    }

}
