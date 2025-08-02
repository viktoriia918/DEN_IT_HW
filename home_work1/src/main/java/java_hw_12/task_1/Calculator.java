package java_hw_12.task_1;

public class Calculator {
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) throws DivisionByZeroException {
        if (secondNumber == 0) {
            throw new DivisionByZeroException("Error: Division by zero is impossible!");
        }
        return firstNumber / secondNumber;
    }
}