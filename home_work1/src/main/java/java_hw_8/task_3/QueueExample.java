package java_hw_8.task_3;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("Додаємо елементи в чергу:");
        queue.add("перший");
        queue.add("другий");
        queue.add("третій");
        System.out.println("Черга: " + queue);

        System.out.println("\nОтримуємо перший елемент без видалення (peek):");
        System.out.println("peek(): " + queue.peek());

        System.out.println("\nВидаляємо перший елемент (poll):");
        System.out.println("poll(): " + queue.poll());
        System.out.println("Черга після poll: " + queue);

        System.out.println("\nДодаємо елемент за допомогою offer():");
        queue.offer("новий");
        System.out.println("Черга після offer: " + queue);

        System.out.println("\nЧи порожня черга? " + queue.isEmpty());

        System.out.println("\nРозмір черги: " + queue.size());

        System.out.println("\nОчищаємо чергу:");
        queue.clear();
        System.out.println("Черга після clear: " + queue);
    }
}