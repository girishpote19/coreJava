package Java8Features;

public class ReverseString {

	public static void main(String args[]) {
		
		String name = "girish";
		
		String revString = new StringBuilder(name).reverse().toString();
		
		System.out.println(revString);

	}

}
