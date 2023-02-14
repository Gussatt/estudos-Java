
public class factorialEx{
	public static void main(String[] args) {
		for(int n=1, total= 1; n<=10 ;  n++ , total*=n) {
			System.out.println("Fatorial de " + n + " = " + total);
		}
	}
}
