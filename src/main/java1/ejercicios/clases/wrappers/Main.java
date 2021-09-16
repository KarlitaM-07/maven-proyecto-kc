package ejercicios.clases.wrappers;

public class Main {

	private static final char A = 0;
	private static final char B = 0;
	private static final char K = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte primitivo
		byte datoByte=2;
		Byte datoByteWrapper  =3;          //Wrapper
		System.out.println(" primitivo: "+ datoByte);
		System.out.println(" Wrapper: "+ datoByteWrapper);
		// Conversiones
		byte datoByte1=6;
		Byte datoConvertido = datoByte1;
		System.out.println(" Byte convertido: "+ datoConvertido);
		// conversiones 2 
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2;
		
		// short 
		short datoShort = 1;     // primitivo
		Short datoShortWrapper = 1;  // Wrapper
		System.out.println(" primitivo: "+ datoShort);
		System.out.println(" Wrapper: "+ datoShortWrapper);
		// Conversiones
	   short datoShort1=4;
		Short shortConvertido = datoShort1;
		System.out.println(" Short convertido: "+ shortConvertido);
		// conversiones 2
		Short datoShort2=7;
		short datoshort2 = datoShort2.shortValue();
		System.out.println("Short Convertido: "+ datoShort2);
		
		// int 
		int edad = 45;    // primitivo
		Integer edadWrapper = 48; // Wrapper
		System.out.println(" primitivo: "+ edad);
		System.out.println(" Wrapper: "+ edadWrapper);
		// Conversiones
		int edad1 =45;
		Integer integerConvertido = edad1;
		System.out.println(" Integer convertido: "+ integerConvertido);
		// conversiones 2
		Integer integerConvertido2=23;
		int edad2 = integerConvertido2.intValue();
		System.out.println(" int convertido: "+ edad2);
		
		//long 
		long valorGrande = 125344 ;  // primitivo
		Long valorGrandeWrapper= 123123l;// Wrapper
		System.out.println(" primitivo: "+ valorGrande);
		System.out.println(" Wrapper: "+ valorGrandeWrapper);
		// conversion 
		long valorGrande1 = 71299;
		Long valorGrandeConvertido=valorGrande1;
		System.out.println("valor grande convertido: "+ valorGrandeConvertido);
		// conversion 2
		Long valorGrandeConvertido2= (long) 319251;
		long valorGrande2= valorGrandeConvertido.longValue();
		System.out.println("long convertido:  "+ valorGrande2);
		
		// boolean
		boolean valorDeuda = true;
		Boolean valorDeudaWrapper = false;
		System.out.println(" primitivo: "+ valorDeuda);
		System.out.println(" Wrapper: "+ valorDeudaWrapper);
		// conversion 
		boolean valorDeuda1=true;
		Boolean valorDeudaConvertido1=valorDeuda1;
		System.out.println("Valor deudad convertido: "+ valorDeudaConvertido1);
		// conversion2
		Boolean valorDeudaConvertido2=true;
		boolean valorDeuda2=valorDeudaConvertido2.booleanValue();
		System.out.println(" boolean convertido: "+ valorDeuda2);		
		
		// float
		float m = 1445689;
		Float mWrapper = (float) 1445689;
		System.out.println(" primitivo: "+ m);
		System.out.println(" Wrapper: "+ mWrapper);
		// conversion 
		float m1= 234567;
		Float mConvertido1= m1;
		System.out.println(" valor m convertido: "+ mConvertido1);
		// conversion 2 
		Float mConvertido2=(float) 12346689;
		float m2= mConvertido2.floatValue();
		System.out.println(" float convertido: "+ m2);		
		
		// double 
		double pesoPaciente = 165;
		Double pesoPacienteWrapper= (double) 1654;
		System.out.println(" primitivo: "+ pesoPaciente);
		System.out.println(" Wrapper: "+ pesoPacienteWrapper);
		// Conversion
		double pesoPaciente1= 175;
		Double pesoPacienteConvertido1=pesoPaciente1;
		System.out.println("peso paciente convertido: "+ pesoPacienteConvertido1);
		// conversion 2 
		Double pesoPacienteConvertido2= (double) 253545;
		double pesoPaciente2=pesoPacienteConvertido2.doubleValue();
		System.out.println("Double convertido: "+ pesoPaciente2);
		
		// char
		char x = A;
	    Character xWrapper= (char) m;
	    System.out.println("primitivo: "+ x);
		System.out.println(" Wrapper: "+ xWrapper);
		// conversion 
		char x1 = B;
		Character xConvertido1= x1;
		System.out.println(" x convertido: "+ xConvertido1);
		// conversion 2 
		Character xConvertido2= (char) K;
		char x2= xConvertido2.charValue();
		System.out.println(" char convertido: "+ xConvertido2);
		
		
		

	}

}
