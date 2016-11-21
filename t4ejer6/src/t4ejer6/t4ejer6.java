package t4ejer6;

import java.util.Scanner;

public class t4ejer6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i, vocal = 0, conso = 0, num = 0;
		String frase;
		
		do{
			System.out.print("Introduce una frase: ");
			frase=teclado.nextLine();
		}while(frase.length() > 80);
		
		for(i=0; i<frase.length();i++){
			
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' ||frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
				vocal++;
			}else if(frase.charAt(i) > 'a' && frase.charAt(i) < 'z' || frase.charAt(i) == 'ñ')
				conso++;
			else if(frase.charAt(i) != ' ')
				num++;
		}
		System.out.println("Las vocales introducidas son: " + vocal);
		System.out.println("Los números introducidos son: " + num);
		System.out.println("Las consonantes introducidas son: " + conso);
		
		
		
		
		
	}

}
