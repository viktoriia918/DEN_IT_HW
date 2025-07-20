package java_hw_6.task_5;

class TrimProcessor implements TextProcessor {
    @Override
    public String process(String text) {
    return text.trim();
    }
}