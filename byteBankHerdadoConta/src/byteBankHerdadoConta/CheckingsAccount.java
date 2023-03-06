package byteBankHerdadoConta;

public class CheckingsAccount extends Account {
	
	public CheckingsAccount(int number, int agency) {
		super(number, agency);
	}
	
	@Override
	public boolean withdraw(double value) {
		double toBeWithdrawn = value + 0.2;
		return super.withdraw(toBeWithdrawn);
	}
}
