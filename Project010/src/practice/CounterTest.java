package practice;
class Counter{
	private int value = 0;
	public synchronized void increment() {value++;}
	public synchronized void decrement() {value--;}
	public void printCounter() {System.out.println(value);}
}
class MycounterThread extends Thread{
	Counter sharedCounter;
	
	public MycounterThread(Counter counter) {
		this.sharedCounter=counter;
	}
	public void run() {
		for(int i = 0;i<200;i++) {
			sharedCounter.increment();
			sharedCounter.decrement();
			if(i%40==0) sharedCounter.printCounter();
			try {
				sleep((int)(Math.random()*2));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class CounterTest {

	public static void main(String[] args) {
		Counter c = new Counter();
		new MycounterThread(c).start();
		new MycounterThread(c).start();
		new MycounterThread(c).start();
		new MycounterThread(c).start();
	}

}
