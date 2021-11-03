package prueba;
import java.util.Scanner;

public class Entrada {
	static Scanner entrada = new Scanner(System.in);
	

	
	public static int getInteger() {
		System.out.println("Introduce un número entero:");
		while (!entrada.hasNextInt()) {
			System.out.println("Valor no válido");
			entrada.next();
			
	
		}
		return hasNextInt();
		
	
	}

		

	public static double getDouble() {
	System.out.println("Introduce un número decimal:");
	while (!entrada.hasNextDouble()) {
		System.out.println("Valor no válido");
		entrada.next();
		

	}
		return hasNextDouble();

	}



	

	private static int hasNextInt() {
		
		return 0;
	}
	private static double hasNextDouble() {

		return 0;
	}


	

}
