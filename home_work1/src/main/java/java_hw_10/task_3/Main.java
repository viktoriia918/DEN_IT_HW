package java_hw_10.task_3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        boolean result = DateTimeUtils.isWeekend(now);
        System.out.println(result);
    }
}