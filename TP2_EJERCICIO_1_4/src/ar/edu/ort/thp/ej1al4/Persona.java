package ar.edu.ort.thp.ej1al4;
import java.time.LocalDate;
import java.time.Period;
public class Persona {
	
	private static int MAX_EDAD = 120;
	private static int MIN_EDAD= 0;
	private String nombre;
	private String apellido;
	private int edad;
	private Vehiculo vehiculo;
	private Fecha fechaDeNac;
	
	
	
	public Persona(String nombre, String apellido) {
	
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	
	public Persona(String nombre, String apellido, Fecha fechaDeNac) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNac = fechaDeNac;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
	
	public void mostrarNombreCompleto() {
		System.out.println(this.getNombreCompleto());
	}
	public Period getEdad() {
		
		LocalDate fechaNac = LocalDate.of(this.fechaDeNac.getAnio(),this.fechaDeNac.getMes(),this.fechaDeNac.getDia());
		
	Period edad = Period.between(fechaNac,LocalDate.now());
		
		return edad;
	}
	public void setEdad(int edad) {
		
		
		if (edad >=0 && edad <=120) {
			this.edad=edad;
		}else {
			this.edad=0;
		}
	}
	
	public  void mostrarPersona() {
		System.out.println(this.nombre);
		System.out.println(this.apellido);
		if (fechaDeNac!=null) {
			this.fechaDeNac.mostrar();
		}else {System.out.println("no tiene fecha de nacimiento");}
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", vehiculo=" + vehiculo
				+ ", fechaDeNac=" + fechaDeNac + "]";
	}




	
	
}
