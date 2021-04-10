public class Crate<T> {

    private T contents;

    public T emptyCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
    }

    static class Robot {}

    public static void main(String[] args) {
        Crate<Robot> crate = new Crate<>();
        Robot r = crate.emptyCrate();
    }

}