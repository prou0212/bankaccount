package BankAccountInformation;

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
	 * @param accountHolder The a
	 */
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * 
	 * @param accountAmount
	 * @return
	 */
}