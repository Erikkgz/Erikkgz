package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		float numero1;  
		
		
		System.out.println("Ingrese un numero para calcular su raiz");
		numero1 = entrada.nextFloat();
		
		double raiz_cuadrada = Math.sqrt(numero1);
		int raizInt = (int) raiz_cuadrada;


		System.out.println("el valor de la raiz : " + raiz_cuadrada);
		System.out.println("el valor de la raiz solo con entero es : " + raizInt);
    
		
		
	}

}