package java_hw_10.task_2;

import java.time.LocalDateTime;

public class Main {
    public static void printCalculatedDateTime(LocalDateTime dateTime, int days, int hours) {
        LocalDateTime result = DateTimeCalculator.calculateFutureDateTime(dateTime, days, hours);
        System.out.println("Initial time: " + dateTime);
        System.out.println("Offset: " + days + " days, " + hours + " hours");
        System.out.println("Updated time: " + result);
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        printCalculatedDateTime(now, 4, -6);
    }
}