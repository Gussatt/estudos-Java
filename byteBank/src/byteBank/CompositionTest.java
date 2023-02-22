package byteBank;

public class CompositionTest {
	public static void main(String[] args) {
		Client gustavo = new Client();
		gustavo.name = "Gustavo Almeida";
		gustavo.profession = "Peon";
		gustavo.cpf = "333.333.333.33";
			
		
		System.out.println(gustavo);
		
//		System.out.println(gustavo.profession);
//		System.out.println(gustavo.cpf);
//		System.out.println(gustavo.name);

		Account gustavoAccount = new Account();
		gustavoAccount.holder = gustavo;
		System.out.println(gustavoAccount.holder);
		
		
	}
}
