package byteBank;

public class CreateAccount {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 2000;
		System.out.println(firstAccount.balance);
		
		firstAccount.balance += 200;
		System.out.println(firstAccount.balance);
		
		Account secondAccount = new Account();
		secondAccount.balance = 50;
		System.out.println(secondAccount.balance);
		
		System.out.println(secondAccount.balance + firstAccount.balance);
		
		System.out.println("A primeira conta possui: " + firstAccount.balance + " Reais");
		
		System.out.println("A segunda conta possui: " + secondAccount.balance + " Reais");
	}
}
