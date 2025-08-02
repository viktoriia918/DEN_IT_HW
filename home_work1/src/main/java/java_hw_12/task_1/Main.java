package java_hw_12.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            try {
                System.out.print("Enter the first number: ");
                String inputFirst = scanner.nextLine();
                double firstNumber = parseNumber(inputFirst);

                System.out.print("Enter the second number: ");
                String inputSecond = scanner.nextLine();
                double secondNumber = parseNumber(inputSecond);

                System.out.println("Select an operation:");
                System.out.println("1 - Addition (+)");
                System.out.println("2 - Subtraction (-)");
                System.out.println("3 - Multiplication (*)");
                System.out.println("4 - Division (/)");

                String choice = scanner.nextLine();
                double result;

                switch (choice) {
                    case "1":
                        result = calc.add(firstNumber, secondNumber);
                        break;
                    case "2":
                        result = calc.subtract(firstNumber, secondNumber);
                        break;
                    case "3":
                        result = calc.multiply(firstNumber, secondNumber);
                        break;
                    case "4":
                        result = calc.divide(firstNumber, secondNumber);
                        break;
                    default:
                        throw new UnknownOperationException("Invalid operation.");
                }

                System.out.println("Result: " + result);

            } catch (DivisionByZeroException | NotANumberException | UnknownOperationException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unknown error happened.");
            }

            System.out.print("Would you like to perform another operation? (yes/no): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (!answer.equals("yes")) {
                System.out.println("Thank you for using the calculator!");
                break;
            }
        }

        scanner.close();
    }

    public static double parseNumber(String input) throws NotANumberException {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new NotANumberException("You have entered a nonnumeric value. Try again.");
        }
    }
}