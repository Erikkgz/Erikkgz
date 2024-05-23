package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {

	
	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);  
		 	
		char talles;
		
		System.out.println("ingrese talles de remera(S-M-L) : ");
		talles = datos.next().charAt(0);
		
		
		if ( talles == 'S' || talles == 's') {
			System.out.println("quedan 5 remeras. " );
		}
				
		else if (talles == 'M' || talles =='m') {
			System.out.println("qudan 2 remeras." );
		}
		else if (talles == 'L' || talles =='l') {
			System.out.println("ya no quedn remeras x llegar tarde.");
			
		}
		
	}
}
