package java_hw_3.task_3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести первое число:");
        int a = scanner.nextInt();

        System.out.print("Ввести второе число:");
        int b = scanner.nextInt();

        int result =( a > b ) ? ( a - b ) : ( b - a );
        System.out.println(" Разница ( от большего меньше ):" + result);
    }
}
