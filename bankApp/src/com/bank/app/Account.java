package com.bank.app;

public interface Account {

	void deposit();

	void withdraw();

	int checkBalance();

	int getAccno();

	String lastTransaction();
	
	void simpleInterest();
	
	void compoundInterest();
	

}
