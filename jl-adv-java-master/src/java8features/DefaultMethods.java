package java8features;

public class DefaultMethods {
	public static void main(String[] args) {
		DefaultMethodsClass defaultMethodsClass = new DefaultMethodsClass();
		defaultMethodsClass.test();
		defaultMethodsClass.test1();
		defaultMethodsClass.test2();
		DefaultMethodsInterface.test5();

	}
}

@FunctionalInterface
interface DefaultMethodsInterface {
	public void test();

	default void test1() {
		System.out.println("Hi, sound cool, method with body!");
	}

	default void test2() {
		System.out.println("Hi, sound cool, method with body, test2!");
	}

	static void test5() {
		System.out.println("static method Hi, sound cool, method with body!");
	}
}

class DefaultMethodsClass implements DefaultMethodsInterface {

	@Override
	public void test() {
		System.out.println("test method!");

	}
}