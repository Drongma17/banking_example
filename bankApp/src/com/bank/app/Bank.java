package com.bank.app;

public class Bank extends BankUtil implements Account {

	public void getValue() {
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your age");
		age = sc.nextInt();
		System.out.println("Enter your city");
		city = sc.next();
		System.out.println("Enter account type");
		System.out.println("Press s for savings account");
		System.out.println("Press c for savings account");
		accType = sc.next();
		System.out.println("Enter initial ammount");
		intitialAmt = sc.nextInt();
		switch (accType) {
		case "s":
			if (intitialAmt < 10000) {
				System.out.println("less");
				
			} else {
				accNo = 10000 + age;
				balance = intitialAmt;
			}
			break;
		case "c":
			if (intitialAmt < 20000) {
				System.out.println("less");
				
			} else {
				accNo = 20000 + age;
				balance = intitialAmt;
			}
			break;

		}
		
	}

	public void deposit() {
		System.out.println("Enter Anount to be deposited");
		amount = sc.nextInt();
		balance = balance + amount;
		System.out.println("Deposited Sucessfully");
		lastTransaction = "Deposit of" + amount;
	}

	public void withdraw() {
		System.out.println("Enter Anount to be deposited");
		amount = sc.nextInt();
		if (amount > balance) {
			System.out.println("insufficient balance");
		} else {
			int temp = balance - amount;
			if (temp < 5000) {
				System.out.println("minimum balance should be 5000");
			}

			else {
				balance = temp;
				System.out.println("Withdraw is sucess");
				lastTransaction = "Withdraw of" + amount;
			}
		}
	}

	public int checkBalance() {
		return balance;

	}

	public int getAccno() {
		return accNo;
	}

	public String lastTransaction() {
		return lastTransaction;
	}

	public void simpleInterest() {
		System.out.println("Enter interest");
		int r = sc.nextInt();
		System.out.println("Enter time");
		int t = sc.nextInt();

		double p = (balance * t * r) / 100;
		System.out.println("Principle amount is " + p);
	}

	public void compoundInterest() {
		System.out.println("Enter interest");
		int r = sc.nextInt();
		System.out.println("Enter time");
		int t = sc.nextInt();
		double c = balance * Math.pow((1 + r / 100), t);

	}

}
