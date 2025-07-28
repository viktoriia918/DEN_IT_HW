package java_hw_9.task_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", 250);
        Car car2 = new Car("Audi", 230);
        Car car3 = new Car("Mercedes", 240);
        Car car4 = new Car("Toyota", 200);
        Car car5 = new Car("Ford", 210);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        System.out.println("List before sorting:");
        for (Car car : carList) {
            System.out.println(car);
        }

        carList.sort(Comparator.comparingInt(Car::getSpeed));

        System.out.println("\nList after sorting by speed:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}