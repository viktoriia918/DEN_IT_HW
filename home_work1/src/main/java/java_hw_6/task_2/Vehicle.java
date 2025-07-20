package java_hw_6.task_2;

public class Vehicle {
String name;
int speed;
Vehicle(String name, int speed) {
this.name = name;
this.speed = speed;
}
void move() {
System.out.println("The Vehicle moves at speed " + speed + " km/hour");
}
void stop() {
System.out.println("Vehicle " + name + " stop");
}
}
class Car extends Vehicle {
int passengerCapacity;
Car(String name, int speed, int passengerCapacity) {
super(name, speed);
this.passengerCapacity = passengerCapacity;
}
@Override
void move() {

System.out.println("Vehicle " + name + "move at speed  " + speed +
                " km/hour  " + passengerCapacity + " number of people");
    }
}
class Truck extends Vehicle {
double loadCapacity;
Truck(String name, int speed, double loadCapacity) {
super(name, speed);
this.loadCapacity = loadCapacity;
}
@Override
void move() {
System.out.println("Vehicle " + name + "load capacity" + loadCapacity +
                " move at speed " + speed + " km/hour");
    }
}