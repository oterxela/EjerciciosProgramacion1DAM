package es.studium.parImpar;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int numero;
		System.out.println("Introduce un n�mero entero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		if (numero%2==0) {
			
			System.out.println("El n�mero introducido es par.");
		
		}
		else {
			
			System.out.println("El n�mero introducido es impar.");
			
		}

	}

}
