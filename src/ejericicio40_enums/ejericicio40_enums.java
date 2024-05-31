package ejericicio40_enums;

import java.util.Scanner;

public class ejericicio40_enums {

	public static void main(String[] args) {

		Scanner guardar = new Scanner(System.in);

		String[] nombre = new String[10];
		int[] apellido = new int[10];

		for (int i = 0; i < nombre.length; i++) {

			System.out.println("Ingresa un nombre: ");
			nombre[i] = guardar.next();

		}

		// Messi, Maradona, Aymar, Gallardo, Palermo, Riquelme, Vagoneta, Eito,
		// Leybovich y Raffo.

		for (int i = 0; i <= 10; i++) {

			System.out.println("Mostrar todos los nombres: " + nombre[i]);

		}
	}
}