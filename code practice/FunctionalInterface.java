package Java8Features;

interface dog {
	void eat();
}

class Run implements dog {

	@Override
	public void eat() {
		System.out.println("eating");

	}

}

public class FunctionalInterface {

	public static void main(String[] args) {

		Run r = new Run();
		r.eat();
	}

}
