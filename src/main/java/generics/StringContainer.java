package generics;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public class StringContainer implements Container<String> {

	private String value;

	public StringContainer(String value) {
		this.value = value;
	}

	public void displayValue() {
		System.out.println("The value is : " + getValue());
	}

	@Override
	public String getValue() {
		return value;
	}
}
