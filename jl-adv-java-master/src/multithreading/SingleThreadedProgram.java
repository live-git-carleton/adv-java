package multithreading;

public class SingleThreadedProgram {
	// The Process has a single thread (Main Thread)
	public static void main(String[] args) {
		System.out.println("The main thread starts here!");
		System.out.println("Is it a sunny day today!");
		test();
		System.out.println("The main thread ends here!");
	}

	// The main thread ends, (dies) and the process dies.
//	public static void main() {
//		System.out.println("Is it a rainy day today!");
//	}
	public static void test() {
		System.out.println("Test Begin!");
		System.out.println("Test!");
		System.out.println("Test End!");
	}
}
