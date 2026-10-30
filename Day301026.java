package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Day301026 {

	public static void main(String args[]) {

		List<Integer> num = Arrays.asList(22, 11, 1, 2, 12, 9, 8);

		List<Integer> data = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

		System.out.println("Even no:" + data);

		List<Integer> squareOfEvenNo = data.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println("Even no squares:" + squareOfEvenNo);

		List<String> sub = Arrays.asList("java", "php", "c", "html", "java", "py", "php");

		List<String> removedDupSub = sub.stream().distinct().collect(Collectors.toList());

		System.out.println("Removed duplicates:" + removedDupSub);

		List<String> dataInUpperCase = sub.stream().map(a -> a.toUpperCase()).collect(Collectors.toList());

		System.out.println("Sub in uppercase:" + dataInUpperCase);

	}

}
