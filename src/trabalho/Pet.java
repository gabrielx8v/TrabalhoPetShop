package trabalho;

import java.util.ArrayList;

public class Pet {
	private String nome;
	private String sexo;
	private int idade;
	private int IDpet;
	
	private ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	
	public Pet(String nome, String sexo, int idade, int IDpet) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.IDpet = IDpet;
	}
	
	public ArrayList<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(ArrayList<Consulta> consultas) {
		this.consultas = consultas;
	}

	public Pet() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIDpet() {
		return IDpet;
	}
	public void setIDpet(int iDpet) {
		IDpet = iDpet;
	}
	

}
