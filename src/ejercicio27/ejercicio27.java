package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	
	public static void main(String[] args) {


		Scanner guardado = new Scanner(System.in);
	    int contraseņa = 2008, intentos = 3;
	    boolean perder = false;
		
	
		do {
			System.out.println("ingrese una contraseņa");
			System.out.println("Intentos: " + intentos);
		contraseņa = guardado.nextInt();
		intentos--;
		 
		if(intentos < 1  ) { 
		        	
		        	perder = true;
		        }
		    	
		   } while (contraseņa != 2008 && perder == false );
		        
		
		
		 if (contraseņa == 2008) {
			   System.out.println("correcto");
		   }
		
		 else {
			 System.out.println("contraseņa incorrecta");
					 
		 }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
