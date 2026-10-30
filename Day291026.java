package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day291026 {

	public static void main(String args[]) {

		List<Integer> num = Arrays.asList(20, 1, 21, 22, 4, 5, 10, 9);

		System.out.println("Given List:" + num);

		System.out.println("========================");

		List<Integer> evenNumbers = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println(evenNumbers);

		System.out.println("=============================");

		List<Integer> oddNumbers = num.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());

		System.out.println(oddNumbers);

	}

}
