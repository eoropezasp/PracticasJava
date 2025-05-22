package ar.edu.ort.thp.ej1al4;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.time.format.DateTimeFormatter;

public class Pruebas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      // Dos objetos de tu clase Fecha
        Fecha fechaNacimiento = new Fecha(20, 5, 1988);
        LocalDate actualLD = LocalDate.now();

        // Convertir ambos a LocalDate
        LocalDate nacimientoLD = LocalDate.of(
            fechaNacimiento.getAnio(),
            fechaNacimiento.getMes(),
            fechaNacimiento.getDia()
        );

        

        // Usar Period para calcular la diferencia
        Period edad = Period.between(nacimientoLD, actualLD);

        System.out.println("Edad: " + edad.getYears() + " años, " +
                           edad.getMonths() + " meses, " +
                           edad.getDays() + " días");
        System.out.println();
        
        System.out.println("Edad: " + edad.getYears());
	}

}
