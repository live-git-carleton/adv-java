package java8features;

public class RunnableLambda {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("Wow, this is awesome...")).start();
	}
}
//	public static void main(String[] args) {
//		// method 1
////		MyRunnable myRunnable = new MyRunnable();
////		Thread thread = new Thread(myRunnable);
////		thread.start();
//
//		// method 2
////		new Thread(new MyRunnable()).start();
//
//		// method 3
//		// anonymous class
//		Thread thread = new Thread(new Runnable() {
//			public void run() {
//				System.out.println("Child Thread!");
//			}
//		});
//		thread.start();
//
//		// method 4
//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println("Child Thread!");
//			}
//		}).start();
//	}

//class MyRunnable implements Runnable {
//	public void run() {
//		System.out.println("Child Thread!");
//	}
//}
