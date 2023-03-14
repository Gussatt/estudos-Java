package byteBankHerdado;

public class ReferencesTest {
	public static void main(String[] args) {
		
		//Testing polymorphism with child classes.
		
		VideoEditor Anderson = new VideoEditor();
		Anderson.setSalary(2000.00);
		
		Manager Gustavo = new Manager();
		Gustavo.setSalary(2000.00);
		
		Manager Guilherme = new Manager();
		Guilherme.setSalary(2000.00);
		
		BonusControl.register(Anderson);
		System.out.println(BonusControl.getBonusSum());
		BonusControl.register(Gustavo);
		System.out.println(BonusControl.getBonusSum());
		BonusControl.register(Guilherme);
		System.out.println(BonusControl.getBonusSum());
		
	}
}
