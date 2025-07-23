package java_hw_3.task_5;

    import java.util.Scanner;

    public class  Program {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the operator (+, %, /, *): ");
        char operator = scanner.next().charAt(0);
        int result = (operator == '+') ? (num1 + num2) :
                     (operator == '%') ? (num1 % num2) :
                     (operator == '/') ? (num2 != 0 ? (num1 / num2) : 0) :
                     (operator == '*') ? (num1 * num2) : 0;
        System.out.println("Result: " + result);
        }
    }

