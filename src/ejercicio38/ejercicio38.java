package ejercicio38;

import java.util.Scanner;

public class ejercicio38 {
	
	public static void main(String[] args) {

		Scanner guardar = new Scanner(System.in);
		
		int ingreso, ingresoTotal = 0, ingresoMin = 99999, ingresoMax = -99999, horaMax=-1, horaMin=999999;
		
		
		for (int hora = 9; hora >= 19; hora++) {
			
			System.out.println("Ingreso a las " + hora + ":");
			ingreso = guardar.nextInt();

			if (hora > horaMax) {

				horaMax = hora;
			}
			if (hora > horaMin) {

				horaMin = hora;
			}

			ingresoTotal += ingreso; // le sumo a ingresoTotal cada ingreso por hora

		}

		System.out.println("el ingreso maximo fue:" + ingresoMax);

		System.out.println("el ingreso minimo fue:" + ingresoMin);

		System.out.println("el ingreso total fue:" + ingresoTotal);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
