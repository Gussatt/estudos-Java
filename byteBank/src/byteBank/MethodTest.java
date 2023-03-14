package byteBank;

public class MethodTest {
	public static void main(String[] args) {
		Account accountGustavo = new Account();
		
		accountGustavo.balance = 300;
		accountGustavo.deposit(300);
		
		System.out.println(accountGustavo.balance);
		
		boolean didItWithdraw = accountGustavo.withdraw(300);
		System.out.println(accountGustavo.balance);
		
		if (didItWithdraw) {
			System.out.println("Your withdrawal was successful!");
		} else {
			System.out.println("Sorry, not enough balance");
		}
		
		Account accountRaynara = new Account();
		accountRaynara.balance = 1000;
		
		if(accountRaynara.transfer(300, accountGustavo)) {
			System.out.println("Successful transfer");
		} else {
			System.out.println("Sorry, not enough money");
		}
		
		
		
	}
}
