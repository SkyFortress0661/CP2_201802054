package practice;

class MyThread extends Thread{ 
	public void run() {
		for(int i = 10;i>=0;i--) {
			System.out.print(i+" ");
		}
	}
}
public class newThread {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.start();
		t2.start();
	}

}
