package java_hw_8.task_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();


        Person p1 = new Person("Nata", "Dub", 30);
        Person p2 = new Person("Jak", "kot", 25);
        Person p3 = new Person("Nata", "Dub", 30); // Дублікат p1
        Person p4 = new Person("Toma", "Franc", 40);
        Person p5 = new Person("Jak", "Kot", 25); // Дублікат p2


        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);


        System.out.println("List of unique person in Set:");
        for (Person person : people) {
            System.out.println(person);
        }


        System.out.println("\nIs it contained p2? " + people.contains(p2));
        people.remove(p4);
        System.out.println("\nAfter removal p4:");
        people.forEach(System.out::println);

        System.out.println("\nCollection size: " + people.size());

        people.clear();
        System.out.println("\nSet cleaned.Is it empty? " + people.isEmpty());
    }
}