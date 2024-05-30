package ejercicio39_enums;

import java.util.Scanner;

public class ejercicio39_enums {

	public static void main(String[] args) {

		meses mesIngresado;

		Scanner guardar = new Scanner(System.in);

		String IngresoDatos;

		System.out.println("ingrese cualquier mes");
		IngresoDatos = guardar.next().toUpperCase();

		mesIngresado = meses.valueOf(IngresoDatos);

		switch (mesIngresado) {
		case ENERO:
		case MARZO:
		case MAYO:
		case JULIO:
		case AGOSTO:
		case OCTUBRE:
		case DICIEMBRE:
			System.out.println("Tiene 31 dias");
			break;

		case ABRIL:
		case JUNIO:
		case SEPTIEMBRE:
		case NOVIEMBRE:
			System.out.println("tienen 30 dias");
			break;

		case FEBRERO:
			System.out.println("tiene 28 dias");
			break;

		default:
			System.out.println("ESTUPIDO, ESO NO ES UN MES");
		}
		System.out.println();

	}
}
