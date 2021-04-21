import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test {
    public static void main(String[] args) {
        
        LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalDate date2 = LocalDate.of(200, 10, 20);



        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);



        var dt1 = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30, 200);
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(6, 15, 30, 200);
        var dt2 = LocalDateTime.of(date, time);

    }
}
