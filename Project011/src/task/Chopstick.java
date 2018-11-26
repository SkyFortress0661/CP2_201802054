package task;

public class Chopstick {
	public int num;
	ChopstickNumber cn;
	boolean checkPick;
	public Chopstick(int number, ChopstickNumber cN) {
		num = number;
		cn = cN;
		checkPick=false;
	}
	public int getNum() {
		return num;
	}
	synchronized void pick(){
		while (checkPick) {
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		checkPick = true;
		cn.decrease();
	}

	synchronized void put() {
		if(checkPick) {
			cn.increase();
			this.notifyAll();
			checkPick = false;
		}
	}
}