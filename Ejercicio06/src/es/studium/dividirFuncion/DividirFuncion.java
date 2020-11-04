/*6. Realizar un programa en PSEUDOCODIGO que lea dos números y mediante una función, 
 * calcule la división de ambos.*/
package es.studium.dividirFuncion;
import java.util.Scanner;

public class DividirFuncion {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int dividendo, divisor;
		System.out.println("Introduce el dividendo: ");
		dividendo = teclado.nextInt();
		System.out.println("Introduce el divisor: ");
		divisor = teclado.nextInt();
		System.out.println(dividendo + " / " + divisor + " = " + funcionDividir(dividendo, divisor));
		teclado.close();
	}

	public static float funcionDividir(int a, int b) {
		
		float resultado;
		resultado = (float) a / (float) b;
		return resultado;
		
	}
}
