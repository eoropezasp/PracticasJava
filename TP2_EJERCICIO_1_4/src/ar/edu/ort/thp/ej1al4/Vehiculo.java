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
		System.out.println("marca y modelo: " + this.marca + " " + this.modelo);
		System.out.println("color: " + this.color);
		System.out.println("velocidad maxima: " + this.velocidadMaxima + " km/h");
		System.out.println("velocidad actual: " + this.velocidadActual + " km/h");
		if (this.encendido) {
			System.out.println("esta encendido");
		} else {
			System.out.println("esta apagado");
		}
		/*
		 * if (fechaFabricacion != null) { System.out.println("fecha de fabricacion: " +
		 * this.getFechaDeFabricacion());
		 * 
		 * } else { System.out.println("no tiene fecha de fabricacion"); }
		 */
		if (fechaFabricacion != null) {
			System.out.print("fecha de fabricacion: ");
			this.fechaFabricacion.mostrar();
		} else {
			System.out.println("no tiene fecha de fabricacion registrada");
		}

		if (fechaUltimaVTV != null) {
			System.out.print("fecha de ultima vtv: ");
			this.fechaUltimaVTV.mostrar();
		} else {
			System.out.println("no tiene fecha de vtv registrada");
		}
	}

}
