package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); 
		float total;
		double descuento;
		
		System.out.println("si superan los 15.000 dolares tienen un %10 de descuento.");
		
		System.out.println("el costo total es : ");
		total = datos.nextFloat();
				
		if (total > 15000) {
			descuento = total * 0.9f;
			System.out.println("supero los 15000, tiene 10% de descuento." + descuento);
			
		}
		else {
			System.out.println("como no supero los 150000 dolares no tiene el 10%.");
			
		}
		
		
				
	}
}
