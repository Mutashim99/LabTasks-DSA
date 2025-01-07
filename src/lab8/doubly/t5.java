package lab8.doubly;

import java.util.Deque;
import java.util.LinkedList;

class DequeLinkedListExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.add("Mutashim");
        deque.add("Izhar");
        deque.add("Rayyan");
        deque.add("Shahzaib");
        deque.add("Riyan");


        System.out.println("Deque after adding student names:");
        System.out.println(deque);

        deque.offerFirst("Zohaib");
        System.out.println("\nDeque after adding 'Zohaib' at the beginning:");
        System.out.println(deque);

        deque.offerLast("Sami");
        System.out.println("\nDeque after adding 'Sami' at the end:");
        System.out.println(deque);

        deque.pollFirst();
        System.out.println("\nDeque after removing the first element:");
        System.out.println(deque);

        String firstElement = deque.peekFirst();
        System.out.println("\nFirst element (without removal): " + firstElement);

        deque.pollLast();
        System.out.println("\nDeque after removing the last element:");
        System.out.println(deque);
    }
}
