package collections.map.HashTable;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Author: PRASANT
 * Date: 11/03/25
 */

public class HashTableDemo {
	public static void main(String[] args) throws InterruptedException {
		// Thread safe (synchronized)
		// No null key or value
		// Legacy class
		// Slower than HashMap
		// only linked list in case of collision
		// all methods are synchronized
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "Apple");
		hashtable.put(2, "Banana");
		hashtable.put(3, "Cherry");

//		System.out.println(hashtable);
//		System.out.println("Value for key 2 : " + hashtable.get(2));

		HashMap<Integer, String> hashMap = new HashMap<>();
		Hashtable<Integer, String> hashtable1= new Hashtable<>();
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				hashtable1.put(i, "Thread1");
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 1000; i < 2000; i++) {
				hashtable1.put(i, "Thread2");
			}
		});
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		System.out.println(hashtable1.size());
	}
}
