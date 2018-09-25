package task;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("김도현", 300000, 0.1);
		int money, month;
		
		System.out.println("계좌 주인은 "+account.getname()+"이고, 잔액은 "+account.getBalance()+"원입니다.\n");
		
		money=100000;
		account.deposit(money);
		System.out.println("계좌에 "+money+"를 입금하여, 잔액은 "+account.getBalance()+"원이 되었습니다.");
		
		money=100000;
		account.withdraw(money);
		System.out.println("계좌에 "+money+"를 출금하여, 잔액은 "+account.getBalance()+"원이 되었습니다.");
		
		money=10000;
		month=12;
		System.out.println("매월 "+money+"원씩 "+month+"개월 적금하면, 잔액이 "+account.installmentSavingPredict(money, month)+"원이 될 것입니다.");
		
		money=2000000;
		month=24;
		System.out.println(money+"원을 "+month+"개월 정기 예금하면, 잔액이 "+account.fixedDepositPredict(money, month)+"원이 될 것입니다.");

		long soManyMoney=20000000000L;
		account.deposit(soManyMoney);
		System.out.println("계좌에 "+soManyMoney+"원을 입금하여, 잔액은 "+account.getBalance()+"원이 되었습니다.");
	}
}
