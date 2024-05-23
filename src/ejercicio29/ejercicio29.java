package ejercicio29;

import java.util.Scanner;

public class ejercicio29 {
	public static void main(String[] args) throws InterruptedException {

	
		Scanner guardar = new Scanner(System.in);

		int bateria = 100;
        
		System.out.println("cargado maximo");
		
		for ( int i = 100; i>=0; i-- ) {
			System.out.println("Bateria: "+ bateria + "%");
			bateria--;
			Thread.sleep(20);
			
			if (bateria == 20) {
				System.err.println("Bateria baja");
				
				Thread.sleep(1000);
			}
			
		}

	
		System.err.println("bateria agotada");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
