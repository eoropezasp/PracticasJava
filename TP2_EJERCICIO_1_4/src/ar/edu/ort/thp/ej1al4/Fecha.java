package ar.edu.ort.thp.ej1al4;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;
	
	

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 1990;
	}






	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}

	public void mostrar() {
		System.out.println(this.dia + " / " + this.mes + " / " +this.anio);
	}
}
