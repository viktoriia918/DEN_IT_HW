package java_hw_3.task_2;

    import java.util.Scanner;

    public class Main{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter to the side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter to the side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter to the side c: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
        System.out.println("The triangle exist.");
        } else {
        System.out.println("The triangle does not exist.");
        }
        }
    }