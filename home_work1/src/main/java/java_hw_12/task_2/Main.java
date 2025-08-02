package java_hw_12.task_2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Vehicle("Volvo", 210, 39000.0, 4);

        Vehicle unknownVehicle = null;

        System.out.println("---- Object: car ----");
        Optional<Vehicle> optionalCar = Optional.of(car);
        testOptional(optionalCar);

        System.out.println("\n---- Object: unknownVehicle ----");
        Optional<Vehicle> optionalUnknown = Optional.ofNullable(unknownVehicle);
        testOptional(optionalUnknown);
    }

    public static void testOptional(Optional<Vehicle> vehicleOptional) {

        System.out.println("isPresent(): " + vehicleOptional.isPresent());

        vehicleOptional.ifPresent(v -> System.out.println("ifPresent(): " + v));

        Vehicle defaultVehicle = new Vehicle("Default", 0, 0.0, 0);
        Vehicle result1 = vehicleOptional.orElse(defaultVehicle);
        System.out.println("orElse(): " + result1);

        Vehicle result2 = vehicleOptional.orElseGet(() -> new Vehicle("Generated", 110, 2869.0, 2));
        System.out.println("orElseGet(): " + result2);

        String name = vehicleOptional.map(Vehicle::getName).orElse("No title");
        System.out.println("map(getName): " + name);

        try {
            Vehicle v = vehicleOptional.orElseThrow(() -> new RuntimeException("Object is missing!"));
            System.out.println("orElseThrow(): " + v);
        } catch (Exception e) {
            System.out.println("orElseThrow(): Exception - " + e.getMessage());
        }
    }
}