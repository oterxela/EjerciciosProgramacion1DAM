package es.studium.ejercicio12;
import java.util.Scanner;

public class SumaFuncion {

	public static void main(String[] args) {
		
		int numero1, numero2;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduce un número entero: ");
		numero2 = teclado.nextInt();
		teclado.close();
		
		System.out.println(" ");
		System.out.println("------------");
		System.out.println(numero1 + " + " + numero2 + " = " + funcionSuma(numero1, numero2));
		System.out.println("------------");
		
	}
	
	public static int funcionSuma(int a, int b) {
		
		return (a+b);
		
	}

}
