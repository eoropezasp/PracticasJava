package ar.edu.ort.thp.ej1al4;

public class Vehiculo {
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
		int velocidadIncrementada;
		if (this.velocidadActual != this.velocidadMaxima) {
			velocidadIncrementada = this.velocidadActual + incremento;
			if (velocidadIncrementada <= this.velocidadMaxima) {
				this.velocidadActual = velocidadIncrementada;

			} else {
				this.velocidadActual = this.velocidadMaxima;

			}
			System.out.println("ahora su velocidad es: " + this.velocidadActual);

			pudoAcelerar = true;
		} else {
			System.out.println("ya no puedo acelerar mas de la maxima");
		}

		return pudoAcelerar;
	}

	public boolean frenar(int decremento) {
		int velovidadDecrementada;
		boolean pudoFrenar = false;

		if (this.velocidadActual != 0) {
			velovidadDecrementada = this.velocidadActual - decremento;
			if (velovidadDecrementada >= 0) {
				this.velocidadActual = velovidadDecrementada;
			} else {
				this.velocidadActual = 0;
			}
			System.out.println("ahora su velocidad es: " + this.velocidadActual);
			pudoFrenar=true;
		} else {
			System.out.println("el vehiculo ya esta detenido, no puede frenanr mas");

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
		System.out.println("velocidad maxima: " + this.velocidadMaxima);
		System.out.println("velocidad actual: " + this.velocidadActual);
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
