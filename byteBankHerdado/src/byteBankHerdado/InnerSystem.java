package byteBankHerdado;

public class InnerSystem {
	
	private int password;
	
	public InnerSystem(int password) {
		this.password = password;
	}
	
	public void authenticate(AuthenticatedEmployee ae) {
		boolean authenticated = ae.authenticatePassword(this.password);
		if(authenticated) {
			System.out.println("Correct password, we're redirecting you");
		} else {
			System.out.println("Incorrect password, try again");
		}
	}
}
