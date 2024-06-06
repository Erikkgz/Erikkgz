package ejercicio_enums43;

import java.util.Scanner;

public class ejercicio_enums43 {
	
	public static void main(String[] args) {
     
		Scanner guardar = new Scanner(System.in);

		
	int numeroIngresado;
		
		boolean encontrado = false;

		String[] nombre = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana" };
		int[] Reservado = { 1011, 2367, 8748, 9121, 817, 6423, 2034 };

		System.out.println("Para encontrar a un individuo, ingresar número de socio: ");
		numeroIngresado = guardar.nextInt();

		for (int i = 0; i < Reservado.length; i++) {

			if (Reservado[i] == numeroIngresado) {
				System.out.println("coincide con:" + nombre[i]);
				encontrado = true;
			}

		}
		
		if (encontrado = false) {
			System.out.println("No se encontro el numero de socio ingresado.");
		}
		
System.out.println("el numero esta reservado");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
