package java_hw_11.task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Nata", "Bogdan", 64, 6000));
        persons.add(new Person("Elen", "Tim", 35, 6500));
        persons.add(new Person("Serge", "Levin", 58, 5500));
        persons.add(new Person("Vika", "Smith", 75, 4300));
        persons.add(new Person("Karin", "Mayer", 80, 4700));

        System.out.println("The whole list of people:");
        persons.forEach(System.out::println);

        List<String> namesUnder70 = persons.stream()
                .filter(person -> person.getAge() < 70)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("\nNames of people under 70:");
        namesUnder70.forEach(System.out::println);
    }
}