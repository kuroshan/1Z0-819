public class Test {
    final int getCookies() { return 4; }

    void feedAnimals() {
        final int babanas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case babanas:
            case apples: //DOES NOT COMPILE: no compila porque no es una variable final
            case getCookies(): //DOES NOT COMPILE: no compila porque el metodo final recien se resuelve en tiempo de ejecución
            case cookies: //DOES NOT COMPILE: no compile porque el valor de la variable se define en tiempo de ejecución
            case 3*5: //LITERAL VALIDO
        }

    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";

        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            case middleName: //DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName: //DOES NOT COMPILE: el parametro es final pero no esta definido el valor en tiempo de compilacion
                id = 8;
                break;
            case 5: //DOES NOT COMPILE: no es String
                id = 7;
                break;
            case 'J': //DOES NOT COMPILE: no es String
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: //DOES NOT COMPILE: no es String
                id = 15;
                break;
        }

        return id;
    }
}
