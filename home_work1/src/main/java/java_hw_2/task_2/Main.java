package java_hw_2.task_2;

public class Main{

public static void main(String[] args) {
    String text = "Completely random text in English. In it, we just need to determine how man times the character 'a' occurs there. And we can use the split method and the length method.";
    String lowerCaseText = text.toLowerCase();
    String[] parts = lowerCaseText.split("a");
    int count = parts.length - 1;
    System.out.println("Кількість входжень символу 'a' або 'A': " + count);
}
}