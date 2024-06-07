package ejercicio_enums_45;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio_enums_45 {

	public static void main(String[] args) {

		Scanner guardar = new Scanner(System.in);

		String Sudamericano, pais;

		List<String> lista = new ArrayList<>();

		lista.add("Argentina");
		lista.add("Boliva");
		lista.add("Brasil");
		lista.add("Chile");
		lista.add("Colombia");
		lista.add("Ecuador");
		lista.add("Guyana");
		lista.add("Paraguay");
		lista.add("Perú");
		lista.add("Surinam");
		lista.add("Uruguay");
		lista.add("Venezuela");
   
		boolean encontrado = false;
		System.out.println("ingresar un pais");
		Sudamericano = guardar.next();

		for (int i = 0; i < lista.size(); i++) {

			if (Sudamericano.equalsIgnoreCase(lista.get(i))) {
				
				encontrado = true;
				break;
			}

			

		}
		
		if (encontrado == true) {
			System.out.println("pusiste un pais de la lista");
		}
		else {
			System.out.println("pusiste otro pais q no esta en la lista" );
		}
	}
}

//		
//		
//		
//		
//		String[] nombre = {"Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Perú", "Surinam", "Uruguay", "Venezuela"};
//		
//		System.out.println("ingrese un pais sudamericano:");
//		Sudamericano = guardar.nextInt();
//		
//	if (nombre[] = Sudamericano) {
//		
//	}
//		
//		
//		
