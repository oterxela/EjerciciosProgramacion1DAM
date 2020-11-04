package es.studium.ejercicio20;
import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduce un n�mero entero: ");
		a = teclado.nextInt();
		System.out.println("Introduce otro n�mero entero: ");
		b = teclado.nextInt();
		System.out.println("Introduce un tercer n�mero entero: ");
		c = teclado.nextInt();
		teclado.close();

		System.out.println("La suma de los n�meros es igual a " + funcionSuma(a,b,c));
		System.out.println("El producto de los n�meros es igual a " + funcionProducto(a,b,c));
		System.out.println("La media de los n�meros es igual a " + funcionMedia(a,b,c));

	}

	public static int funcionSuma(int a, int b, int c) {

		return a+b+c;

	}

	public static int funcionProducto(int a, int b, int c) {

		return a*b*c;

	}
	
	public static float funcionMedia(int a, int b, int c) {

		return (float) funcionSuma(a,b,c)/3;

	}

}
