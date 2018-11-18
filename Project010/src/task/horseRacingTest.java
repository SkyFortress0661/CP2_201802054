package task;

import java.util.*;

class Result {
	public int rank;
	public int horsy;

	Result() {
		rank = 0;
		horsy = 0;
	}
}

class MyThread extends Thread {
	Random rand;
	Result re;
	int distance;
	int horseNum;
	static int grade = 0;

	MyThread(int num, Result res) {
		rand = new Random();
		this.re = res;
		distance = 0;
		horseNum = num;
	}

	public void run() {
		do {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			int i = rand.nextInt(11);
			int sleep = rand.nextInt(10);
			if (sleep == 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			distance += i;
			System.out.println(horseNum + "번 말은 지금 " + distance + "m에 있습니다.");

		} while (distance < 100);
		grade++;
		re.rank = grade;
		re.horsy = horseNum;
		System.out.println(horseNum + "번 말이 " + grade + "등으로 들어왔습니다.");
	}
}

public class horseRacingTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Result[] re = new Result[5];
		for (int i = 0; i < 5; i++) {
			re[i] = new Result();
		}
		boolean check = true;
		int RacingNum = 0;
		System.out.println("다섯 마리의 말들이 100m 경주를 시작합니다.");
		while (check) {
			System.out.print("말 번호를 고르세요.(1~5) : ");
			RacingNum = scan.nextInt();
			if (RacingNum >= 1 && RacingNum <= 5) {
				check = false;
			} else
				System.out.println("다시 고르시오");
		}
		System.out.println(RacingNum + "번 말을 골랐습니다.");
		System.out.println("###경주를 시작합니다.###");
		System.out.println();
		new MyThread(1, re[0]).start();
		new MyThread(2, re[1]).start();
		new MyThread(3, re[2]).start();
		new MyThread(4, re[3]).start();
		new MyThread(5, re[4]).start();
		int[][] result = new int[5][2];
		while (true) {
			if (Thread.activeCount() == 1) {
				for (int i = 0; i < 5; i++) {
					result[i][0] = re[i].rank;
					result[i][1] = re[i].horsy;
				}
				for (int i = 0; i < 4; i++) {
					for (int j = i + 1; j < 5; j++) {
						if (result[i][0] > result[j][0]) {
							int tmp1 = result[i][0];
							result[i][0] = result[j][0];
							result[j][0] = tmp1;
							int tmp2 = result[i][1];
							result[i][1] = result[j][1];
							result[j][1] = tmp2;
						}
					}
				}
				System.out.println();
				System.out.println("### 경기 결과 ###");
				for (int i = 0; i < 5; i++) {
					System.out.print("[" + (result[i][0]) + "등] " + result[i][1] + "번 말");
					if (result[i][1] == RacingNum) {
						System.out.print("    <--- 당신이 고른 말");
					}
					System.out.println();
				}
				break;
			}
		}
	}
}