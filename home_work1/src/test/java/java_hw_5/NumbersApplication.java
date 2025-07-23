package java_hw_5;
import java.util.Random;
public class NumbersApplication {
private String name;
private int gameNumber;
public NumbersApplication(String name) {
this.name = name;
Random random = new Random();
this.gameNumber = random.nextInt(101); // [0-100]
}
public boolean checkGuess(int userGuess) {
if (userGuess < gameNumber) {
System.out.println("Your number is too small. Please, try again.");
return false;
} else if (userGuess > gameNumber) {
System.out.println("Your number is too big. Please, try again.");
return false;
} else {
System.out.println("Congratulations, " + name + "!");
return true;
}
}
}