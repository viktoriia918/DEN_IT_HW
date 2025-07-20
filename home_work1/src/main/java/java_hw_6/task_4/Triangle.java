package java_hw_6.task_4;

class Triangle extends Figure {
    private double base;
    private double height;
    private double side1, side2, side3;
    public Triangle(double base, double height, double side1, double side2, double side3) {
    this.base = base;
    this.height = height;
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    }
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    @Override
    public String toString() {
    return "Triangle with base " + base + ",height" + height + ", side: " + side1 + ", " + side2 + ", " + side3;
    }
}