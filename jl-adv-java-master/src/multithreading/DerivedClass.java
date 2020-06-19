package multithreading;

abstract class AbstractBase {
	public AbstractBase() {
		System.out.println("This is abstract class cons!");
	}

	public void test() {
		System.out.println("Test");
	}
}

public class DerivedClass extends AbstractBase {
	public static void main(String[] args) {
		DerivedClass derivedClass = new DerivedClass();
		// AbstractBase abstractBase = new AbstractBase();
	}

	DerivedClass() {
		System.out.println("This is derived cons!");
	}
}