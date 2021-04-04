public @interface Panda {
    Integer height(); //DOES NOT COMPILE for Wrapper
    String[][] generalInfo(); //DOES NOT COMPILE for Array multidimensional
    Size size() default Size.SMALL;
    Bear friendlyBear(); //DOES NOT COMPILE for not java.lang.Class
    Exercise exercise() default @Exercise(hoursPerDay=2);
}
