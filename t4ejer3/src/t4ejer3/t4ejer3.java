/*
 * Introducir frase y palabra. Devuelve la posición. Si no la encuentra que devuelva 0
 */
package t4ejer3;

import java.util.Scanner;

public class t4ejer3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int n;
		String frase, palabra;
		
		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();
		System.out.print("Introduce una palabra: ");
		palabra=teclado.nextLine();
		
		n=frase.indexOf(palabra);
		if(n == -1){
			n=0;
			System.out.println(n);
			
		}else
		System.out.println("La posición es " + n);
			

	}

}
