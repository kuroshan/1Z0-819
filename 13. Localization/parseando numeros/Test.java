import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Test {
    public static void main(String[] args) throws ParseException {

        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price)); //S/48.00

        String s = "40.45";

        var en = NumberFormat.getInstance(Locale.US);
        System.out.println(en.parse(s)); //40.45

        var fr = NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s)); //40



        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance(Locale.US);
        double value = (Double) cf.parse(income);
        System.out.println(value); //92807.99

        
    }
}
