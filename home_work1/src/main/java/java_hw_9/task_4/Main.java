package java_hw_9.task_4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("Volvo 5")
                .setPrice(50000)
                .setMaxSpeed(250)
                .setCountOfWheels(5)
                .build();

        System.out.println(car);
    }
}