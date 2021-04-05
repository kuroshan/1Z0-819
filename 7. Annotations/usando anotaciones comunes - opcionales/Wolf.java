public class Wolf extends Canine {

    @Override
    public int cunning() { //METODO DE LA INTERFACE
        return Integer.MAX_VALUE;
    }

    @Override
    void howl() { //METODO DE LA CLASE PADRE
        System.err.println("Howl!");
    }
    
}
