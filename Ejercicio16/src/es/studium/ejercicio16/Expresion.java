package es.studium.ejercicio16;
import java.util.Scanner;

public class Expresion {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el valor de a: ");
		a = teclado.nextInt();
		System.out.println("Introduce el valor de b: ");
		b = teclado.nextInt();
		System.out.println("Introduce el valor de c: ");
		c = teclado.nextInt();
		teclado.close();
		System.out.println("El resultado de la expresión es igual a " + funcionExpresion(a, b, c));
		
	}

	public static float funcionExpresion(int a, int b, int c) {
		
		float resultado;

		resultado = (float)((b*b) - (4*a*c))/(2*a);
		
		return resultado;
		
	}

}
