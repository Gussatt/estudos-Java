
public class scopeTest {
	public static void main(String[] args) {
		
		int age = 18;
		int quantityOfPersons = 1;
		boolean hasCompany; 
		
		if(quantityOfPersons >= 2)
			hasCompany = true;
			
			else
				hasCompany = false;
		
		
		
		if (age >= 18 && hasCompany) {
			System.out.println("Welcome");
		} else {
				System.out.println("You're not allowed.");
		}
			
	}
}
