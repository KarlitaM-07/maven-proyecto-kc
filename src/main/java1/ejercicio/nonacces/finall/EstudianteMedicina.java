package ejercicio.nonacces.finall;

public class EstudianteMedicina extends Estudiante {
	
	private String codigoMSP;
	
	protected final void realizarPracticas() {
		System.out.println("Realiza 50 horas de practicas");
	}
	
	protected void realizarPasantias() {
		System.out.println("Realizar 100 horas de practica");
	}

}
