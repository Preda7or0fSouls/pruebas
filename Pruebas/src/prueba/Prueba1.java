package prueba;
import java.util.*;
public class Prueba1 {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 int num,x,impar=0,par=0,ppar=0,residuo;
		 for(x=1;x<=10;++x)
		        {
		            System.out.print("ingrese digito "+x+": ");
		            num=teclado.nextInt();
		            residuo=num%2;
		            if(residuo==0)
		            {
		                par=par+num;
		                ppar=ppar+1;
		            }
		            if(residuo!=0)
		                impar=impar+num;
		        }
		            par=par/ppar;
		            System.out.println("los numeros pares fueron: "+ppar);
		            System.out.println("el promedio de los numeros pares es: " +par);
		            System.out.println("la suma de los numeros impares son: "+impar);
		    } }



 