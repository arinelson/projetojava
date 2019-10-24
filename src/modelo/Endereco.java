package modelo;

public class Endereco {

	private String bairro;			//atributos
	private String cep;
	
	
	
	//CONSTRUTOR
	public Endereco(String bairro,String cep) { 
		this.bairro = bairro;
		this.cep = cep;
	
	}

	
	//MÉTODOS ACESSORES
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}


}

