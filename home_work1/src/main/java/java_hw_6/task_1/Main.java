package java_hw_6.task_1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();
        Dog dog = new Dog();

        System.out.println("\nBird:");
        bird.eat();
        bird.sleep();
        bird.fly();

        System.out.println("\nFish:");
        fish.eat();
        fish.sleep();
        fish.swim();

        System.out.println("\nDog:");
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}