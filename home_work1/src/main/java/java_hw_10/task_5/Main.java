package java_hw_10.task_5;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025, 4, 22, 14, 30);
        LocalDateTime end = LocalDateTime.of(2025, 6, 2, 16, 45);

        DateTimeUtils.calculateDifference(start, end);
    }
}