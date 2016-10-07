package main;

public class Test {

	public static void main(String[] args) {
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);

		try {
			System.out.println("Now withdrawing $2500");
			myAccount.withdraw(2500);
			System.out.println("Now withdrawing $25000");
			myAccount.withdraw(25000);

		} catch (InsufficientFundsException e) {
			System.out.println("Invalid Transaction: "
					+ "insufficient funds " + e.getAmount() + " needed");
			e.printStackTrace();
		}

		System.out.println("Now depositing $3000");
		myAccount.deposit(3000);

		System.out.println(myAccount.toString());
	}

}