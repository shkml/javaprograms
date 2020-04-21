package practical9;

public class CheckingAccount extends Account {
	private double overdraftLimit;
		
	public CheckingAccount() {
		this(0,0);	
		
		/*
		 * Above statement could also be written as -> super(); overdraftLimit = 1000;
		 */
	}
	
	public CheckingAccount(int id, double balance) {
		super(id,balance);
		overdraftLimit = 1000;
	}
	
	//Setter for overdraft limit
	public void setOverdraftLimit(double limit) {
		this.overdraftLimit = limit;
	}
	
	//getter for overdraft limit
	public double getoverdraftLimit() {
		return this.overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if (getBalance()+this.overdraftLimit < amount){
			System.out.println("Your current balance is " +getBalance() +"\n"
					+ " Your overdraft limit is "+ this.overdraftLimit + "\n You"
							+ " have attempted to withdraw "+ amount+". \n "
									+ "This transaction cannot be completed. Your balance is unchanged.");
		}
		else
			super.withdraw(amount);
	}
	
	@Override
	public String toString() {
		return "overdraftLimit "+ overdraftLimit + super.toString();
	}
	
	@Override 
	public double getMonthlyInterest() {
		if (getBalance()<0)
			return 0;
		else
			return super.getMonthlyInterest();
	}
}
