@FunctionalInterface
public interface Intelligence {
    int cunning();
}

@FunctionalInterface abstract class Reptile { //DOES NOT COMPILE
    abstract String getName();
}

@FunctionalInterface interface Slimy { //DOES NOT COMPILE

}

@FunctionalInterface interface Scaley {
    boolean isSnake();
}

@FunctionalInterface interface Rough extends Scaley { //DOES NOT COMPILE
    void checkType();
}

@FunctionalInterface interface Smooth extends Scaley {
    boolean equals(Object unused); //METODO DE OBJECT: NO SE TOMA EN CUENTA COMO METODO ABSTRACTO
}