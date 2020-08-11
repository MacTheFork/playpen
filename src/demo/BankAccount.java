package demo;

public class BankAccount {

	// fields
	public static String nameOfBank = "Bank of ToyTown";
	public static int countOfAccounts = 0;

	private int accountNumber;
	private int balance;
	private String accountName;
	private String firstName;
	private String lastName;

	// constructor
	public BankAccount(int accountNumber, String accountName, String firstName, String lastName) {
		this.accountNumber = accountNumber;
		this.balance = 0;
		this.accountName = accountName;
		this.firstName = firstName;
		this.lastName = lastName;
		countOfAccounts++;
	}

	// methods
	public String getAccountName() {
		return accountName;
	}

//	public String toString() {
//		return this.accountName;
//	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBalance() {
		return this.balance;
	}

	public boolean deposit(int amount) {
		balance += amount;
		return true;
	}

	public boolean withdraw(int amount) {
		if (amount < balance) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

//
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}

}
