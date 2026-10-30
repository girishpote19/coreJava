package Java8Features;

interface Addition {
	public int add(int a, int b);
}
public class LambdaExpression {

	public static void main(String[] args) {
		
		Addition a = (x,y)-> (x+y);
		int addition = a.add(1, 2);
		
		System.out.println(addition);

	}

}
