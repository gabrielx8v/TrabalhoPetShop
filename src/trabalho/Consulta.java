package trabalho;

public class Consulta {
	private String nomeVeterinario;
	private int ano;
	private int mes;
	private int dia;
	private int horario;
	private int IDpet;
	
	public Consulta(int ano, int mes, int dia, int IDpet,String nomeVeterinario,int horario) {
		super();
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.IDpet= IDpet;
		this.horario = horario;
		this.nomeVeterinario =nomeVeterinario;
	}
	
	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}

	public String getNomeVeterinario() {
		return nomeVeterinario;
	}

	public void setNomeVeterinario(String nomeVeterinario) {
		this.nomeVeterinario = nomeVeterinario;
	}

	public Consulta() {
		super();
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getIDpet() {
		return IDpet;
	}

	public void setIDpet(int iDpet) {
		IDpet = iDpet;
	}
	

}
