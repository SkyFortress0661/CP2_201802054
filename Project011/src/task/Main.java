package task;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int number = 5;
		ChopstickNumber chopstickNumber = new ChopstickNumber(number);
		Chopstick[] sticks = new Chopstick[number];
		for(int i = 0;i<number;i++) {
			sticks[i] = new Chopstick(i, chopstickNumber);
		}
		Philosopher[] philosphers = new Philosopher[number];
		for(int i = 0;i<number;i++) {
			philosphers[i] = new Philosopher(i, sticks[i], sticks[(i+1)%number]);
		}
		for(int i = 0;i<number;i++) {
			(new Thread(philosphers[i])).start();
		}
	}
}