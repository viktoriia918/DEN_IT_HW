package java_hw_1;

public class Program {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = a + b; // после a = 16
        b = a - b; // после b = 7
        a = a - b; // после a = 9
        System.out.println("a ="+ a);
        System.out.println("b ="+ b);

    }
}
