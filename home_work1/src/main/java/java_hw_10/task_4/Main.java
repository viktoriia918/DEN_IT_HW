package java_hw_10.task_4;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        String formatted = DateTimeUtils.formatDateTime(now, "dd.MM.yyyy HH:mm");
        System.out.println("Formatted data and time: " + formatted);

        String fancyFormat = DateTimeUtils.formatDateTime(now, "EEEE, MMMM d, yyyy HH:mm");
        System.out.println(fancyFormat);
    }
}