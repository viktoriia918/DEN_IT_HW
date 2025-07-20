package java_hw_6.task_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120, 5);
        Truck truck = new Truck("Volvo Truck", 80, 12.5);
        System.out.println("=== Car ===");
        car.move();
        car.stop();
        System.out.println("\n=== Truck ===");
        truck.move();
        truck.stop();
    }
}