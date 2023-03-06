package byteBankHerdado;

public class Employee {
	private String name;
	private String cpf;
	private double salary;
	
	public double getBonus() {
		return this.salary * 0.05;
	}

	public String getName() {
		return name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
