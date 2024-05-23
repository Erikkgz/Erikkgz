package desafio4;

import java.util.Scanner;

public class desafio4 {

	
	public static void main(String[] args) {
		
		Scanner datos = new Scanner (System.in);
		
		int ano, mes, semana, dias;
		
		System.out.println("ingrese anos:" );
		ano = datos.nextInt();
		System.out.println("ingrese mes:" );
		mes = datos.nextInt();
		System.out.println("ingrese semana: " );
		semana = datos.nextInt();
		
		dias = ano*365 + mes*30 + semana*7;
		
		System.out.println("cantidad de dias : " + dias);
		
			
	}	
}
