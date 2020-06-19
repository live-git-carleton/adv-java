package multithreading;

public class StopMethod {
	public static void main(String[] args) {
		System.out.println("executed");
		Thread.currentThread().stop();
		System.out.println("not executed");
	}
}
