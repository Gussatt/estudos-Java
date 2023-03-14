package byteBankHerdado;

public class InnerSystemTest {
	public static void main(String[] args) {
		
		Manager m = new Manager();
		m.setPassword(2222);
		
		Admin a = new Admin();
		a.setPassword(2323);
		
		InnerSystem is = new InnerSystem(2323);
		is.authenticate(a);
		is.authenticate(m);
	}
}
