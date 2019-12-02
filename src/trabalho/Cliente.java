package trabalho;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String sobrenome;
	private int telefone;
	private int CPF;
	private int IDcliente;
	
	private ArrayList<Pet> p = new ArrayList<Pet>();
	
	public Cliente(String nome, String sobrenome, int telefone, int CPF, int iDcliente) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.CPF = CPF;
		this.IDcliente = iDcliente;
	}
	
	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public Cliente() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getIDcliente() {
		return IDcliente;
	}
	public void setIDcliente(int iDcliente) {
		IDcliente = iDcliente;
	}
	public ArrayList<Pet> getP() {
		return p;
	}
	public void setP(ArrayList<Pet> p) {
		this.p = p;
	}
	

}
