package collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Author: PRASANT
 * Date: 21/03/25
 */

public class DequeDemo {
	public static void main(String[] args) {
		// double-ended queue
		// allows insertion and removal of elements from both ends
		// versatile than regular queues and stacks because they support all the operations of both
		Deque<Integer> deque1= new ArrayDeque<>(); // faster iteration, low memory, no null allowed, circular array (head, tail)
		deque1.addFirst(23);
		deque1.addLast(5);
		deque1.offerFirst(2);
		deque1.offerLast(9);
		System.out.println(deque1);
		System.out.println("First Element: " + deque1.getFirst());
		System.out.println("Last Element: " + deque1.getLast());
		deque1.removeFirst(); // Remove 2
		deque1.pollLast(); // Remove 9
		deque1.forEach(System.out :: println);

		Deque<Integer> deque2 = new LinkedList<>(); // insertion, deletion somewhere in middle
	}
}
