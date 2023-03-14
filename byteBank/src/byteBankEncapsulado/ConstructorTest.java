package byteBankEncapsulado;

public class ConstructorTest {
	
	public static void main(String[] args) {
		
		Account gusAccount = new Account(333, 222);
		System.out.println(gusAccount.getAgency());
		
		Client gustavo = new Client("gustavo", "111.111.111-11", "peão");
		gusAccount.setHolder(gustavo);
		System.out.println(gustavo.getName());
		
		Account gusAccount1 = new Account(342, 212);
		Account gusAccount2 = new Account(323, 232);
		
		System.out.println(Account.getTotal());
		
		Account gusAccount3 = new Account(333, 223);
		
		System.out.println(gusAccount.getBalance());;
		
		

		
		
	}
	
}
