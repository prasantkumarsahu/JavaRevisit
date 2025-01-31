package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public class Main {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<>(5);
		Box<String> stringBox = new Box<>("Hello");
		System.out.println(integerBox.getValue());
		System.out.println(stringBox.getValue());

		Box2<Integer, String> student = new Box2<>(1, "Shyam");
		System.out.println(student);

		StringContainer stringContainer = new StringContainer("Ram");
		stringContainer.displayValue();

		Container<Integer> integerContainer = new GenericContainer<>(5);
		System.out.println(integerContainer.getValue());

		GenericContainer<Integer> integerGenericContainer = new GenericContainer<>(50);
		integerGenericContainer.displayValue();

		MyNumber<Integer> myNumber = new MyNumber<>(10);
		MyNumberContainer<MyNumber<Integer>> numberContainer = new MyNumberContainer<>(myNumber);
		System.out.println(numberContainer.value().getValue());

		Box3 stringBox3 = new Box3("Laxman");
		Box3 integerBox3 = new Box3(15);
		stringBox3.display();
		integerBox3.display();

		double res1 = Operations.ADD.apply(10, 20);
		System.out.println(res1);

		double sum = Sum.sum(Arrays.asList(1, 3.5, 29, 2.55));
		System.out.println(sum);

		List<? extends Number> list1 = List.of(4, 5, 6.73, 34, 57L);
		for (Number n : list1) {
			System.out.println(n);
		}

		List<? super Integer> list2 = List.of(23, 4, 33.4, 24L);
		for (Object i : list2) {
			System.out.println(i);
		}
	}
}
