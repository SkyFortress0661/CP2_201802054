package practice;

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}
}

public class MyRunnableTest {
	public static void main(String[] args) {
		Thread t3 = new Thread(new MyRunnable());
		Thread t4 = new Thread(new MyRunnable());
		t3.start();
		t4.start();
	}
}
