package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DupElement {

	public static void main(String[] args) {

		List<String> sub = Arrays.asList("java", "Python", "C", "java", "php", "C");

		Set<String> result = sub.stream().map(a -> a.toUpperCase()).collect(Collectors.toSet());

		System.out.println(result);

		List<Integer> num = Arrays.asList(1, 22, 11, 32, 10, 4);

		List<Integer> res = num.stream().filter(n -> n % 2 == 0).map(a -> a * a).collect(Collectors.toList());
		System.out.println(res);

	}

}
