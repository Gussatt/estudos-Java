
public class taxTest {
	public static void main(String[] args) {
		double salary = 4000.0;

		boolean isLowestValue = (salary >= 1900.0 && salary <= 2800.0); //De 1900.0 até 2800.0
		boolean isMedianValue = (salary >= 2800.01 && salary <= 3751.0); //De 2800.01 até 3751.0
		boolean isHighestValue = (salary >= 3751.01 && salary <= 4664.00); //De 3751.01 até 4664.00
        
		System.out.println(isLowestValue);
		System.out.println(isMedianValue);
		System.out.println(isHighestValue);
		
		if (isLowestValue) {
			System.out.println("A sua aliquota é de 7,5%");
			System.out.println("Você pode deduzir o valor de R$ 142.00");
		}
		
		else if (isMedianValue) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir na declaração o valor de R$ 350.00");
		}
		
		else if (isHighestValue) {
			System.out.println("A sua aliquota é de 22.5%");
			System.out.println("Você pode deduzir na declaração o valor de R$ 636.00");
		}
	}
}
