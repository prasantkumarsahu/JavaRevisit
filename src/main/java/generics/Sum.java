package generics;

import java.util.List;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public class Sum {
	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		return sum;
	}


}
