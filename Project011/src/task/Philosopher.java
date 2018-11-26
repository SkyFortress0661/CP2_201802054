package task;

import java.util.*;

public class Philosopher implements Runnable {
	int num;
	Chopstick right;
	Chopstick left;
	Random r;
	boolean isStop;

	public Philosopher(int number, Chopstick cs1, Chopstick cs2) {
		num = number;
		left = cs1;
		right = cs2;
		r = new Random();
		this.isStop = false;
	}

	public void leftHold() {
		left.pick();
		System.out.println("[" + num + "] 철학자가 [" + left.getNum() + "] 포크를 들었습니다.");
		if (left.cn.getNum() == 0) {
			left.cn.increase();
			leftPut();
		}
	}

	public synchronized void rightHold() {
		right.pick();
		System.out.println("[" + num + "] 철학자가 [" + right.getNum() + "] 포크를 들었습니다.");
	}

	public synchronized void leftPut() {
		System.out.println("[" + num + "] 철학자가 [" + left.getNum() + "] 포크를 놓았습니다.");
		left.put();
	}

	public synchronized void rightPut() {
		right.put();
		System.out.println("[" + num + "] 철학자가 [" + right.getNum() + "] 포크를 놓았습니다.");
	}

	public void eat() {
		leftHold();
		rightHold();
		if(left.checkPick==true && right.checkPick==true)
			System.out.println("[" + num + "] 철학자 먹는중...");
		else {
			leftHold();
			System.out.println("[" + num + "] 철학자 먹는중...");
		}
		leftPut();
		rightPut();
	}

	public void think() throws InterruptedException {
		System.out.println("[" + num + "] 철학자 생각중...");
		Thread.sleep(r.nextInt(101));
		isStop = true;
	}

	public void run() {
		while (!isStop) {
			eat();
			try {
				think();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
