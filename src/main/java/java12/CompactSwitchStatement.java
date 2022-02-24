package java12;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Java 12 introduces a more compact way of writing switch statements
 * They also remove the need for break statements
 * And  we can assign a switch statement directly to the variable
 */
public class CompactSwitchStatement {

    public static void main(String[] args) {

        // Before Java 12:
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }

        // Since Java 12:
        typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
            case SATURDAY, SUNDAY -> "Day Off";
        };



    }
}
