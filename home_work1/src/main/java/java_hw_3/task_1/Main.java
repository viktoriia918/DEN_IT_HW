package java_hw_3.task_1;

import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести строку:");
        String string1 = scanner.next(); // "Я"
        String string2 = scanner.next(); // "тестую"
        String string3 = scanner.next(); // "чудово."
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next(); // "Що ще потрiбно?"

         System.out.println ("string1 = " + string1);
         System.out.println ("string2 = " + string2);
         System.out.println ("string3 = " + string3);
         System.out.println ("string4 = " + string4);
    }
}
