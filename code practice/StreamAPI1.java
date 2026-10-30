package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI1 {
	
	public static void main (String args[]) {
		
		//input : int[] a ={10,15,8,49,25,98,32};
		//Output : [10,15] find elements started with 1 using java8 streams
		
		List<Integer> num = Arrays.asList(10,15,8,49,25,98,32);
		
		System.out.println("Even numbers:");
		num.stream().filter(a -> a % 2 == 0).forEach(System.out::println);
		
		System.out.println("Odd numbers: ");
		num.stream().filter(b -> b%2 != 0).forEach(System.out::println);
		
		System.out.println("elements started with 1");
		List<Integer> result = num.stream().filter(c -> String.valueOf(c).startsWith("1"))
		.collect(Collectors.toList());
		
		System.out.println(result);
	}

}
