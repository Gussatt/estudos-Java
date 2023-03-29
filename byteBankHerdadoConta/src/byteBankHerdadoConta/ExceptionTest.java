package byteBankHerdadoConta;

public class ExceptionTest {

	public static void main(String[] args) {
		Account gus = new CheckingsAccount(333,333);
		gus.deposit(300.00);
		
		gus.withdraw(300.00);
		
		System.out.println(gus.getBalance());
		
		
	}

}
