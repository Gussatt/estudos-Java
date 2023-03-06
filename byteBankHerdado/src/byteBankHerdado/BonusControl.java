package byteBankHerdado;

public class BonusControl {
	
	private static double bonusSum;
	
	public static void register (Employee employee) {
		double bonus = employee.getBonus();
		bonusSum+= bonus;
	}
	
	public static double getBonusSum() {
		return bonusSum;
	}
}
