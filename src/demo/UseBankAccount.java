package demo;

public class UseBankAccount {

	public static void main(String[] args) {

		System.out.println(BankAccount.nameOfBank);
		System.out.println("Bank has " + BankAccount.countOfAccounts + " accounts");
		
		BankAccount peteAccount = new BankAccount(11111, "Pete's Current Account", "Pete", "Mill");
		BankAccount hamishAccount = new BankAccount(22222, "Hamish's Current Account", "Hamish", "Mill");

		System.out.println("Bank has " + BankAccount.countOfAccounts + " accounts");
		
		// don't do this
		System.out.println(peteAccount.nameOfBank);
		System.out.println(hamishAccount.nameOfBank);
		peteAccount.nameOfBank = "Bank of the World";
		System.out.println(hamishAccount.nameOfBank);

		peteAccount.deposit(100);
		if (peteAccount.withdraw(20)) {
			System.out.println(peteAccount.getBalance());
		} else {
			System.out.println("Insufficient Funds");
		}
		
		if (peteAccount.withdraw(50)) {
			System.out.println(peteAccount.getBalance());
		} else {
			System.out.println("Insufficient Funds");
		}
		
		if (peteAccount.withdraw(75)) {
			System.out.println(peteAccount.getBalance());
		} else {
			System.out.println("Insufficient Funds");
		}
		
		System.out.println("Account No. " +peteAccount.getAccountNumber());
		System.out.println("Pete's balance " + peteAccount.getBalance());

		hamishAccount.deposit(200);
		hamishAccount.withdraw(75);
		hamishAccount.withdraw(50);
		System.out.println("Account No. " + hamishAccount.getAccountNumber());
		System.out.println("Hamish's balance " + hamishAccount.getBalance());
		
		
		System.out.println(peteAccount);
		System.out.println(hamishAccount);

	}

}
