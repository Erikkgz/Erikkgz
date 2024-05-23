package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {
  
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);  
		
		int nota;
	    
		System.out.println("ingrese una calificacion del 1 al 10 : ");
        nota = datos.nextInt(); 
		
		if ( nota >= 1 && nota <= 3) {
			System.out.println("es insuficiente.");
        }
		else if (nota >3 &&  nota < 6) {
			System.out.println("no logrado");
		}
		else if ( nota >=6 && nota <= 7) {
			System.out.println("suficiente.");
		}
		else if ( nota >=8 && nota <=9 ) {
			System.out.println("notable.");
		}
		else if (nota ==10) {
			System.out.println("sobresaliente.");
		}
   		
		
		
		
				
	}
}
