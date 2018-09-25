package task;

public interface Account {
	void deposit(long money);
	void withdraw(int money);
	long getBalance();
	String getname();
	int installmentSavingPredict(int money, int month);
	int fixedDepositPredict(int money, int month);
}
