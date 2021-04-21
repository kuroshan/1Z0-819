import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.GERMAN); //de
        System.out.println(Locale.GERMANY); //de_DE

        System.out.println(new Locale("fr")); //fr
        System.out.println(new Locale("hi", "IN")); //hi_IN

        Locale l1 = new Locale.Builder()
                            .setLanguage("en")
                            .setRegion("US")
                            .build();

        Locale l2 = new Locale.Builder()
                            .setRegion("US")
                            .setLanguage("en")
                            .build();
        


        System.out.println("default " + Locale.getDefault());
        Locale.setDefault(new Locale("fr"));
        System.out.println("default " + Locale.getDefault());
        

    }
}
