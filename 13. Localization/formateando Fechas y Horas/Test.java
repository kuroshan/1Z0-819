import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f));

        DateFormat s = new SimpleDateFormat("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(s.format(new Date()));



        var dateTime = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);

        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dateTime.format(formatter1));

        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-dd");
        System.out.println(dateTime.format(formatter2));

        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
        //System.out.println(dateTime.format(formatter3)); //RUNTIME: DateTimeException: Unable to extract ZoneId from temporal 2020-10-20T06:15:30

        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
        System.out.println(dateTime.format(g3));

    }
}
