package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	
	public static void main(String[] args) {
	
		Scanner guardado = new Scanner(System.in);
	    int contrase�a = 2008, intentos = 3;
		
		
	
		do {
			System.out.println("ingrese una contrase�a");
			System.out.println("Intentos: " + intentos);
		contrase�a = guardado.nextInt();
		intentos--;
		  
		    	
		   } while (contrase�a != 2008 && intentos >0);
		           
		
		
		 if (contrase�a == 2008) {
			   System.out.println("correcto");
		   }
		
		 else {
			 System.out.println("contrase�a incorrecta");
					 
		 }
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	}		
}
		
