package java_hw_8.task_3;

import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        System.out.println("Add an element on both sides:");
        deque.addFirst("start");
        deque.addLast("end");
        deque.add("middle");
        System.out.println("Deque: " + deque);

        System.out.println("\nGet first and last elements without deleting:");
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());

        System.out.println("\nRemove elements from both sides:");
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("Deque after removal: " + deque);

        System.out.println("\nForce adding elements (if there are restrictions):");
        deque.offerFirst("new beginning");
        deque.offerLast("new end");
        System.out.println("Deque after offerFirst/offerLast: " + deque);

        System.out.println("\nEmpty or not Deque? " + deque.isEmpty());

        System.out.println("\nSize Deque: " + deque.size());

        System.out.println("\nWe clean Deque:");
        deque.clear();
        System.out.println("Deque after clear: " + deque);
    }
}