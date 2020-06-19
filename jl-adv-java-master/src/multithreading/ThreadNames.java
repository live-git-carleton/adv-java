package multithreading;

public class ThreadNames {
	public static void main(String[] args) {
		TestThisThread testThread0 = new TestThisThread();
		TestThisThread testThread1 = new TestThisThread();
		testThread0.setPriority(Thread.MAX_PRIORITY);
		testThread1.setPriority(Thread.MIN_PRIORITY);
		testThread0.start();
		testThread1.start();

//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);

	}
}

class TestThisThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		if (Thread.currentThread().getName().equals("Thread-0")) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
	}
}