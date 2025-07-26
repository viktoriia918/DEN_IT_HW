package java_hw_5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        NumbersApplication game = new NumbersApplication(name);
        System.out.println("Let the game begin!");
        while (true) {
            System.out.print("Enter your guess (number between 0 and 100): ");
            int userGuess;
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
            } else {
                System.out.println("Please enter a valid number!");
                scanner.next();
                continue;
            }
            boolean isCorrect = game.checkGuess(userGuess);
            if (isCorrect) {
                break;
            }
        }
        scanner.close();
    }
}
