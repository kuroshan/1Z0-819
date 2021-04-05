public @interface Swimmer {
    int armLength = 10;
    String stroke();
    String name();
    String favoriteStroke() default "Backstroke";
}

@Swimmer class Amphibian {} //DOES NOT COMPILE
    
@Swimmer(favoriteStroke="Breaststroke", name="Sally") class Tadpole {} //DOES NOT COMPILE

@Swimmer(stroke="FrogKick", name="Kermit") class Frog {}

@Swimmer(stroke="Butterfly", name="Kip", armLength=1) class Reptile {} //DOES NOT COMPILE

@Swimmer(stroke="", name="", favoriteStroke="") class Snake {}