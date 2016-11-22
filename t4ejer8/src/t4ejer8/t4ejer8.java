package t4ejer8;

import java.util.Scanner;

public class t4ejer8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		String frase;
		int n,i,a, suma;
		

		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();
		System.out.print("Introduce un número: ");
		a=teclado.nextInt();
		
		frase=frase.toUpperCase();
		System.out.println(frase);
		
		for(i=0; i < frase.length(); i++){
			n=frase.charAt(i);
			suma=n+a;
			System.out.println(suma);
			
		}
		
	}

}
