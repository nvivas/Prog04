package t4ejer2;

import java.util.Scanner;

public class t4ejer2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String frase, letra;
		int i, mayus=0, minus=0;

		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();

		while (frase.length() > 80){
			System.out.println("Has introducido mas de 80 caracteres. Introduce una frase: ");
			frase=teclado.nextLine();
		}

		for(i=0;i<frase.length();i++){
			letra=frase.substring(i, i+1);
			if(!letra.equals(" "))
				if(letra.equals(letra.toUpperCase())){
					mayus++;
				}else 
					minus++;
		}System.out.println(mayus + " y " + minus);
	}
}