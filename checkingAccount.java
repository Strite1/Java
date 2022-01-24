public class checkingAccount extends BankAccount {
	private double interestRate=3;//3% interest
	private final int fee = 30;//fee

	public checkingAccount() {
			super();
	}

	public void processWithdraw(double amount) {
			withdraw(amount);//withdrawing amount
			if(getBalance()<0) {
					withdraw(fee);
					System.out.println("Fee has been accessed");
			}
	}

	public void displayAccount() {
			System.out.println(accountSummary()+", Interest Rate: "+interestRate+"%");
	}
}
