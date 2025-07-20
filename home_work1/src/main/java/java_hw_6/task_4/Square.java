package java_hw_6.task_4;

class Square extends Figure {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public double getPerimeter() {
        return 4 * side;
    }
    @Override
    public String toString() {
        return "Square with side " + side;
    }
}