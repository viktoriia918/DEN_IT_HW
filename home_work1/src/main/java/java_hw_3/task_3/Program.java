package java_hw_3.task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = scanner.nextInt();
        System.out.print("Enter the second number:");
        int b = scanner.nextInt();
        int result = (a > b) ? (a - b) : (b - a);
        System.out.println(" Difference ( from more to less):" + result);
    }
}