package collections.map.HashMap;

import java.util.HashMap;

/**
 * Author: PRASANT
 * Date: 06/02/25
 */

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(2, 2);

		map.put("Superman", 78);
		map.put("Batman", 59);
		map.put("Aquaman", 98);

		System.out.println(map.size());
	}
}
