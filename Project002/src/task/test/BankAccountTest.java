package task.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import task.BankAccount;

class BankAccountTest {
	public BankAccount ba;

	@Test
	void testDeposit() {
		ba = new BankAccount("김도현", 300000, 0.1);
		ba.deposit(100000);
		assertTrue(ba.balance==400000);
	}

	@Test
	void testWithdraw() {
		ba = new BankAccount("김도현", 300000, 0.1);
		ba.withdraw(100000);
		assertTrue(ba.balance==200000);
	}

	@Test
	void testGetBalance() {
		ba = new BankAccount("김도현", 300000, 0.1);
		assertTrue(ba.balance==300000);
	}

	@Test
	void testGetname() {
		ba = new BankAccount("김도현", 300000, 0.1);
		assertTrue(ba.name.equals("김도현"));
	}

	@Test
	void testInstallmentSavingPredict() {
		ba = new BankAccount("김도현", 300000, 0.1);
		assertTrue(ba.installmentSavingPredict(20000,18)==688500);
	}

	@Test
	void testFixedDepositPredict() {
		ba = new BankAccount("김도현", 300000, 0.1);
		assertTrue(ba.fixedDepositPredict(2000000,18)==2670558);
	}
	
	@Test
	void testManyMoneyWithdraw() {
		ba = new BankAccount("김도현", 300000, 0.1);
		ba.withdraw(600000);
		assertTrue(ba.balance==300000);
	}
	
	@Test
	void testMultiCheck() {
		ba = new BankAccount("김도현", 300000, 0.1);
		ba.deposit(500000);
		ba.withdraw(1100000);
		assertTrue(ba.balance==800000);
	}
}
