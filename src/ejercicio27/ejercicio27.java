package ejercicio27;

import java.util.Scanner;

public class ejercicio27 {
	
	public static void main(String[] args) {


		Scanner guardado = new Scanner(System.in);
	    int contraseña = 2008, intentos = 3;
	    boolean perder = false;
		
	
		do {
			System.out.println("ingrese una contraseña");
			System.out.println("Intentos: " + intentos);
		contraseña = guardado.nextInt();
		intentos--;
		 
		if(intentos < 1  ) { 
		        	
		        	perder = true;
		        }
		    	
		   } while (contraseña != 2008 && perder == false );
		        
		
		
		 if (contraseña == 2008) {
			   System.out.println("correcto");
		   }
		
		 else {
			 System.out.println("contraseña incorrecta");
					 
		 }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
