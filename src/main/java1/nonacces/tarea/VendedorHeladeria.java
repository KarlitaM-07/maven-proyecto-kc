package nonacces.tarea;

public class VendedorHeladeria extends ClienteHeladeria  {
	
	// No se puede sobreescribir un metodo final de metodo padre
	
	public void cantidadHelados(int rt) {
		System.out.println("Compro 26 helados de dos sabores");
		
	}
	protected void compraHelados() {
		System.out.println("Compro 32 helados de tres sabores");
	}
	
	

}
