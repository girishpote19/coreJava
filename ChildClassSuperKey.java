package coreJava;

public class ChildClassSuperKey extends LearningSuperKeyword {

	int val = 200;

	void show() {
		System.out.println(this.val); // child value ->200

		System.out.println(super.val); // parent value ->100
	}
	
	//1. calling superclass variable-----------------------------------------------
	
	@Override
	void message() {
		super.message();
		System.out.println("Message from Child class");
	}
	//2. calling superclass method---------------------------------------------------
	
	public ChildClassSuperKey() {
		super();
		System.out.println("childClass Constructor");
	}
	//3. calling superclass constructor------------------------------------------------------
	
	
	public static void main(String[] args) {
		ChildClassSuperKey obj = new ChildClassSuperKey();
		obj.show();
		obj.message();
	}
}
