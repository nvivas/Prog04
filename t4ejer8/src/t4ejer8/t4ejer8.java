package t4ejer8;

import java.util.Scanner;

public class t4ejer8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String frase;
		int n,i,a, suma;
		
		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();
		do{
		System.out.print("Introduce un número: ");
		a=teclado.nextInt();
		}while(a<1 || a>10);
		frase=frase.toUpperCase();
		System.out.print("La frase codificada es: ");

		for(i=0; i < frase.length(); i++){
			n=frase.charAt(i);
			suma=n+a;
			System.out.print((char) suma);

		}

	}

}
