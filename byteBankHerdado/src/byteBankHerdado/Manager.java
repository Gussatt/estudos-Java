package byteBankHerdado;

public class Manager extends AuthenticatedEmployee {

	public double getBonus() {
		return super.getSalary();
	}
}
