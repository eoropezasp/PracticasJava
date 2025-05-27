package ar.edu.ort.thp.ej1al4;

import java.time.LocalDate;
import java.time.Period;

public class Test {

	public static void main(String[] args) {

		Persona persona1 = new Persona("pepe", "caseros");
		
		
		persona1.mostrarPersona();
		Vehiculo auto1 = new Vehiculo("rojo", "fiat", "cronos",100,new Fecha(12,12,1997));
		System.out.println();
		persona1.setVehiculo(auto1);
		persona1.mostrarPersona();
		System.out.println();
		
		Persona persona2 = new Persona("fernando", "tolaba", auto1, new Fecha(20,06,1988));
		persona2.mostrarPersona();
		System.out.println();
		Vehiculo auto2 = new Vehiculo("negro", "ferrari", "cronos",100,new Fecha(12,12,1200));
		
		persona2.mostrarPersona();
		System.out.println();
		auto1.setColor("amarillo");
		persona1.mostrarPersona();

		System.out.println();
		persona2.mostrarPersona();
		
		/*
		Fecha fecha = new Fecha(1,1,2001);
		Fecha fecha2 = new Fecha(1,1,2001);
		
		System.out.println(fecha);	
		System.out.println(fecha2);	
		
		fecha.mostrar();
		
		
		Persona persona1 = new Persona("carlos", "megia");
		persona1.mostrarPersona();
		
		System.out.println(persona1);
		  
		
		Persona persona2 = new Persona("fernando", "tolaba", new Fecha(20, 06, 1988));

		Vehiculo vehiculo1 = new Vehiculo();

		Vehiculo vehiculo2 = new Vehiculo("negro", "fiat", "fiorino", 50, new Fecha(20, 05, 1997));
		
		 * Persona persona3 = new Persona(); / persona1.setNombre("pedro");
		 * persona1.setApellido("pascal");
		 * 
		 * /*persona2.setNombre("FERNANDO"); persona2.setApellido("TOLABA");
		 * 
		 * persona3.setNombre("juan"); persona3.setApellido("perez");
		 * 
		 * 
		 * persona2.mostrarNombreCompleto(); persona3.mostrarNombreCompleto();
		 

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
		vehiculo2.encender();

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
		*/

	}

}
