package ejercicio.nonacces.finall;

public class EstudianteOdontologia extends EstudianteMedicina {
	// No se puede sobreescribir un metodo final del padre
	public void realizarPracticas(int rt) {
		System.out.println("Realiza 100 horas de practicas");
		
	}
	
	protected void realizarPasantia() {
		System.out.println("Realizar 200 horas de practica ");
	}

}
