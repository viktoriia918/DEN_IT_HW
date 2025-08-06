package java_hw_4.task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numberStr = scanner.nextLine();
        String reversedStr = new StringBuilder(numberStr).reverse().toString();
        if (numberStr.equals(reversedStr)) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        scanner.close();
    }
}