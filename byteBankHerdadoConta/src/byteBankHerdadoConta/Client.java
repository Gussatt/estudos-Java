package byteBankHerdadoConta;

public class Client {
	private String name;
	private String cpf;
	private String profession;
	
	public Client (String name, String cpf, String profession){
		this.name = name;
		this.cpf = cpf;
		this.profession = profession;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getName() {
		return name;
	}
	
	public String getProfession() {
		return profession;
	}
	
}
