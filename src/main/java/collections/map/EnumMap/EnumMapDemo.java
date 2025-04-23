package collections.map.EnumMap;

import java.util.EnumMap;
import java.util.Map;

/**
 * Author: PRASANT
 * Date: 12/03/25
 */

public class EnumMapDemo {
	public static void main(String[] args) {
		// array of size same as enum
		// no hashing
		// ordinal/index is used
		// maintains order as enum is defined
		// faster than HashMap because of no hashing
		// memory efficient
		Map<Day, String> map = new EnumMap<>(Day.class);

		map.put(Day.THURSDAY, "Gym");
		map.put(Day.MONDAY, "Walk");

		System.out.println(map);
	}
}

enum Day {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}