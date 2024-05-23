package ejercicio28;

import java.util.Scanner;

public class ejercicio28 {

	public static void main(String[] args) throws InterruptedException {

		Scanner guardar = new Scanner(System.in);

		int bateria = 100;
        
		System.out.println("cargado maximo");
		while (bateria <= 100 && bateria >= 0) {
			System.out.println("Bateria: "+ bateria + "%");
			bateria--;
			Thread.sleep(20);
			
			if (bateria == 20) {
				System.out.println("Bateria baja");
				
				Thread.sleep(1000);
			}
			
		}

	
		System.out.println("bateria agotada");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
