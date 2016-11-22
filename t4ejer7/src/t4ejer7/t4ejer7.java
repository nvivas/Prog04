/*
 * Introducir frase y decir cuántas minúsculas, cuántos números y cuántas Mayúsculas hay
 */
package t4ejer7;

import java.util.Scanner;

public class t4ejer7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int i, minus = 0, mayus = 0, num = 0;
		String frase;

		do{
			System.out.print("Introduce una frase: ");
			frase=teclado.nextLine();
		}while(frase.length() > 80);

		for(i=0; i<frase.length();i++){

			if(frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z' || frase.charAt(i) == 'ñ'){
				minus++;
			}else if(frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z' || frase.charAt(i) == 'Ñ'){
				mayus++;
			}else if(frase.charAt(i) != ' '){
				num++;

			}
		}
			System.out.println("Las minúsculas introducidas son: " + minus);
			System.out.println("Las mayúsculas introducidas son: " + mayus);
			System.out.println("Los números introducidos son: " + num);
		
	}
}
