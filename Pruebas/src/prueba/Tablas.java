package prueba;

public class Tablas {

	public static void main(String[] args) {
		int x,z,result;
		System.out.println("El resultado de mostrar las tablas es: ");
        for(x=1;x<=10;x++){
        	
          for(z=1;z<=10;z++)
           {
              result=x*z;
            
            System.out.println(x+" * "+z+" = "+result);
           }
          
        }
	}
}