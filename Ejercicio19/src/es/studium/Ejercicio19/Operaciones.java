package es.studium.Ejercicio19;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {

		int a, b;

		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduce un número entero: ");
		a = teclado.nextInt();
		System.out.println("Introduce otro número entero: ");
		b = teclado.nextInt();
		teclado.close();

		System.out.println("La suma de ambos números es igual a " + funcionSuma(a,b));
		System.out.println("La resta de ambos números es igual a " + funcionResta(a,b));
		System.out.println("El producto de ambos números es igual a " + funcionProducto(a,b));

		if (b == 0) {
			System.out.println("No se puede dividir entre 0"); 
		}
		else {
			System.out.println("El cociente de ambos números es igual a " + funcionCociente(a,b));  
		}

	}

	public static int funcionSuma(int a, int b) {

		return a+b;

	}
	
	public static int funcionResta(int a, int b) {

		return a-b;

	}
	
	public static int funcionProducto(int a, int b) {

		return a*b;

	}
	
	public static float funcionCociente(int a, int b) {

		return (float)a/b;

	}

}
