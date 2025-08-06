package java_hw_6.task_4;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(5);
        Figure triangle = new Triangle(6, 4, 5, 5, 6);
        Figure circle = new Circle(3);
        System.out.println("----- Square -----");
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println("\n----- Triangle -----");
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("\n----- Circle -----");
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter(circuit): " + circle.getPerimeter());
    }
}