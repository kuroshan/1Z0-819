public class Test {

    @SafeVarargs
    public static void eat(int meal) {} //DOES NOT COMPILE

    @SafeVarargs
    protected void drink(String... cup) {} //DOES NOT COMPILE

    @SafeVarargs
    void chew(boolean... food) {} //DOES NOT COMPILE
    
}
