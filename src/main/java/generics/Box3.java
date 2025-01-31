package generics;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public class Box3 {

	private final Object value;

	public <T> Box3(T value) {
		this.value = value;
	}

	public void display() {
		System.out.println(value);
	}
}
