package task;

public class ChopstickNumber{
	private int num;

	public ChopstickNumber(int num) {
		this.num = num;
	}
	public synchronized void increase() {num++;}
	public synchronized void decrease() {num--;}
	public int getNum() {
		return num;
	}
}