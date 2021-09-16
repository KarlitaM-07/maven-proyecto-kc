package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String claveIngresada;
		String opcionMenu;
		int saldoInicial=2500;
		
		do {
			System.out.println(" Ingrese clave ");
			Scanner teclado = new  Scanner(System.in);
			Scanner tecladoInt = new Scanner(System.in);
			
			
			claveIngresada = teclado.nextLine();
		
		if ( claveIngresada.equals("85DB")) {
			
			do {
				System.out.println(" Banco PICHINCHA  ELIJA UNA OPCION  ");
				System.out.println( " 1.- Consultar pagos");
				System.out.println(" 2.- Realizar transferencias ");
				System.out.println("3.- SALIR ");
				opcionMenu=teclado.nextLine();
				if(opcionMenu.equals("1")) {
					// todo lo que me pide la opcion 1
					System.out.println("No tiene ningun pago pendiente: ");
				}else if (opcionMenu.equals("2")) {
					// todo lo que me pide la opcion 2
					System.out.println("Ingrese la cuenta de destino ");
					String cuentaDestino= teclado.nextLine();
					System.out.println("Ingrese el monto a transferir: ");
					int montoTransferir = tecladoInt.nextInt();
					saldoInicial = saldoInicial-montoTransferir;
					System.out.println("Su nuevo saldo es: "+ saldoInicial);
				}
				
				
				// while(opcionMenu.equals(-1)||opcionMenu.equals(2)			
				
			}while (!opcionMenu.equals("3"));	
			claveIngresada="0";
		}else {// NO
			System.out.println("La clave no es la correcta ");
		}
		// claveIngresada=-1
	} while (!claveIngresada.equals("-1"));
		System.out.println("Gracias por prferirnos ");

}

	}
