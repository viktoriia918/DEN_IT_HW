package java_hw_2.task_3;

public class Main {
    public static void main(String[] args) {
        String string = "Testing, is my favourite job";

        String[] words = string.replace(",", "").split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println("Слово" + (i + 1) + " = " + words[i] +
                    ", Довжина цього слова = " + words[i].length());
        }
        int firstLength = words[0].length();
        boolean isLongest = true;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() >= firstLength) {
                isLongest = false;
                break;
            }
        }

        System.out.println(isLongest);
    }
}
