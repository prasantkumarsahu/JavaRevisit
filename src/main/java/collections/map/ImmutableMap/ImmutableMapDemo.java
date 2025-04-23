package collections.map.ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: PRASANT
 * Date: 12/03/25
 */

public class ImmutableMapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
		System.out.println(map2);
//		map2.put("C", 3); // throws UnsupportedOperationException
		Map<String, Integer> map3 = Map.of("Subham", 98, "Vivek", 89); // only 10 entries max
//		map3.put("Akhsit", 88); // throws UnsupportedOperationException
		Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 99), Map.entry("Vivek", 99));
//		map4.put("Subham", 78); // throws UnsupportedOperationException
	}
}
