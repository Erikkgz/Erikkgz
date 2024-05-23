package ejercicio23;

import java.util.Scanner;

public class ejercicio23 {
	
	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

	
	int intentos = 5 ,i = 0;
	
	int numeroGanador = (int) (Math.random() * 99);
	float numeroIngresado;
	boolean noTieneIntentos = false;
	
	do {
		System.out.println(
				"\nEstimado usuario. Le solicito, por favor, que ingrese un numero entre 0 y 99 para hallar el numero ganador ");

		numeroIngresado = datos.nextInt();
		intentos-- ; //-- le resta 1 a intentos
		System.out.println("El numero ganador es: " + numeroGanador);
		
	

		if (intentos == 0) {
			noTieneIntentos = true ;
		   }
		
	   if (intentos >0 && noTieneIntentos==false) {
	        System.out.println("Seguir intentando");
	   }
	   else {
		   System.out.println(intentos+" intentos nomas wey");
	   }
	   
	    
	} while (numeroIngresado != numeroGanador && noTieneIntentos==false);
      
	
	
	if (numeroIngresado == numeroGanador) {
		System.out.println("GANSTE PICHONASO");

	} else {
		System.out.println("ERRASTE");
	}
	
	
	
	
	
	
	}
}
