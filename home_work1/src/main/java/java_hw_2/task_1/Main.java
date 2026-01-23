package java_hw_2.task_1;

public class Main {
    public static void main(String[] args){
    String string1= "This line that i want to cut,cause it is too long";
    String string2= string1.substring(0,35);
    String string3= string2.replace("thet i want to cut","that don't want to cut")+"it is perfect";
    System.out.println("string1: " + string1 + " (length: " + string1.length() + ")");
    System.out.println("string2: " + string2 + " (length: " + string2.length() + ")");
    System.out.println("string3: " + string3 + " (length: " + string3.length() + ")");

    }
}
