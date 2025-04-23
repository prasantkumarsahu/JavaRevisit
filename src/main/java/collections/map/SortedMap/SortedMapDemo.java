package collections.map.SortedMap;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Author: PRASANT
 * Date: 11/02/25
 */

public class SortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap<>((a, b) -> b - a);

		map.put(89, "Prasant");
		map.put(67, "Akhay");
		map.put(90, "Subham");
		map.put(78, "Mohit");

//		System.out.println(map);
//		System.out.println(map.firstKey());
//		System.out.println(map.lastKey());
//		System.out.println(map.firstEntry());
//		System.out.println(map.lastEntry());
//		System.out.println(map.headMap(90)); // explicit
//		System.out.println(map.tailMap(78)); // implicit
//		System.out.println(map.computeIfPresent(90, (integer, s) -> s + " : " + integer));
//		System.out.println(map.subMap(78, 90));

		NavigableMap<Integer, String> navigableMap = new TreeMap<>();
		navigableMap.put(1, "One");
		navigableMap.put(5, "Five");
		navigableMap.put(3, "Three");

		System.out.println(navigableMap);
		System.out.println(navigableMap.lowerKey(4));
		System.out.println(navigableMap.ceilingKey(4));
		System.out.println(navigableMap.higherEntry(1));
	}
}
