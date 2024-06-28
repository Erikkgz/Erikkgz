package repaso_de_evaluacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repaso_de_evaluacion {
	
	public static void main(String[] args) {
     
		Scanner guardar = new Scanner(System.in);
          
		int dni;

		
		List<Integer> lista_dni = new ArrayList<>(4);
		
		
		List<String> lista_apellido = new ArrayList<>(4);
		
		
		System.out.println("ingres 4 dni");
		int lista_dni1;
		
		System.out.println("ingrese su 4 apellidos");
		
		
		for (int i = 0; i < 4; i++) {
		 lista_dni1 = guardar.nextInt();
		 lista_dni.add(lista_dni1);
		}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
