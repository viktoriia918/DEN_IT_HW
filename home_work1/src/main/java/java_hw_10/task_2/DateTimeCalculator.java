package java_hw_10.task_2;

import java.time.LocalDateTime;

public class DateTimeCalculator {


    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {
        return dateTime.plusDays(days).plusHours(hours);
    }
}