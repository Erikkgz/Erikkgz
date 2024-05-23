package ejercicio21;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) throws InterruptedException {

		Scanner datos = new Scanner(System.in);

		int clima = 35;

		while (clima < 100) {
			System.out.println(clima + "°");

			if (clima < 85) {

				clima += 2;
			}

			Thread.sleep(20);

			if (clima == 85) {
				System.err.println("temperatura MUY PILIGROSA");
				System.out.println(clima + "°");
				Thread.sleep(1000);
			}
			
			 if (clima >=85) {
				 clima ++;
			 }

			Thread.sleep(20);
			
			if (clima == 100) {
				Thread.sleep(1000);
				System.err.println("temperatura MUY PILIGROSA");
			}
		}
	}
}
