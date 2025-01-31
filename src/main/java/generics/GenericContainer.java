package generics;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public class GenericContainer<T> implements Container<T>{

	private final T value;

	public GenericContainer(T value) {
		this.value = value;
	}

	public void displayValue() {
		System.out.println("The generic value is : " + getValue());
	}

	@Override
	public T getValue() {
		return value;
	}
}
