package java_hw_3;


import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Яка програма вас цікавить (IntelliJ IDEA, Git, Java): ");
        String program = scanner.nextLine();

        System.out.print("Яку операційну систему ви використовуєте (Linux, MacOS, Windows): ");
        String os = scanner.nextLine();

        switch (program) {
            case "IntelliJ IDEA":
                switch (os) {case "Windows":
                        System.out.println("https://www.jetbrains.com/idea/download/#section=windows");
                        break;
                    case "MacOS":
                        System.out.println("https://www.jetbrains.com/idea/download/#section=mac");
                        break;
                    case "Linux":
                        System.out.println("https://www.jetbrains.com/idea/download/#section=linux");
                        break;
                    default:

                        System.out.println("Такої ОС не існує.");
                }
                break;

            case "Git":
                switch (os) {
                    case "Windows":
                        System.out.println("https://git-scm.com/download/win");
                        break;
                    case "MacOS":
                        System.out.println("https://git-scm.com/download/mac");
                        break;
                    case "Linux":
                        System.out.println("https://git-scm.com/download/linux");
                        break;
                    default:
                        System.out.println("Такої ОС не існує.");
                }
                break;

            case "Java":
                switch (os) {
                    case "Windows":
                        System.out.println("https://www.oracle.com/java/technologies/javase-downloads.html");
                        break;
                    case "MacOS":
                        System.out.println("https://www.oracle.com/java/technologies/javase-jdk11-downloads.html");
                        break;
                    case "Linux":
                        System.out.println("https://openjdk.org/install/");
                        break;
                    default:
                        System.out.println("Такої ОС не існує.");
                }
                break;
            default:
                System.out.println("Такої програми не існує.");
        }   } }