package com.bank.app;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Bank[] b = new Bank[10];
		int noOfAcc = 0;
		int choice;
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		int accno;

		do {
			System.out.println("Enter 1 to create account");
			System.out.println("Enter 2 to deposit");
			System.out.println("Enter 3 to withdraw");
			System.out.println("Enter 4 to check balance");
			System.out.println("Enter 5 to check last transaction");
			System.out.println("Enter 6 to find simple interest");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				b[noOfAcc] = new Bank();
				b[noOfAcc].getValue();
				System.out.println("Account created ");
				System.out.println("Account number is" + b[noOfAcc].getAccno());
				noOfAcc++;
				break;
			case 2:
				System.out.println("Enter accont number");
				accno = sc.nextInt();
				for (int i = 0; i < noOfAcc; i++) {
					if (accno == b[i].getAccno()) {
						b[i].deposit();
						temp = 1;
					}
				}
				if (temp == 0)
					System.out.println("invalid account number");
				break;
			case 3:
				System.out.println("Enter accont number");
				accno = sc.nextInt();
				for (int i = 0; i < noOfAcc; i++) {
					if (accno == b[i].getAccno()) {
						b[i].withdraw();
						temp = 1;
					}
				}
				if (temp == 0)
					System.out.println("invalid account number");
				break;
			case 4:
				System.out.println("Enter accont number");
				accno = sc.nextInt();
				for (int i = 0; i < noOfAcc; i++) {
					if (accno == b[i].getAccno()) {
						System.out.println("Balance " + b[i].checkBalance());
						temp = 1;
					}
				}
				if (temp == 0)
					System.out.println("invalid account number");
				break;
			case 5:
				System.out.println("Enter accont number");
				accno = sc.nextInt();
				for (int i = 0; i < noOfAcc; i++) {
					if (accno == b[i].getAccno()) {
						System.out.println("Last transaction is of " + b[i].lastTransaction());
						temp = 1;
					}
				}
				if (temp == 0)
					System.out.println("invalid account number");
				break;
				
			case 6:
				System.out.println("Enter accont number");
				accno = sc.nextInt();
				for (int i = 0; i < noOfAcc; i++) {
					if (accno == b[i].getAccno()) {
						b[i].simpleInterest();
						temp = 1;
					}
				}
				if (temp == 0)
					System.out.println("invalid account number");
				break;
				
			case 7:
				System.out.println("Enter accont number");
				accno = sc.nextInt();
				for (int i = 0; i < noOfAcc; i++) {
					if (accno == b[i].getAccno()) {
						b[i].compoundInterest();
						temp = 1;
					}
				}
				if (temp == 0)
					System.out.println("invalid account number");
				break;
				
			}
			
			
		} while (choice < 8);

	}

}
