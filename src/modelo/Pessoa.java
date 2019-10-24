package modelo;

public abstract class Pessoa { 			//A classe pessoa é uma classe abstrata porque serve apenas como modelo as classe Aluno e Instrutor, que são classes concretas

	private String nome;				//Os atributos da Classe Pessoa.
	private String cpf;					//O conceito de encapsulamento está embutido aqui.
	private String data_nascimento;		//Encapsulamente serve para controlar o acesso aos atributos e métodos de uma classe.
	private String sexo;
	private Endereco endereco;

	public Pessoa(String nome, String cpf) { //construtor servirá para o instrutor
		this.nome = nome;
		this.cpf = cpf;
	}
	
	

	public Pessoa(String nome,String cpf, String data_nascimento, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.endereco = endereco;  				// Agregaçao aqui em Endereco: caracterizada por um relacionamento do tipo parte-todo, em que uma das pontas da associação é a parte é o todo.
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}


	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}


}
