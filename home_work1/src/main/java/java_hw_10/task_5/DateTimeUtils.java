package java_hw_10.task_5;

import java.time.Duration;
import java.time.LocalDateTime;

public class DateTimeUtils {
    public static void calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);

        long totalMinutes = duration.toMinutes();
        long days = totalMinutes / (24 * 60);
        long hours = (totalMinutes % (24 * 60)) / 60;
        long minutes = totalMinutes % 60;

        System.out.println("difference between dates:");
        System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes");
    }
}