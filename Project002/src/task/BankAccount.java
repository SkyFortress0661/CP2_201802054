package task;

public class BankAccount implements Account{
	public String name;
	public long balance;
	double rate;
	
	public BankAccount(String a, long b, double c) {
		this.name=a;
		this.balance=b;
		this.rate=c;
	}
	
	public void deposit(long money) {
		balance+=money;
	}
	
	public void withdraw(int money) {
		if(money<balance) {
			balance-=money;
		}
		else {
			money=0;
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public long getBalance() {
		return balance;
	}
	
	public String getname() {
		return name;
	}
	
	public int installmentSavingPredict(int money, int month) {
		return (int) (balance+money*rate/12*(month*(month+1)/2)+money*month);
	}
	
	public int fixedDepositPredict(int money, int month) {
		double rel=balance+money+(balance+money)*(Math.pow((1+(rate/12)), month)-1);
		return (int) rel;
	}
}