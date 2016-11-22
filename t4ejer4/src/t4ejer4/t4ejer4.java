/*
 * Imprimir todo en mayúsculas o en minúsculas
 */

package t4ejer4;

import java.util.Scanner;

public class t4ejer4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n;
		String frase, mayus, minus;

		do{
			System.out.print("Introduce una frase: ");
			frase=teclado.nextLine();
		}while(frase.length() > 80);


		System.out.println("Elige una opción: ");
		System.out.println("1. minusculas");
		System.out.println("2. MAYUSCULAS");
		n=teclado.nextInt();

		switch(n){
		case 1:
			minus=frase.toLowerCase();
			System.out.println(minus);
			break;
		case 2:
			mayus=frase.toUpperCase();
			System.out.println(mayus);
			break;
		default:
			System.out.println("Valor no válido");
			break;
		}
	}
}
