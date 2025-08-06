package java_hw_6.task_2;

public class Car extends Vehicle {
    public int passengerCapacity;

    Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    void move() {
        System.out.println("Vehicle " + name + "move at speed  " + speed + " km/hour  " + passengerCapacity + " number of people");
    }
}