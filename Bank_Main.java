package BankAccountInformation;

import java.util.Scanner;

public class Bank_Main {

	public static void main(String[] args) {
		
		boolean check = true;
		Scanner keyboard = new Scanner(System.in);
		
		BankAccountInfo bank = new BankAccountInfo(69, "Jesse Proulx", 1000.00);
		
		System.out.println("Welcome to the bank of Jesse.");
		System.out.println("Account Number: " + bank.getAccountNumber());
		System.out.println("Account Holder: " + bank.getAccountHolder());
		System.out.println("Account Balance: " + bank.getAccountBalance());
		System.out.println("Please select from one of the following option\n"
				+ "1. Deposit\n2. Withdraw\n3. Total Account Balance\n4. Intrest rate\n"
				+ "5. Exit your bank account\nPlease select an option: ");
	}
}