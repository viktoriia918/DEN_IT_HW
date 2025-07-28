package java_hw_9.task_2;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = Vehicle.getInstance("Ford", 220, 50000);
        Vehicle v2 = Vehicle.getInstance("Opel", 240, 25000);
        Vehicle v3 = Vehicle.getInstance("Mercedes", 250, 80000);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("\nHashCodes:");
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(v3.hashCode());
    }
}