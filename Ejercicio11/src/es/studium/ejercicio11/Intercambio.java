package es.studium.ejercicio11;
import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		
		int numero1, numero2, cambio;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero para num.1: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduce otro número entero para num.2: ");
		numero2 = teclado.nextInt();
		teclado.close();
		
		cambio = numero1;
		numero1 = numero2;
		numero2 = cambio;
		
		System.out.println("El num.1 ahora vale: " + numero1);
		System.out.println("El num.2 ahora vale: " + numero2);
		

	}

}
