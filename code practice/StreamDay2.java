package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDay2 {
	
	public static void main (String args[]) {
		
			//input : int[] a ={10,15,8,49,25,98,32};
					//Output : [10,15] find elements started with 1 using java8 streams
		
		List<Integer> num = Arrays.asList(10,15,8,49,25,98,32);
		
		List<Integer> result = num.stream().filter(a -> String.valueOf(a).startsWith("1")).collect(Collectors.toList());
		System.out.println(result);
	}

}
