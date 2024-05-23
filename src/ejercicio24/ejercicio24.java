package ejercicio24;

import java.util.Scanner;

public class ejercicio24 {

	
		public static void main(String[] args) throws InterruptedException {
			Scanner datos = new Scanner(System.in);

			float n1, n2, suma;
			int salir;
			boolean quiereSalir = false;

			System.out.println("Buen día, crack de la vida! Vamos a sumar dos numeros.");

			do {

				System.out.println("Ingrese un numero: ");
				n1 = datos.nextInt();

				System.out.println("Ingrese otro numero: ");
				n2 = datos.nextInt();

				suma = n1 + n2;

				Thread.sleep(500);

				System.out.println("El resultado de la suma es: " + suma);

				Thread.sleep(500);

				System.out.println("Para salir, presione 0. Si no, ingrese cualquier otro numero.");
				salir = datos.nextInt();
				
				if (salir == 0) {
					quiereSalir = true;
				}
				else {
					quiereSalir = false;
				}
				
				Thread.sleep(500);

			} while (quiereSalir == false);

			Thread.sleep(500);

			System.out.println("Programa finalizado.");

		}
		
		
		
	
}