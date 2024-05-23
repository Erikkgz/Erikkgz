package ejercicio34;

import java.util.Scanner;

public class ejercicio34 {
	
	public static void main(String[] args) {

		Scanner guardar = new Scanner(System.in);		
		
		int zapatillas,valor_min =-80000 ,valor_max =111000;
		String meses;
		
		
		
		System.out.println("cuanto gano en enero :");//de los 12 meses
	    zapatillas = guardar.nextInt();
	    
	    System.out.println("cuanto fue su menor de ingreso en marzo:");//de los 12 meses
	    zapatillas = guardar.nextInt();
	    
	    
	    
	if(zapatillas < valor_max) {
		valor_max = zapatillas;
	}
	    
	if(zapatillas > valor_min) {
		valor_min = zapatillas;
	}
	    
	System.out.println("en un mes gana mas de "+ valor_max);

	System.out.println("en un mes perdio mas  "+ valor_min);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
