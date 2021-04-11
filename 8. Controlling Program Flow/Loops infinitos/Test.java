public class Test {
    public static void main(String[] args) {
        int pen = 2;
        int pigs = 5;
        while (pen < 10) //en RUNTIME puede generar un stackoverflow
            pigs++;
    }
}
