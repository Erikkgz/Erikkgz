package ejercicio19;

import java.util.Scanner;

public class ejercicio19 {

	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in); 
        
		int cafe;
		
		System.out.println("\n1 es cafe cortado");
		
		System.out.println("\n2 es cafe latte");
		
	    System.out.println("\n3 es cafe solo");
		
		System.out.println("\n4 es cafe lagrima");
		
	    System.out.println("\n5 salir del programa");
		
	    System.out.println("\ningrese un numero");
	    cafe = datos.nextInt();
	    
	     switch (cafe) {
	
	case 1:System.out.println("es cafe cortado");
	break;
	
	case 2:System.out.println("es cafe LATTE");
	break;
	
	case 3:System.out.println("es cafe SOLO");
	break;
	
	case 4:System.out.println("es cafe lAGRIMA");
	break;

	case 5:System.out.println("saliste del programa");
	
    default:System.out.println("es incorrecto");
	
	
	
	
	}
	
	

}
}