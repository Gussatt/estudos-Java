package byteBankHerdadoConta;

public class AccountsTest {
	public static void main(String[] args) {
		
		CheckingsAccount ca = new CheckingsAccount(232, 323);
		ca.deposit(2000.0);
		
		SavingsAccount sa = new SavingsAccount(323, 232);
		sa.deposit(1000.0);
		
		ca.transfer(1000, sa);
		
		System.out.println(ca.getBalance());
		System.out.println(sa.getBalance());
	}
}
