package java_hw_7.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student.addStudent(students, new Student(1, "Nata", 20, 5.1));
        Student.addStudent(students, new Student(2, "Serge", 46, 4.5));
        Student.addStudent(students, new Student(3, "Vadim", 31, 3.2));
        Student.addStudent(students, new Student(4, "Alina", 34, 4.9));
        Student.addStudent(students, new Student(5, "Hard", 20, 6.0));
        System.out.println("List of students after adding:");
        Student.printAllStudents(students);
        System.out.println("\nSearch for student with name 'Alina':");
        Student found = Student.findStudentByName(students, "Alina");
        if (found != null) {
            System.out.println("Found: " + found);
        }
        System.out.println("\nStudent deletion with ID = 4");
        Student.removeStudentById(students, 4);
        System.out.println("List of students after deletion:");
        Student.printAllStudents(students);
    }
}