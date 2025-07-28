package java_hw_9.task_2;

public class Vehicle {
    private static Vehicle instance;
    private String name;
    private int speed;
    private double price;

    private Vehicle(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public static Vehicle getInstance(String name, int speed, double price) {
        if (instance == null) {
            instance = new Vehicle(name, speed, price);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', speed=" + speed + ", price=" + price + "}";
    }
}