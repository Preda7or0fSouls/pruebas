package prueba;

public class ArgumentosSuma {

	public static void main(String[] args) {
		int suma = 0;
		
		System.out.println("-------------------");
		System.out.println("Argumentos: "+ args.length);
		System.out.println("-------------------");
		for (int i = 0; i < args.length; i++) {
			System.out.println();
			int temp  = Integer.parseInt(args[i]);
			suma = suma + temp;
			
		}
		System.out.println(suma);
	}
}
