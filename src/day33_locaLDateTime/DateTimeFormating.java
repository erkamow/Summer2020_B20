package day33_locaLDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormating {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy, EEEE");

        LocalDate ld = LocalDate.of(2020,7,26);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss:a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));

        System.out.println("================================================================");

        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM/dd/yyyy EEEE h:mm a");
        LocalDateTime s1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(s1.format(df));


    }
}
