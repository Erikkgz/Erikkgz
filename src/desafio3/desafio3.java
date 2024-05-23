package desafio3;

import java.util.Scanner;

public class desafio3 {

	public static void main(String[] args) {
		

		Scanner datos = new Scanner (System.in);
		
		float num1, num2, suma, resta, divi, multi;
		int sumaint, restaint, diviint, multiint;
		
		System.out.println("ingrese su numero");
		num1 = datos.nextFloat();
		
		System.out.println("ingrese otro numero :");
		num2 = datos.nextFloat();
		
		suma = num1 + num2;
		resta = num1 + num2;
		divi = num1 + num2;
		multi = num1 + num2;
		
		

		sumaint = (int) suma;
		restaint = (int) resta;
		diviint = (int) divi;
		multiint = (int) multi;
		
		System.out.println("el resultado de la suma es : " + suma);
		
		System.out.println("el resultado de la suma entera es : " + sumaint);
		
		
		
		
		System.out.println("\nel resultado de la resta : " + resta);
		System.out.println("\nel resultado de la resta entera es : " + restaint);
		System.out.println("\nel resultado de la divi : " + divi);
		System.out.println("\nel resultado de la divi entera es : " + diviint);
        System.out.println("\nel resultado de la multi : " + multi);		
        System.out.println("\nel resultado de la multi entera es : " + multiint);
	
		
	}
}