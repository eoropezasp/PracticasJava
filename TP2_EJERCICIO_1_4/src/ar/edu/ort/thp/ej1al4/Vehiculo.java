package ar.edu.ort.thp.ej1al4;

public class Vehiculo {
	final static int VELOCIDAD_MIN = 0;

	private String color;
	private String marca;
	private String modelo;
	private boolean encendido;
	private int velocidadActual;
	private int velocidadMaxima;
	private Fecha fechaFabricacion;
	private Fecha fechaUltimaVTV;

	public Vehiculo() {
		this.color = "";
		this.marca = "";
		this.modelo = "";
		this.encendido = false;
		this.velocidadActual = 0;
		this.velocidadMaxima = 0;
		this.fechaFabricacion = null;
		this.fechaUltimaVTV = null;
	}

	public Vehiculo(String color, String marca, String modelo, int velocidadMaxima, Fecha fechaFabricacion) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMaxima = velocidadMaxima;
		this.fechaFabricacion = fechaFabricacion;
		this.encendido = false;
		this.velocidadActual = 0;
		this.fechaUltimaVTV = null;
	}

	public boolean encender() {
		boolean resultado = false;
		if (!this.encendido) {
			this.encendido = true;
			resultado = true;
		}
		return resultado;
	}

	public boolean acelerar(int incremento) {
		boolean pudoAcelerar = false;

		if (this.encendido && this.velocidadActual != this.velocidadMaxima) {
			this.velocidadActual = this.velocidadActual + incremento;
			if (this.velocidadActual > this.velocidadMaxima) {
				this.velocidadActual = this.velocidadMaxima;
			}
			pudoAcelerar = true;
		} else {
			System.out.println("ya no puedo acelerar mas de la maxima");
		}

		return pudoAcelerar;
	}

	public boolean frenar(int decremento) {
		boolean pudoFrenar = false;

		if (this.encendido && this.velocidadActual != VELOCIDAD_MIN) {
			this.velocidadActual = this.velocidadActual - decremento;

			if (this.velocidadActual < VELOCIDAD_MIN) {
				this.velocidadActual = VELOCIDAD_MIN;
			}
			pudoFrenar = true;
		} else {
			System.out.println("el vehiculo ya esta detenido, no puede frenar mas");

		}

		return pudoFrenar;
	}

	public boolean apagar() {
		boolean resultado = false;
		if (this.encendido) {
			this.encendido = false;
			resultado = true;
		}
		return resultado;
	}

	public void tocarVocina() {
		System.out.println("pip!, pip!");
	}

	public Fecha getFechaDeFabricacion() {
		return this.fechaFabricacion;
	}

	public void mostrar() {
		System.out.println(this);
	}

	public String toString() {
		String cadena;
		cadena = "marca y modelo: " + this.marca + " " + this.modelo + "\n";
		cadena += "color: " + this.color + "\n";
		cadena += "velocidad maxima: " + this.velocidadMaxima + " km/h" + "\n";
		cadena += "velocidad actual: " + this.velocidadActual + " km/h" + "\n";
		if (this.encendido) {
			cadena += "esta encendido" + "\n";
		} else {
			cadena += "esta apagado" + "\n";
		}

		if (fechaFabricacion != null) {
			cadena += "fecha de fabricacion: ";
			cadena += this.fechaFabricacion + "\n";
		} else {
			cadena += "no tiene fecha de fabricacion registrada" + "\n";
		}

		if (fechaUltimaVTV != null) {
			cadena += "fecha de ultima vtv: ";
			cadena += this.fechaUltimaVTV + "\n";
		} else {
			cadena += "no tiene fecha de vtv registrada";
		}

		return cadena;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
