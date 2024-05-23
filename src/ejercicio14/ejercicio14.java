package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		

		Scanner datos = new Scanner(System.in);  
		int numero, numero1;
		
		System.out.println("ingrese un divisor : ");
		numero = datos.nextInt();
		System.out.println("ingrese un numero dividiendo: ");
		numero1 = datos.nextInt();
		
		
		
		if (numero1 ==0) {
			System.out.println("no se puede dividir entre 0(cero).");
			
		}
		else {
			System.out.println("si se puede.");
		}
	
		
		
		
		
		
		
		
		
		
	}
}
