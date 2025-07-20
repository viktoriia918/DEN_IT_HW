package java_hw_6.task_5;

class UpperCaseProcessor implements TextProcessor {
    @Override
    public String process(String text) {
    return text.toUpperCase();
    }
}