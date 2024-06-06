package ejercicio_enums_44;

import java.util.HashSet;

import java.util.Scanner;

import java.util.Set;

public class ejercicio_enums_44 {
	
	public static void main(String[] args) {

		Scanner guardar = new Scanner(System.in);

		        Set<String> equipos = new HashSet<>();

		        System.out.println("ingrese cualquier equipos de fútbol.");
		        System.out.println("Ingrese los equipos de fútbol (escriba 'fin' para finalizar):");

		        String equipo;
		        while (true) {
		            equipo = guardar.nextLine().trim();
		            if (equipo.equalsIgnoreCase("fin")) {
		                break;
		            }
		            equipos.add(equipo);
		        }

		        System.out.println("\nEquipos registrados:");
		        for (String equipoRegistrado : equipos) {
		            System.out.println(equipoRegistrado);
		        }
		        System.out.println("\nCantidad de equipos registrados: " + equipos.size());

		        guardar.close();
		    
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
}
