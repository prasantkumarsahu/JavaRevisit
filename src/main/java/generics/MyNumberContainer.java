package generics;

/**
 * Author: PRASANT
 * Date: 09/01/25
 */

public record MyNumberContainer<N extends Number & Container<Integer>>(N value) {
}
