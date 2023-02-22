package byteBank;

public class TestReferences {
	public static void main(String[] args) {
		Account firstAccount = new Account();
		firstAccount.balance = 300;
		
		Account otherAccount = firstAccount;
		if (firstAccount == otherAccount) {
			System.out.println("Same object, different references.");
		}
		
		Account secondAccount = new Account();
		secondAccount.balance = firstAccount.balance;
		
		if (firstAccount == secondAccount) {
			System.out.println("Same accounts");
		} else {
			System.out.println("Different objects");
		}
		
		System.out.println(firstAccount);
		System.out.println(secondAccount);
		System.out.println(otherAccount + " has the same reference as " + firstAccount);
	}
}
