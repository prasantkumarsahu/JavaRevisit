package collections.map.ConcorrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Author: PRASANT
 * Date: 11/03/25
 */

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		// Java 7 -> segment based locking -> 16 segments -> smaller hashmaps
		// Only the segment being written to or read from is locked
		// read : don't require lock unless there is a write operation happening on the same segment
		// write : lock

		// Java 8 -> No segmentation
		// 		  -> Compare-And-Swap approach -> no locking expect resizing or collision
		// Thread A last saw -> x = 42
		// Thread A work -> x to 50
		// if x is still 42, then change it to 50 else don't change and retry
		ConcurrentHashMap<String, Integer> cm = new ConcurrentHashMap<>();

		// MAP -> SORTED -> THREAD SAFE -> ConcurrentSkipListMap
	}
}
