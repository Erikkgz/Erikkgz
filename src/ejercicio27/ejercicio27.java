package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	
	public static void main(String[] args) {


		Scanner guardado = new Scanner(System.in);
	    int contrase�a = 2008, intentos = 3;
	    boolean perder = false;
		
	
		do {
			System.out.println("ingrese una contrase�a");
			System.out.println("Intentos: " + intentos);
		contrase�a = guardado.nextInt();
		intentos--;
		 
		if(intentos < 1  ) { 
		        	
		        	perder = true;
		        }
		    	
		   } while (contrase�a != 2008 && perder == false );
		        
		
		
		 if (contrase�a == 2008) {
			   System.out.println("correcto");
		   }
		
		 else {
			 System.out.println("contrase�a incorrecta");
					 
		 }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
