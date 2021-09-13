package nonacces.tarea;

public final class MisHeladerias extends Helados {
private String tamañoHelados;
	
	
	public final String horarioApertura="10;30";
	
	public String cantidadClientes= "Minimo 12";
	
	public void Miheladeria() {
		
		
		// no se puede reasignar un valor a un atributo final
		horarioApertura="10;30";
		cantidadClientes = "Minimo 12";
		
		
	}

}
