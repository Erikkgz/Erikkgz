package ejercicio_enums_47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio_enums_47 {

	public static void main(String[] args) {

		Scanner guardar = new Scanner(System.in);
		
		List<String> nombresSocio = new ArrayList<>();

		nombresSocio.add("Enrique");
		nombresSocio.add("Liliana");
		nombresSocio.add("Lucas");
		nombresSocio.add("Juan");
		nombresSocio.add("Fiorella");
		nombresSocio.add("Ariel");
		nombresSocio.add("Daiana");
		
		
		List<Integer> numSocio = new ArrayList<>();

	      
		
		numSocio.add(1011);
		numSocio.add(2367);
		numSocio.add(8748);
		numSocio.add(9121);
		numSocio.add(817);
		numSocio.add(6423);
		numSocio.add(2034);
   
		
		System.out.println("ingrese una opcion ");
		System.out.println("1. Borrar");
		System.out.println("2. Modificar");
		
		int opcion = guardar.nextInt();

		if(opcion == 1) {
	     
			System.out.println("ingrese un numero a borrar");
			System.out.println(numSocio); 
			
			int numBorrar = guardar.nextInt();
					
			int posicionEnLista = numSocio.indexOf(numBorrar);
	
			nombresSocio.remove(posicionEnLista);
			numSocio.remove(posicionEnLista);
			
			System.out.println("lista de socios"+numSocio);
			System.out.println("lista de socios"+nombresSocio);
			
		}else if(opcion ==2) {
			
			System.out.println("ingrese un numero a modificar");
			System.out.println(numSocio);
			
			int numBorrar = guardar.nextInt();
			
			int posicionEnLista = numSocio.indexOf(numBorrar);
			
			nombresSocio.remove(posicionEnLista);
			numSocio.remove(posicionEnLista);
			
			System.out.println("lista de socios"+numSocio);
			System.out.println("lista de socios"+nombresSocio);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
