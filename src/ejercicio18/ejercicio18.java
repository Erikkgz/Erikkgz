package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {

	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in); 
		   char talles;	
		   
		   
		   System.out.println("ingrese talles de remera(S-M-L) : ");
		   talles = datos.next().charAt(0);
		
		   switch (talles) {
		   
		   case 'S':System.out.println("quedan 5 remeras");
		   break;
		   
		   case 's':System.out.println("quedan 5 remeras");
		   break;
		   
           case 'M':System.out.println("quedan 2 remeras");
           break;
		   
           case 'm':System.out.println("quedan 2 remeras");
		   break;
           
		   case 'L':System.out.println("no quedan remera");
		   break;
		   
		   case 'l':System.out.println("no quedan remera");
		   break;
		   
		   
		   default:System.out.println("el talle es incorrcto");
		   break;
		   
		   }
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
}
}
