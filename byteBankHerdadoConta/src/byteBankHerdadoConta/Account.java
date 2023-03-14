package byteBankHerdadoConta;
public abstract class Account {
	private double balance;
	private int agency;
	private int number;
	private Client holder;
	private static int total;

	public Account(int agency, int number){
		Account.total++;
		
		this.agency = agency;
		this.number = number;
	}
	
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
	
	public int getAgency() {
		return agency;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Client getHolder() {
		return holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setHolder(Client holder) {
		this.holder = holder;
	}
	
	public static int getTotal() {
		return total;
	}
	
}
