package java8features;

@FunctionalInterface
interface Addable {
	int add(int a, int b);

	// int subtract(int a, int b);
//	default void test1() {
//		System.out.println("Hi, sound cool, method with body!");
//	}
//
//	default void test2() {
//		System.out.println("Hi, sound cool, method with body, test2!");
//	}
//
//	static void test5() {
//		System.out.println("static method Hi, sound cool, method with body!");
//	}
}

public class CustomLambda {
	public static void main(String[] args) {
		Addable addable = (int a, int b) -> (a + b);
		// Addable is the type of lambda expression (functional interface)
		// (int a, int b) = parameters to the abstract function
		// (a + b) is the body.
		System.out.println(addable.add(100, 200));
	}
}
