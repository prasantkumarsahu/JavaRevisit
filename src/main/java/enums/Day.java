package enums;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public enum Day {
	SUNDAY("Sunday"),
	MONDAY("Monday"),
	TUESDAY("Tuesday"),
	WDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday");

	private final String lower;

	Day(String lower) {
		this.lower = lower;
	}

	public void display() {
		System.out.println("The day is : " + lower);
	}
}
