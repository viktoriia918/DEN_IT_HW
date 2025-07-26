package java_hw_6.task_2;

public class Truck extends Vehicle {
    public double loadCapacity;

    Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void move() {
        System.out.println("Vehicle " + name + "load capacity" + loadCapacity + " move at speed " + speed + " km/hour");
    }
}