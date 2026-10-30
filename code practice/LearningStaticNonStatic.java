package coreJava;

public class LearningStaticNonStatic {

	static class Car {

		static int carCount = 10;

		String model;
		int speed;

		Car(String model) {
			this.model = model;
			carCount++; //static variable
		}

		static void showCarCount() {
			System.out.println("Total cars: " + carCount);
		}

		void accelerate() {  //non-static
			speed += 10;
			System.out.println(model + "is running at " + speed);
		}
	}

	public static void main(String args[]) {

		Car.showCarCount(); // static method

		Car c1 = new Car("BMW");
		c1.accelerate(); // non-static method
	}
}
