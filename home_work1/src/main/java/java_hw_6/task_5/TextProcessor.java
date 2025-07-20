package java_hw_6.task_5;

interface TextProcessor {
    String process(String text);
    default String removeDigits(String text) {
        return text.replace(".", "");
    }
}