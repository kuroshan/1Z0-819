import java.text.NumberFormat;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        
        int attendeePerYear = 3_200_000;
        int attendeePerMonth = attendeePerYear/12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeePerMonth));

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeePerMonth));

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeePerMonth));
        
    }
}
