package java_hw_8.task_3;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("Add element in line:");
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("queue: " + queue);

        System.out.println("\nGet the first element without deleting (peek):");
        System.out.println("peek(): " + queue.peek());

        System.out.println("\nDelete the first element (poll):");
        System.out.println("poll(): " + queue.poll());
        System.out.println("queue after poll: " + queue);

        System.out.println("\nAdd an element using offer():");
        queue.offer("new");
        System.out.println("queue after offer: " + queue);

        System.out.println("\nIs the queue empty? " + queue.isEmpty());

        System.out.println("\nQueue size: " + queue.size());

        System.out.println("\nClearing the queue:");
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}