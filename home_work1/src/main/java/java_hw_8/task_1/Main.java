package java_hw_8.task_1;

import java.util.*;

public class Main {
    private static final Map<String, Person> people = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to People List Management!");
        while (true) {
            System.out.println("\nSelect a team (addPerson / getPerson / exit):");
            String command = scanner.nextLine().trim().toLowerCase();
            switch (command) {
                case "addperson":
                    addPerson();
                    break;
                case "getperson":
                    getPerson();
                    break;
                case "exit":
                    System.out.println("Program termination.");
                    return;
                default:
                    System.out.println("Unknown team.Try again.");
            }
        }
    }

    private static void addPerson() {
        System.out.println("Enter your last name:");
        String surname = scanner.nextLine().trim();
        String key = surname.toUpperCase();
        System.out.println("Enter your name:");
        String name = scanner.nextLine().trim();
        int age = -1;
        while (true) {
            System.out.println("Enter your age:");
            String ageInput = scanner.nextLine().trim();
            try {
                age = Integer.parseInt(ageInput);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: non=numeric value entered.Try again.");
            }
        }
        if (people.containsKey(key)) {
            System.out.println("A person with this last name already exists.");
            System.out.println("Would you like to update your information? (yes/no):");
            String choice = scanner.nextLine().trim().toLowerCase();
            if (!choice.equals("yes")) {
                System.out.println("Addition cancelled.");
                return;
            }
        }
        people.put(key, new Person(name, surname, age));
        System.out.println("Personality added/update successful.");
    }

    private static void getPerson() {
        if (people.isEmpty()) {
            System.out.println("The list of people is empty.");
            return;
        }
        System.out.println("Please enter a last name to search:");
        String surnameInput = scanner.nextLine().trim();
        String key = surnameInput.toUpperCase();
        if (people.containsKey(key)) {
            Person person = people.get(key);
            System.out.println("Person found:");
            System.out.println(person);
        } else {
            System.out.println("Persons with this last name not listed.");
            System.out.println("Available surnames: ");
            for (String k : people.keySet()) {
                System.out.println("- " + k);
            }
        }
    }
}