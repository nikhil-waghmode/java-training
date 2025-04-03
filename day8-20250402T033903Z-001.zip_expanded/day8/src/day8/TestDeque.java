package day8;

import java.util.*;

public class TestDeque {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.add(10);
        deque.addFirst(5);
        deque.addLast(15);
        deque.offer(20);
        deque.offerFirst(2);
        deque.offerLast(25);

        System.out.println("Deque after adding elements: " + deque);

        // Accessing elements
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());
        System.out.println("Peek first: " + deque.peekFirst());
        System.out.println("Peek last: " + deque.peekLast());

        // Removing elements
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("Deque after removals: " + deque);

        // Using poll methods
        System.out.println("Poll first: " + deque.pollFirst());
        System.out.println("Poll last: " + deque.pollLast());
        System.out.println("Deque after polling: " + deque);

        // Checking size and presence of elements
        System.out.println("Size of deque: " + deque.size());
        System.out.println("Contains 10? " + deque.contains(10));

        
	// Removing first occurrence of an element
        boolean removedFirst = deque.removeFirstOccurrence(20);
        System.out.println("Removed first occurrence of 20? " + removedFirst);
        System.out.println("Deque after first occurrence removal: " + deque);

        // Removing last occurrence of an element
        boolean removedLast = deque.removeLastOccurrence(20);
        System.out.println("Removed last occurrence of 20? " + removedLast);
        System.out.println("Deque after last occurrence removal: " + deque);

        // Java 21+ feature: reversed() method
        Deque<Integer> reversedDeque = deque.reversed();
        System.out.println("Reversed deque: " + reversedDeque);

        // Checking the original deque remains unchanged
        System.out.println("Original deque remains unchanged: " + deque);

	// Clearing deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);
        System.out.println("Is deque empty? " + deque.isEmpty());

    }
}
