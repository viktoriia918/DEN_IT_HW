package java_hw_9.task_1;

public class Car {
    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand + " - " + speed + " km/h";
    }
}