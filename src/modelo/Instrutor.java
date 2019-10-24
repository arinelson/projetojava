package modelo;


public class Instrutor extends Pessoa {				//a classe instrutor herda os atributos da classe pessoa
	
	private String cargo;

	
	public Instrutor(String nome,String cpf, String data_nascimento, Endereco endereco) {		//sobrecarga
		super(nome,cpf);							//super chama o construtor pai, que é a classe Pessoa								
													
	}
	

	public Instrutor(String nome,String cpf, Endereco endereco, String cargo) {
		super(nome,cpf);							// super chama o construtor pai, que é a classe Pessoa
		this.cargo = cargo;							//referência à variavel cargo
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return "Instrutor: " + super.getNome();
	}
}