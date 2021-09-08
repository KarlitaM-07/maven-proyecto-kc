package tarea.estudiante.menu;

public class MainEstudiante {

	private static Object teclado;
	private static Object cedula;
	private static int opcion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cedulaABuscar="1711584803";
		
		Estudiante fila[]=new Estudiante[5];
		
		Estudiante karla=new Estudiante();
		karla.setNombre("Karla");
		karla.setCedula("1727936310");
		
		Estudiante michael=new Estudiante();
		michael.setNombre("Michael");
		michael.setCedula("1750574160");
		
		Estudiante suly=new Estudiante();
		suly.setNombre("Suly");
		suly.setCedula("1727936351");
		
		Estudiante karolina=new Estudiante();
		karolina.setNombre("Karolina");
		karolina.setCedula("1727936310");
		
		Estudiante cristian=new Estudiante();
		cristian.setNombre("Cristian");
		cristian.setCedula("1717054397");
		
		
		fila[0]=karla;
		fila[1]=michael;
		fila[2]=suly;
		fila[3]=karolina;
		fila[4]=cristian;
		
		do {
			System.out.println("------------------------");
			System.out.println(" 1. Ingresar Estudiante ");
			System.out.println(" 2. Buscar Estudiante   ");
			System.out.println("       3. SALIR         ");
			System.out.println("------------------------");
			int opcion = 0;
			 
			if (opcion ==1) {
				System.out.println("Ingrese Cedula del estudiante: ");
			}else if (opcion ==2) {
				System.out.println("Ingrese cedula a buscar ");
				cedula.toString();	
		
		for(int i=0; i<5; i++) {
			Estudiante estudiante =fila[i];
			String cedula= estudiante.getCedula();
			if(cedulaABuscar.equals(cedula)) {
				System.out.println("El estudiiante esta registrado ");
				
			}else {
				System.out.println("El estudiante no esta registrado ");
			}
		}
			}
		
		} while(opcion ==3);
	}

}
	



 

