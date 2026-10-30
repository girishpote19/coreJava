package coreJava;

public class LearningStringPool {

	public static void main(String[] args) {
		
		String s1 = "girish";
		String s2 = "girish"; // refer same string constant pool refrence obj
		
		System.out.println(s1 == s2);
		
		String s3 = new String("girish"); //create seperate obj in heap memory
		
		System.out.println(s1 == s3);

	}

}
