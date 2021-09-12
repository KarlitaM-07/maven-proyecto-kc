package tarea.hospital;

import java.util.Scanner;

public class MainPaciente extends Paciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" --------------------------------- ");
		System.out.println("Ingrese los datos del paciente: ");
		System.out.println(" 1.- Registrar Paciente ");
		System.out.println(" 2.- Imprimir Reporte ");
		System.out.println(" 3.- Salir ");
		System.out.println(" --------------------------------- ");
		 opcion = teclado.nextInt();
		 
	   while(opcion > 3);
	
		
		if (opcion ==1) {
			
		
		System.out.println("Ingrese nombre del paciente: ");
		nombre = teclado.nextLine();
		Paciente pa1= new Paciente();
		pa1.setNombre(nombre);
		System.out.println("Ingrese apellido del paciente: ");
		Paciente pa2= new Paciente();
		pa2.setApellido(apellido);
		System.out.println("Ingrese edad del paciente: ");
		Paciente pa3= new Paciente();
		pa3.setEdad(edad);
		System.out.println("Ingrese sintoma del paciente: ");
		Paciente pa4= new Paciente();
		pa4.setSintomas(sintomas);		

	} else if (opcion ==2) {
		
	}
		
		Paciente pa1 = null;
		Paciente pa2 = null;
		Paciente pa3 = null;
		Paciente pa4 = null;
		
		Paciente lista[]= new Paciente [4];
		lista[0]=pa1;
		lista[1]=pa2;
		lista[2]=pa3;
		lista[3]=pa4;

		System.out.println();
	}
}
