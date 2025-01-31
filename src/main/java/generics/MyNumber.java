package generics;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public class MyNumber<N> extends Number implements Container<N> {

	private final N value;

	public MyNumber(N value) {
		this.value = value;
	}

	@Override
	public N getValue() {
		return value;
	}

	@Override
	public int intValue() {
		return 0;
	}

	@Override
	public long longValue() {
		return 0;
	}

	@Override
	public float floatValue() {
		return 0;
	}

	@Override
	public double doubleValue() {
		return 0;
	}
}
