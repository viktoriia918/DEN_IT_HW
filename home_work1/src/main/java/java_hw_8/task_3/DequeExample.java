package java_hw_8.task_3;
import java.util.*;
public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        System.out.println("Додаємо елементи з обох боків:");
        deque.addFirst("початок");
        deque.addLast("кінець");
        deque.add("середина"); // аналог addLast
        System.out.println("Deque: " + deque);

        System.out.println("\nОтримуємо перший і останній елементи без видалення:");
        System.out.println("peekFirst(): " + deque.peekFirst());
        System.out.println("peekLast(): " + deque.peekLast());

        System.out.println("\nВидаляємо елементи з обох боків:");
        System.out.println("pollFirst(): " + deque.pollFirst());
        System.out.println("pollLast(): " + deque.pollLast());
        System.out.println("Deque після видалень: " + deque);

        System.out.println("\nПримусово додаємо елементи (якщо є обмеження):");
        deque.offerFirst("новий початок");
        deque.offerLast("новий кінець");
        System.out.println("Deque після offerFirst/offerLast: " + deque);

        System.out.println("\nЧи порожній Deque? " + deque.isEmpty());

        System.out.println("\nРозмір Deque: " + deque.size());

        System.out.println("\nОчищаємо Deque:");
        deque.clear();
        System.out.println("Deque after clear: " + deque);
    }
}