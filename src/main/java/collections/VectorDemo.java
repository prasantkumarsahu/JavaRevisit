package collections;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Author: PRASANT
 * Date: 17/01/25
 */

public class VectorDemo {
	public static void main(String[] args) {
//		Vector<Integer> vector = new Vector<>(5, 2);
//		vector.add(1);
//		vector.add(1);
//		vector.add(1);
//		vector.add(1);
//		vector.add(1);
//		vector.add(1);
//		System.out.println(vector.capacity());

		Vector<Integer> list = new Vector<>();

		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				list.add(i);
			}
		});

		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				list.add(i);
			}
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Size of list is : " + list.size());
	}
}
