package byteBank;

public class Account {
	double balance;
	int agency;
	int number;
	Client holder;

	public void deposit(double value) {
		this.balance += value;
	}
	
	public boolean withdraw(double value) {
		if(this.balance >= value) {
			this.balance -= value;
			return true;
		} 
		return false;
	}
	
	public boolean transfer(double value, Account target) {
		if(withdraw(value)) {
			target.deposit(value);
			return true;
		}
		return false;
	}
}
