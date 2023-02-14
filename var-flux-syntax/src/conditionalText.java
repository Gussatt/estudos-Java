
public class conditionalText {
	public static void main(String[] args) {
		System.out.println("Testing conditionals.");
		int age = 18;
		int quantityOfPersons = 3;
		
		
		if (age >= 18) {
			System.out.println("You're older than 18.");
			System.out.println("Welcome");
		} else {
			if (quantityOfPersons >= 2) {
				System.out.println("You're under 18 years old, "
						+ "but you have company");
			}
		
				
			else {
				System.out.println("You're not allowed.");
			}
		}
		
		
	}
}
