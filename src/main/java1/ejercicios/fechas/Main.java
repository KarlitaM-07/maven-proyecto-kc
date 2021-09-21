package ejercicios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date= new Date(); 
		
		LocalDate diaHoy = LocalDate.now();
		
		CursoVacacional curso1=new CursoVacacional();
		curso1.setNombre("Volley principiante " );
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaHoy);
		
		System.out.println("Nombre: "+ curso1.getNombre());
		System.out.println(" F I: "+ curso1.getFechaInicio());
		System.out.println(" F F: "+ curso1.getFechaFin());
		
		
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natacion principiantes");
		curso2.setFechaInicio(diaHoy);
		curso2.setFechaFin(diaHoy);
		
		System.out.println("Nombre: "+ curso2.getNombre());
		System.out.println(" F I: "+ curso2.getFechaInicio());
		System.out.println(" F F: "+ curso2.getFechaFin());
		
		// Fechas especificas
		LocalDate fechaEspecifica = LocalDate.of(2022, 2, 15);
		System.out.println(fechaEspecifica);
		
		// Ejercicios
		LocalDate fechaEspeciIni= LocalDate.of(2022, 2, 15);
		LocalDate fechaEspeciFin = LocalDate.of(2022, 7, 10);
		
		
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEspeciIni);
		curso3.setFechaFin(fechaEspeciFin);
		
		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva= fechaVista.plusDays(3);
		
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println("Nombre: "+ curso3.getNombre());
		System.out.println(" F I: "+ curso3.getFechaInicio());
		System.out.println(" F F: "+ curso3.getFechaFin());

	}

}
