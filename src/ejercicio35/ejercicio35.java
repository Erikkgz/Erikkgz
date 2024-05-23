package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {
	
	public static void main(String[] args) {


		Scanner guardar = new Scanner(System.in);		
		
		int nota,nota_max =0,nota_min = 11;
		
		for ( int i = 0; i<=5; i++ ) {
			System.out.println("q nota se saco");
            nota = guardar.nextInt();	
            
            if(nota > nota_max) {
    			nota_max = nota;
    		}
            if(nota < nota_min) {
    			nota_min = nota;
    		}
            
         }
		
	   
		
		System.out.println("nota maxima es"+nota_max);
		
		System.out.println("nota minima es"+nota_min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
