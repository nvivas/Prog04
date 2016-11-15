package t4ejer1;

import java.util.Scanner;

public class t4ejer1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase;
		int i;

		System.out.println("Introduce una frase: ");
		frase=teclado.nextLine();

		while (frase.length() > 80){
			System.out.println("Has introducido mas de 80 caracteres");
			frase=teclado.nextLine();
		}
			for(i=1; i<= frase.length();i++){
				System.out.println(frase.substring(0,i));
			}
		

	}

}
