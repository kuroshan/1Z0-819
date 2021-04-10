public class TestCrate {
    public static String createName() {
        Crate<Robot> crate = new Crate<>();
        return crate.tricky("bot"); // el tipo generico del parametro del metodo (T t) 
                                    // es independiente del tipo generico de la clase <T>
    }

    public static Robot createNameRobot() {
        Crate<Robot> crate = new Crate<>();
        return crate.tricky(new Robot());
    }

    public static void main(String[] args) {
        System.out.println(createName());
        System.out.println(createNameRobot());
    }
}
