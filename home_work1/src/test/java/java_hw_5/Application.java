package java_hw_5;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter your name: ");
    String name = scanner.nextLine();

    NumbersApplication game = new NumbersApplication(name);
    game.startGame(scanner);

    scanner.close();
    }
}
