package prueba;

public class Mates {

	static double suma(double x, double y) {
        return x + y;
 
    }
	static double resta(double x, double y) {
        return x - y;
      
    }
    static double mult(double x, double y) {
       return x * y;
       
    }
    static double div(double x, double y) {
        return x / y;
        
    }
		public static void main(String[] args) {
			System.out.println("Suma: Es igual a "+suma(10,15));
			System.out.println("Reta: Es igual a "+ resta(25,10));
			System.out.println("Multiplicacion: Es igual a "+ mult(5,5));
			System.out.println("Division: Es igual a "+ div(100,10));
		}

	}


