package ejercicios.nonaccess.staticos;

public class Paciente {
	private  String nombre;
	private  int edad;
	private static String nacionalidad="ECUATORIANA";
	private static int edadlimite=65;
	
	public void registrarse(String nombre) {
		System.out.println("Se registra el paciente: "+ nombre);
	}
	
	private static void consultarNacionalidad() {
		System.out.println();
	}
	
	public static void consultarNacionalidadSatica() {
		System.out.println(" La nacionalidad es: "+ nacionalidad);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
