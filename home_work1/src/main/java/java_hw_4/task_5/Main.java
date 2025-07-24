package java_hw_4.task_5;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
        array[i] = random.nextInt(100);
        }
        System.out.print("array:");
        for (int num : array ){
        System.out.print(num + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search:");
        int userNumber = scanner.nextInt();
        boolean found = false;
        for (int num : array){
        if(num == userNumber){
        found = true;
        break;
        }
        }
        if (found){
        System.out.println("Number" + userNumber + "Is in in the array.");
        System.out.println("Number" + userNumber + "Not in array.");
        }
        scanner.close();
    }
}
