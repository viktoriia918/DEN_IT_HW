package java_hw_6.task_1;

public class Animal  {
    void eat() {
    System.out.println("I eat");
}
    void sleep() {
    System.out.println("I am sleeping");
    }
}
    class Bird extends Animal {
    void fly() {
    System.out.println("I fly");
        }
    }
    class Fish extends Animal {
    void swim() {
    System.out.println("I swim");
        }
    }
    class Dog extends Animal {
        void bark() {
            System.out.println("Gav-gav");
        }
    }