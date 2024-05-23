package ejercicio32;

import java.util.Scanner;

public class ejercicio32 {
	
	public static void main(String[] args) {

		Scanner guardar = new Scanner(System.in);		
		
		int resultado,i,numero;
		
		System.out.println("q tabla quiere multiplicar");
		numero = guardar.nextInt();
		
		
		
		for(i = 1; i<=10; i++) {
			
			resultado = numero * i ;
			System.out.println(numero + " * " + i + " = " + resultado );
				
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
