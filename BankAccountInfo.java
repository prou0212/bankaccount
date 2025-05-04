/**
 * File name: BankAccountInfo.java
 * Last Updated: 12/02/24
 * Purpose: This class contains accessors and mutators for information hiding and 
 * functions for depositing funds from and withdrawing funds from the users bank account.
 */

/**
 * @author Jesse Proulx
 * @version 4.34.0
 * @since JDK 23.0.1
 */

public class BankAccountInfo {

	/**
	 * The account number of the account holder
	 */
	private int accountNumber;
	/**
	 * The name of the account holder
	 */
	private String accountHolder;
	/**
	 * The balance of the bank account of the account holder
	 */
	private double accountBalance;
	/**
	 * A static method that adds interest to the account balance
	 * at a rate of 3%
	 */
	public static final double ANNUAL_INTREST = 0.3;

	/**
	 * Constructor to assist in initializing a bank instance in the BankAccountTest class
	 * @param accountNumber The account number of the account holder
	 * @param accountHolder	The name of the account holder
	 * @param accountBalance The account balance of the account holder
	 */
	BankAccountInfo(int accountNumber, String accountHolder, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}

	/**
	 * Getter/Accessor of the Account holder's number
	 * @return The account holders account number
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Setter/Mutator of the account holder's number
	 * @param accountNumber	The account number of the account holder
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Getter/Accessor of the Account holder's
	 * @return The account holders name
	 */
	public String getAccountHolder() {
		return accountHolder;
	}

	/**
	 * Setter/Mutator of the account holder's name
	 * @param accountHolder The account holders name
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	/**
	 * Getter/Accessor of the Account Balance
	 * @return The account holders balance
	 */
	public double getAccountBalance() {
		return accountBalance;
	}

	/**
	 * Setter/Mutator of the Account Balance
	 * @param accountBalance the account balance of the user
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * Function to deposit money in the users account
	 * @param accountAmount the amount of money in the users account
	 * @return the amount in the users account
	 */
	public double depositAmount(double accountAmount) {
		if (accountAmount >= 0) {
			accountBalance += accountAmount;
			System.out.println("$" + accountAmount + " deposited sucessfully deposited to your account");
		} else {
			System.out.println("Please enter a positive dollar amount. Please try again.");
		}
		return accountAmount;
	}

	/**
	 * Function to withdraw money from the users account
	 * @param accountAmount the amount of money in the users account
	 * @return the amount in the users account
	 */
	public double withdrawAccount(double accountAmount) {
		if (accountAmount > 0 && accountAmount <= accountBalance) {
			accountBalance -= accountAmount;
			System.out.println("$" + accountAmount + " withdrawn from your account");
		} else {
			System.out.println("Insignificant funds. Please refer back to our menu.");
		}
		return accountAmount;
	}

}
