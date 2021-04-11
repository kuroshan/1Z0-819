public class Test {
    public static void main(String[] args) {
        short size = 4;
        final int small = 15;
        final int big = 1_000_000;
        switch (size) {
            case small:
            case 1+2:
            case big: //DOES NOT COMPILE: la variable big es demasiado grande para evaluarse como short
        }
    }
}
