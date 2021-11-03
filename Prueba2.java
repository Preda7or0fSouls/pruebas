package prueba;
import java.util.*;
public class Prueba2 {

	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);

         float sueldoBruto,sueldo = 0;
         System.out.print("ingrese sueldo: ");
         sueldoBruto=teclado.nextFloat();
         if(sueldoBruto!=1000)
           {
            if(sueldoBruto<1000)
                 sueldo= (float) (sueldoBruto * 1.15);
            if(sueldoBruto>1000)
                  sueldo= (float) (sueldoBruto * 1.12);
            System.out.println("el sueldo final es: "+sueldo +"€");
           }
         if(sueldoBruto==1000)
            System.out.println("el sueldo final es: "+sueldoBruto+"€");
    }



	}


