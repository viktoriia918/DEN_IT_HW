package java_hw_4.task_6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[48];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
        }
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum number: " + min);
        System.out.println("Minimum number: " + max);
    }
}