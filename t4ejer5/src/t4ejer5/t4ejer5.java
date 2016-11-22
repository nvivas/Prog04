/*
 * Escribe una frase e imprime las posiciones pares y las impares
 */
package t4ejer5;

import java.util.Scanner;

public class t4ejer5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int i;
		String frase,par ="",impar="";
		char letra;

		do{
			System.out.print("Introduce una frase: ");
			frase=teclado.nextLine();
		}while(frase.length() > 80);

		for( i = 0 ; i<frase.length() ; i++){
			letra=frase.charAt(i);
			if(i%2 == 0){
				par = par + letra;
				
			}else{
				impar = impar + letra;
				
			}
		}System.out.println(par);
		System.out.println(impar);

	}

}
