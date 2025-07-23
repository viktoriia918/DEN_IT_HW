package java_hw_6.task_2;

public class Vehicle {
public String name;
public int speed;
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