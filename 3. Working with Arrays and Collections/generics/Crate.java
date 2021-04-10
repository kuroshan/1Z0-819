public class Crate<T> {

    private T contents;

    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }

    static class Elephant {}

    static class Zebra {}

    static class Robot {}

    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.emptyCrate();
        
        Crate<Zebra> crateForZebra = new Crate<>();
        

        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);
        Robot atDestination = robotCrate.emptyCrate();

    }

}