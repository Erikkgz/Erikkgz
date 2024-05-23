package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {
public static void main(String[] args) {
		

		Scanner datos = new Scanner(System.in);  
		int n1,n2,n3;
		
		
		System.out.println("ingrese 1 numeros : ");
        n1 = datos.nextInt();	
		
        System.out.println("ingrese 2 numeros : ");
        n2 = datos.nextInt();	
		
        System.out.println("ingrese 3 numeros : ");
        n3 = datos.nextInt();	
		
        
        if(n1 > n2 && n2 > n3) {
        	System.out.println("El mayor es:" + n1);
        	System.out.println("el interemdio es:" +n2);
        	System.out.println("el menor es:" +n3);	
        }
        else if(n1 > n3 && n3 > n2) {
        	System.out.println("El mayor es:" + n1);
        	System.out.println("el interemdio es:" +n3);
        	System.out.println("el menor es:" +n2);	
        }
        else if(n2 > n1 && n1 > n3) {
        	System.out.println("El mayor es:" + n2);
        	System.out.println("el interemdio es:" +n1);
        	System.out.println("el menor es:" +n3);	
        }	
        else if(n2 > n3 && n3 > n1) {
        	System.out.println("El mayor es:" + n2);
        	System.out.println("el interemdio es:" +n3);
        	System.out.println("el menor es:" +n1);	
        }
        else if(n3 > n2 && n2 > n1) {
        	System.out.println("El mayor es:" + n3);
        	System.out.println("el interemdio es:" +n2);
        	System.out.println("el menor es:" +n1);	
        }
        else if(n3 > n1 && n1 > n2) {
        	System.out.println("El mayor es:" + n3);
        	System.out.println("el interemdio es:" +n1);
        	System.out.println("el menor es:" +n2);	
        }
        
//		
		
	}
}