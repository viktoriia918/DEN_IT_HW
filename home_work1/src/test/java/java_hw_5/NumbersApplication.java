package java_hw_5;
import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    private String name;
    private int gameNumber;

    public NumbersApplication(String name) {
    this.name = name;
    Random random = new Random();
    this.gameNumber = random.nextInt(101); // [0-100]
    }
    public void startGame(Scanner scanner) {
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
    if (userGuess < gameNumber) {
    System.out.println("Your number is too small. Please, try again.");
    } else if (userGuess > gameNumber) {
    System.out.println("Your number is too big. Please, try again.");
    } else {
    System.out.println("Congratulations, " + name + "!");
    break;
    }
     }
    }
}
