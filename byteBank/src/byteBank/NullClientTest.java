package byteBank;

public class NullClientTest {
	public static void main(String[] args) {
		
		Account marcelaAccount = new Account();
		System.out.println(marcelaAccount);
		
		marcelaAccount.holder = new Client();
		
		marcelaAccount.holder.name = "Marcela Vieira";
		System.out.println(marcelaAccount.holder.name);
	}
}
