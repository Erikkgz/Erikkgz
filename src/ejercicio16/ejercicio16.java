package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); 
		int hora, minuto, segundo;
		
		System.out.println("indique q hora es :");
		hora = datos.nextInt();
		System.out.println("indique q minuto es: ");
		minuto = datos.nextInt();
		System.out.println("indique de segundo es");
		segundo = datos.nextInt();
		
		if (hora >=24  ) {
			System.out.println("la hora supera las 24 y se convierte en otro dia.");
		}
		else if (minuto >=60) {
			System.out.println("60 minutos = a 1 hora");
		    
		}
		else if(segundo >=60) {
			System.out.println("60 segundos = a 1 minuto");
		}
		else {
			System.out.println("la hora es correcta ");
		}
		
		
		
		
		
		
		
		
	}
}
