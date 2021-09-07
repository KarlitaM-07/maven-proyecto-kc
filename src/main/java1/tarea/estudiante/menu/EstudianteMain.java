package tarea.estudiante.menu;

import java.util.Scanner;

import prueba.uno.Pasajero;
import prueba.uno.PasajeroEconomico;
import prueba.uno.PasajeroVip;

public class EstudianteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int op;
		
		System.out.println(" ---------------------------");
		System.out.println(" 1. Ingresar Estudiante ");
		System.out.println(" 2. Buscar Estudiante ");
		System.out.println(" 3. SALIR ");
		System.out.println(" ---------------------------");
		
		op = teclado.nextInt();
		
		Estudiante nombre =new Estudiante ();
		String cedula = "1727936310";
		Estudiante.setNombre("Karla");
		
		
		Estudiante nombre1 =new Estudiante ();
		String cedula1 = "1750574160";
		Estudiante.setNombre("Michael");
		
		Estudiante nombre2 =new Estudiante ();
		String cedula2 = "1715653943";
		Estudiante.setNombre("Monchito");
		
		Estudiante nombre3 =new Estudiante ();
		String cedula3 = "1750683631";
		Estudiante.setNombre("Macco");
		
		Estudiante nombre4 =new Estudiante ();
		String cedula4 = "1715653433";
		Estudiante.setNombre("Michita");
		
		
		 String Estudiante []= new String[5];
		 Estudiante [0]= cedula;
		 Estudiante [1]= cedula1;
		 Estudiante [2]= cedula2;
		 Estudiante [3]= cedula3;
		 Estudiante [4]= cedula4;
		 
		
		
		
		do {
			
			if (op ==1) {
				System.out.println(" Ingrese Cedula de Estudiante ");
				
				
			}
			
			else if (op== 2) {
				System.out.println("Buscar por cedula al Estudiante ");
				
			}else if (op ==3) {
				System.out.println(" Salio del Sistema de Busqueda ");
				
			}
			
			op = teclado.nextInt();
			
	} while (op == 3);
		
}

}
