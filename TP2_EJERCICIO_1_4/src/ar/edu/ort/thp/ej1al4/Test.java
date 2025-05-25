package ar.edu.ort.thp.ej1al4;

import java.time.LocalDate;
import java.time.Period;

public class Test {

	public static void main(String[] args) {

		Persona persona1 = new Persona("carlos", "megia");
		Persona persona2 = new Persona("fernando", "tolaba", new Fecha(20, 06, 1988));

		Vehiculo vehiculo1 = new Vehiculo();

		Vehiculo vehiculo2 = new Vehiculo("negro", "fiat", "fiorino", 50, new Fecha(20, 05, 1997));
		/*
		 * Persona persona3 = new Persona(); / persona1.setNombre("pedro");
		 * persona1.setApellido("pascal");
		 * 
		 * /*persona2.setNombre("FERNANDO"); persona2.setApellido("TOLABA");
		 * 
		 * persona3.setNombre("juan"); persona3.setApellido("perez");
		 * 
		 * 
		 * persona2.mostrarNombreCompleto(); persona3.mostrarNombreCompleto();
		 */

		LocalDate fech = LocalDate.now();
		persona1.mostrarPersona();

		persona2.mostrarPersona();
		System.out.println(persona2.getEdad().getYears());

		System.out.println(fech);
		System.out.println();
		System.out.println();

		vehiculo1.mostrar();
		System.out.println();

		System.out.println();
		System.out.println();

		vehiculo2.mostrar();
		System.out.println();
		System.out.println();
		System.out.println(vehiculo2.acelerar(20));

		
		vehiculo2.mostrar();
		System.out.println();
		System.out.println(vehiculo2.acelerar(30));

		
		vehiculo2.mostrar();
		System.out.println();

		System.out.println(vehiculo2.acelerar(30));

		
		vehiculo2.mostrar();
		
		System.out.println();
		System.out.println();
		System.out.println(vehiculo2.frenar(20));

		
		vehiculo2.mostrar();
		System.out.println();
		System.out.println(vehiculo2.frenar(30));

		
		vehiculo2.mostrar();
		System.out.println();

		System.out.println(vehiculo2.frenar(30));

		
		vehiculo2.mostrar();

	}

}
