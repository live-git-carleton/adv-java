//package multithreading;
//
//public class ThreadPriorityDemo {
//	public static void main(String[] args) {
//		TestThread1 testThread = new TestThread1();
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("The Main Thread");
//		System.out.println(Thread.currentThread().getName());
//
//		System.out.println(testThread.getName());
//		testThread.setName("Child Thread 1");
//		System.out.println(testThread.getName());
//
//	}
//}
//
//class TestThread1 extends Thread {
//	public void run() {
//		System.out.println(Thread.currentThread().getName());
////		for (int i = 0; i < 100; i++) {
////			System.out.println("Child " + i);
////		}
//	}
//}