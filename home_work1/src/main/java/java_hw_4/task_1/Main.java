package java_hw_4.task_1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Enter the word.To finish,enter STOP ");
        while (true){
        String word = scanner.next();
        if (word.equals("STOP")){
            break;
        }
        if (sentence.length() > 0 ){
            sentence.append(" ");

        }
            sentence.append(word);

        }
        System.out.println("Received offer");
        System.out.println(sentence.toString());
    }
}
