package ejercicio_enums_46;

import java.util.Scanner;

public class ejercicio_enums_46 {
	
	public static void main(String[] args) {

		paises paisIngresado;
		
		Scanner guardar = new Scanner(System.in);

		String IngresaPais;
		
		
		System.out.println("ingrese cualquier pais");
		IngresaPais = guardar.next().toUpperCase();
		
		
		paisIngresado = paises.valueOf(IngresaPais);
		
		switch (paisIngresado) {
		case ARGENTINA:
		case BOLIVIA:
		case BRASIL:
        case CHILE:
		case COLOMBIA:
		case ECUADOR:
		case GUYANA:
		case PARAGUAY:
		case PERÚ:
		case SURINAM:
		case URUGUAY:
		case VENEZUELA:
			System.out.println("correcto.");
			break;
			
		default:
			System.out.println("estupidito esto es un pais");
			
		}
	
		
		
		
		
		
		
	}
}
