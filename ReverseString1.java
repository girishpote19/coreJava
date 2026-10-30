package Java8Features;

public class ReverseString1 {

	public static void main(String args[]) {

		String name = "girish";

		String result = new StringBuilder(name).reverse().toString();
		
		System.out.println(result);
	}

}
