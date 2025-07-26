package java_hw_7.task_2;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Gpa=" + gpa +
                '}';
    }

    public static List<Student> addStudent(List<Student> students, Student student) {
        students.add(student);
        return students;
    }

    public static List<Student> removeStudentById(List<Student> students, int id) {
        students.removeIf(s -> s.getId() == id);
        return students;
    }

    public static Student findStudentByName(List<Student> students, String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        System.out.println("Student with the name'" + name + "' not found.");
        return null;
    }

    public static void printAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("The list of students is empty.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}