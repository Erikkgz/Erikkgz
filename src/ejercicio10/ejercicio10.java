package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroGanador = (int) ( Math.random()*99 );
		float numeroIngresado;
		
		System.out.println("\nEstimado usuario. Le solicito, por favor, que ingrese un numero entre 0 y 99 para hallar el numero ganador ");
		
		numeroIngresado = entrada.nextInt();
		
		System.out.println("El numero ganador es: " + numeroGanador);
		if( numeroIngresado == numeroGanador ) {
		System.out.println("GANSTE PICHONASO");
		
		}
		else {
	    System.out.println("PERDISTE ");
		}

	}

	
	

	
	
	
}
