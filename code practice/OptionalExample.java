package Java8Features;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String demo = null;

		Optional<String> value = Optional.ofNullable(demo);

		if (value.isPresent()) {
			System.out.println("Value is present " + value);
		} else {
			System.out.println("demo Value is NULL"+ value);
		}

	}

}
