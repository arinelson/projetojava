package modelo;

import java.util.Random;
import modelo.Aluno;
import modelo.Endereco;

public class Aluno extends Pessoa { 												//A CLASSE ALUNO HERDA OS ATRIBUTOS DA CLASSE PESSOA

	
	private int numMatricula;
	Random random = new Random(); 													//GERAR O N�MERO DA MATR�CULA DE FORMA ALEAT�RIA


	public Aluno(String nome,String cpf) { //CONSTRUTOR 1
		super(nome,cpf);
		this.numMatricula = random.nextInt(1000000);
		
	}

	public Aluno(String nome,String cpf,String email, Endereco endereco) { 			//CONSTRUTOR 2
		super(nome,cpf,email, endereco);											//super chama o construtor pai, que � a classe Pessoa
		this.numMatricula = random.nextInt(10000);
		
	}
	
	
	
	//M�TODOS ACESSORES PARA TER ACESSO O ATRIBUTO MATR�CULA
	public int getNumMatricula() {
		return numMatricula;
	}

	public String getNome() {
		return "Aluno: " + super.getNome();
	}
	
	
}