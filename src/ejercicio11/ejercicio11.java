package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		
		Scanner data = new Scanner (System.in); 
		int numero; 
		
		System.out.println("ingrese un numero : ");
		numero = data.nextInt();
		
		
	if (numero > 0 ) {
		
		System.out.println("es positivo");
	}
   
	else if (numero < 0) {
		
		System.out.println("es negativo");
		
	}
	
	else if (numero == 0) {
		
		System.out.println("es 0" );
		
	}
		
		

	}
}
