package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	
	public static void main(String[] args) {
	
		Scanner guardado = new Scanner(System.in);
	    int contraseņa = 2008, intentos = 3;
		
		
	
		do {
			System.out.println("ingrese una contraseņa");
			System.out.println("Intentos: " + intentos);
		contraseņa = guardado.nextInt();
		intentos--;
		  
		    	
		   } while (contraseņa != 2008 && intentos >0);
		           
		
		
		 if (contraseņa == 2008) {
			   System.out.println("correcto");
		   }
		
		 else {
			 System.out.println("contraseņa incorrecta");
					 
		 }
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	}		
}
		
