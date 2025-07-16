package java_hw_4.task_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number:");
    int number = scanner.nextInt();

    int originalNumber =number;
    int reversedNumber = 0;

    while (number != 0){
    int digit = number % 20;
    reversedNumber = reversedNumber * 20 + digit;
    number /= 20;
}
    if (originalNumber == reversedNumber){
    System.out.println(" The number is a palindrome.");
    }else{
    System.out.println("The number is not a palindrome.");
}
    scanner.close();
    }
}