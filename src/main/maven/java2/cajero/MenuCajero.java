package cajero;

import java.util.Scanner;

public class MenuCajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);		
		Scanner teclado2 = new Scanner (System.in);
		
		System.out.println("Ingrese clave:  ");
		
		String N = teclado.nextLine();
		String clave = "85DB";
		boolean comparacion=N.equals(clave);
		
		
		while (comparacion == false) {
			System.out.println(" Ingrese clave: ");
			N=teclado.nextLine();
			comparacion=N.equals(clave);
		}
		
		System.out.println("################################");
		System.out.println(" Elija una opcion ");
		System.out.println(" 1.- Consultar Pagos ");
		System.out.println(" 2.- Realizar Transferencia ");
		System.out.println(" 3.- SALIR");
		System.out.println("################################");
		int op = teclado.nextInt();
		
		
		clave = teclado.nextLine();
		
		do {
			if (op ==1) {
				System.out.println(" No tiene ningun pago pendiente ");
				
			}else if (op ==2) {
				String saldo = "2500";
				System.out.println(" ingrese la cuenta de destino y monto a transferir: ");
				String saldoAtransferir = "500";
				System.out.println(" Su saldo es : "+ saldo );
			}
			
		}

	}

}
