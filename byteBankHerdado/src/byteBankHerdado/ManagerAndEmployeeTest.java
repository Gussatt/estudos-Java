package byteBankHerdado;

public class ManagerAndEmployeeTest {
	
	public static void main(String[] args) {
		Employee nico = new Employee();
		Manager carlos = new Manager();
		
		nico.setSalary(2000.00);
		nico.setName("Nico Steppat");
		nico.setCpf("888.888.888-28");
		
		carlos.setSalary(4000.00);
		carlos.setName("Cazalbé");
		carlos.setCpf("777.777.777-28");
		carlos.setPassword(89898);
		
		carlos.authenticatePassword(89898);
		
		System.out.println(carlos.getName());
		System.out.println(carlos.getCpf());
		System.out.println(carlos.getSalary());
		System.out.println(carlos.authenticatePassword(89898));
		System.out.println(carlos.getBonus());
	}
	
	
}
