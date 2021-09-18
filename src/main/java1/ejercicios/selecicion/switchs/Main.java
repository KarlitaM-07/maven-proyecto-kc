package ejercicios.selecicion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String   opcion;
		do {
			System.out.println(" Escoja opcion ");
			System.out.println("1.-Realizar transferencia ");
			System.out.println("2.- Consultar pagos ");
			System.out.println("3.- Salir ");
			opcion = teclado.nextLine();
			
			// El switch hasta antes de la version 1.7 
			// solo funcionaba para byte, short, char e int
			
			switch (opcion) {
			case "1":
				System.out.println(" ingrese numero de cuenta ");
				break;
				
			case "2":
				System.out.println("No existen pagos ");
				break;
				default: 
					System.out.println(" No a elegido ninguna opcion valida  ");
					break;				
			}
			
			if (opcion.equals("1")) {
				System.out.println(" ingrese numero de cuenta ");
			}else if (opcion.equals("2")) {
				System.out.println(" No existen pagos ");
			}
			
	
		}while (! opcion.equals("3"));  // similar  a opcion !=3
		System.out.println(" Gracias por preferirnos "); 

	}

	}
