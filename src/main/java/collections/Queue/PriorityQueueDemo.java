package collections.Queue;

import java.util.PriorityQueue;

/**
 * Author: PRASANT
 * Date: 21/03/25
 */

public class PriorityQueueDemo {
	public static void main(String[] args) {
		// part of the Queue interface
		// orders elements based on their natural ordering (for primitives lowest first)
		// does not allow null elements

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(15);
		pq.add(10);
		pq.add(16);
		pq.add(13);
		System.out.println(pq); // don't sort elements
		System.out.println(pq.remove());
		System.out.println(pq.peek());

		// Internal Working
		// PriorityQueue is implemented as a min-heap by default (for natural ordering)

	}
}
