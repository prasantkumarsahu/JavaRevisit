package collections.map.comparable;

import collections.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

public class ComparableDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Charlie", 3.7));
		list.add(new Student("Anupam", 9.7));
		list.add(new Student("Abhi", 8.4));
		list.add(new Student("Rina", 7.9));

		list.sort(null);

		System.out.println(list);
	}
}
