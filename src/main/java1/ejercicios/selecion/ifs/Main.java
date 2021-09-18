package ejercicios.selecion.ifs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int opcion;
		do {
			System.out.println("1.- Escoja opcion ");
			System.out.println("2.-Realizar transferencia ");
			System.out.println("3.- Consultar pagos ");
			System.out.println("4.- Salir ");
			opcion = teclado.nextInt();
			
			if (opcion==1) {
				System.out.println(" ingrese numero de cuenta ");
			}else if (opcion ==2) {
				System.out.println(" No existen pagos ");
			}
			
	
		}while (opcion !=3);  // similra a opcion !=3
		System.out.println(" Gracias por preferirnos "); 

	}

}
