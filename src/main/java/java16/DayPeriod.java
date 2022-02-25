package java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * The symbol 'B' has been introduced to replace am/pm
 * it's a string representation of the period of the day
 */
public class DayPeriod {

    public static void main(String[] args) {
        LocalTime nightDate = LocalTime.parse("03:25:08.690791");
        LocalTime noonDate = LocalTime.parse("12:00:08.690791");
        LocalTime afternoonDate = LocalTime.parse("15:25:08.690791");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");

        System.out.println(nightDate.format(formatter));
        System.out.println(noonDate.format(formatter));
        System.out.println(afternoonDate.format(formatter));
    }
}
