package collections.map.IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		Map<String, Integer> map = new IdentityHashMap<>();
		map.put(s1, 1);
		map.put(s2, 2);

		System.out.println(map);
	}
}
