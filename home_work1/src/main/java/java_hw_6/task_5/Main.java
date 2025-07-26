package java_hw_6.task_5;

public class Main {
    public static void main(String[] args) {
        String input = "  Hello. World.  ";
        TextProcessor upper = new UpperCaseProcessor();
        TextProcessor reverse = new ReverseProcessor();
        TextProcessor trim = new TrimProcessor();
        System.out.println("=== UpperCaseProcessor ===");
        System.out.println("process: " + upper.process(input));
        System.out.println("removeDigits (remove dots): " + upper.removeDigits(input));
        System.out.println("\n=== ReverseProcessor ===");
        System.out.println("process: " + reverse.process(input));
        System.out.println("removeDigits (remove dots): " + reverse.removeDigits(input));
        System.out.println("\n=== TrimProcessor ===");
        System.out.println("process: " + trim.process(input));
        System.out.println("removeDigits (remove dots): " + trim.removeDigits(input));
    }
}