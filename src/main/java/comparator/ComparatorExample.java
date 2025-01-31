package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Author: PRASANT
 * Date: 20/12/24
 */

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return i2 - i1;
	}
}

public class ComparatorExample {

	private String name;

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(1);
		list.add(5);

		list.sort(new MyComparator());

		List<String> words = Arrays.asList("banana", "apple", "date");

		words.sort(Comparator.comparingInt(String :: length));

		System.out.println(words);
	}
}
