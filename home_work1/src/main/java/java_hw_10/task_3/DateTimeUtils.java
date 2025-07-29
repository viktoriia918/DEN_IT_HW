package java_hw_10.task_3;

import java.time.LocalDateTime;
import java.time.DayOfWeek;

public class DateTimeUtils {
    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }
}