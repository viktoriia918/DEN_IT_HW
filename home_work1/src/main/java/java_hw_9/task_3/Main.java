package java_hw_9.task_3;

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("dog");
        Animal cat = factory.createAnimal("cat");
        Animal bird = factory.createAnimal("bird");

        System.out.print("Dog says: ");
        if (dog != null) dog.speak();

        System.out.print("Cat says: ");
        if (cat != null) cat.speak();

        System.out.print("Bird says: ");
        if (bird != null) bird.speak();

        Animal unknown = factory.createAnimal("lion");
        if (unknown != null) unknown.speak();
    }
}