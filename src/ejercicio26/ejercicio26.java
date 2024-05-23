package ejercicio26;

import java.util.Scanner;

public class ejercicio26 {
	
	public static void main(String[] args) {
	
		Scanner guardado = new Scanner(System.in);
	    int contraseña = 2008, intentos = 3;
		
		
	
		do {
			System.out.println("ingrese una contraseña");
			System.out.println("Intentos: " + intentos);
		contraseña = guardado.nextInt();
		intentos--;
		  
		    	
		   } while (contraseña != 2008 && intentos >0);
		           
		
		
		 if (contraseña == 2008) {
			   System.out.println("correcto");
		   }
		
		 else {
			 System.out.println("contraseña incorrecta");
					 
		 }
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	}		
}
		
