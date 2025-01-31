package generics;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public enum Operations {
	ADD, SUB, MUL, DIV, MOD;

	public <T extends Number> double apply(T n1, T n2) {
		return switch (this) {
			case ADD -> n1.doubleValue() + n2.doubleValue();
			case SUB -> n1.doubleValue() - n2.doubleValue();
			case MUL -> n1.doubleValue() * n2.doubleValue();
			case DIV -> n1.doubleValue() / n2.doubleValue();
			case MOD -> n1.doubleValue() % n2.doubleValue();
		};
	}
}
