package practical9;

public class SavingsAccount extends Account{
	
	public SavingsAccount() {}
	
	public SavingsAccount(int id, double balance) {
		super(id,balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if (getBalance()<amount)
			System.out.printf("Your current balance is $%.2f You have attempted to withdraw $%.2f \n"+
					"This transaction cannot be completed. Your balance is unchanged.\n",getBalance(),amount);
		else
			super.withdraw(amount);
	}
}
