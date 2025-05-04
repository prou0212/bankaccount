import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		
		boolean check = true;
		Scanner keyboard = new Scanner(System.in);
		
		BankAccountInfo bank = new BankAccountInfo(69, "Jesse Proulx", 1000.00);
				
		while(check) {
		System.out.println("Welcome to the bank of Jesse.");
		System.out.println("Account Number: " + bank.getAccountNumber());
		System.out.println("Account Holder: " + bank.getAccountHolder());
		System.out.println("Account Balance: " + bank.getAccountBalance());
		System.out.println("Please select from one of the following option\n"
				+ "1. Deposit\n2. Withdraw\n3. Total Account Balance\n4. Intrest rate\n"
				+ "5. Exit your bank account\nPlease select an option: ");
		int number = keyboard.nextInt();
		keyboard.nextLine();
		
		switch(number) {
		case 1:
			System.out.println("\tEnter deposit amount:");
			double deposit = keyboard.nextDouble();
			bank.depositAmount(deposit);
			break;
		case 2:
			System.out.println("\tEnter withdraw amount:");
			double withdraw = keyboard.nextDouble();
			bank.withdrawAccount(withdraw);
			break;
		case 3:
			System.out.println("\tTotal account balance $" + bank.getAccountBalance());
			break;
		case 4:
			System.out.println("\tYour Intrest owing is " + bank.getAccountBalance() + BankAccountInfo.ANNUAL_INTREST);
			break;
		case 5:
			System.out.println("\tThank you for banking with the bank of Jesse");
//			check = false;
			return;
		default:
			System.out.println("\tPlease enter from one of the following options");
			System.out.println("Number has not been added yet");
			break;
		}
		}
		keyboard.close();
	}
}
