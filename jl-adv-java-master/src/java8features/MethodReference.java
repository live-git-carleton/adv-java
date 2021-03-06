package java8features;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Anthony");
		namesList.add("Colette");

		// namesList.forEach((element) -> System.out.println(element));

		namesList.forEach(System.out::println);

		for (String nameString : namesList) {
			System.out.println(nameString);
		}
	}
}
