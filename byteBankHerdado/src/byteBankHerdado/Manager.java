package byteBankHerdado;

public class Manager extends Employee {

	private int password;
	
	public double getBonus() {
		return super.getBonus() + super.getSalary();
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	public boolean authenticatePassword(int password) {
		if(this.password == password) {
			return true;
		} else {
			return false;
		}
	}
	
}
