package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class reverseString2 {

	public static void main(String[] args) {

		String name = "girish";

		String result = new StringBuilder(name).reverse().toString();
		System.out.println(result);

		List<Integer> num = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		List<Integer> ress = num.stream().filter(a -> String.valueOf(a).startsWith("1")).collect(Collectors.toList());

		System.out.println(ress);

		List<String> data = Arrays.asList("java", "Python", "C", "java", "php", "C");
		List<String> distinct = data.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);

	}

}
