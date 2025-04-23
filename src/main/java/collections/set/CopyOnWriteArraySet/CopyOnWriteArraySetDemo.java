package collections.set.CopyOnWriteArraySet;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Author: PRASANT
 * Date: 17/03/25
 */

public class CopyOnWriteArraySetDemo {
	public static void main(String[] args) {
		// Thread safe
		// Copy-On-Write Mechanism
		// No Duplicate Elements
		// Iterators Do Not Reflect Modifications

		CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
		ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

		for (int i = 1; i <= 5; i++) {
			copyOnWriteArraySet.add(i);
			concurrentSkipListSet.add(i);
		}

		System.out.println("Initial CopyOnWriteArraySet: " + copyOnWriteArraySet);
		System.out.println("Initial ConcurrentSkipListSet: " + concurrentSkipListSet);

		System.out.println("\nInitiating and modifying CopyOnWriteArraySet: ");
		for (Integer num : copyOnWriteArraySet) {
			System.out.println("Reading from CopyOnWriteArraySet: " + num);

			copyOnWriteArraySet.add(6);
		}
		System.out.println("CopyOnWriteArraySet: " + copyOnWriteArraySet);

		System.out.println("\nInitiating and modifying ConcurrentSkipListSet: ");
		for (Integer num : concurrentSkipListSet) {
			System.out.println("Reading from ConcurrentSkipListSet: " + num);

			concurrentSkipListSet.add(6);
		}
		System.out.println("ConcurrentSkipListSet: " + concurrentSkipListSet);
	}
}
