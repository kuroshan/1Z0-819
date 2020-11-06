//SI es interface funcional
//porque solo tiene un metodo abstracto
public interface Climb {

    void reach();

    default void fall() {

    }

    static int getBackUp() {
        return 100;
    }

    private static boolean checkHeight() {
        return true;
    }
}