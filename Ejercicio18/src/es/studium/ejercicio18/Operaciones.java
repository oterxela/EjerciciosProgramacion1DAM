//18. Realizar un programa en PSEUDOC�DIGO que lea dos n�meros enteros por teclado y calcule su suma, su resta, 
//su producto y su cociente cuando fuera posible.

package es.studium.ejercicio18;
import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		int a, b;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un n�mero entero: ");
		a = teclado.nextInt();
		System.out.println("Introduce otro n�mero entero: ");
		b = teclado.nextInt();
		teclado.close();
		
		System.out.println("La suma de ambos n�meros es igual a " + (a+b));
		System.out.println("La resta de ambos n�meros es igual a " + (a-b));
		System.out.println("El producto de ambos n�meros es igual a " + (a*b));
		
		if (b == 0) {
			System.out.println("No se puede dividir entre 0"); 
		}
		else {
			System.out.println("El cociente de ambos n�meros es igual a " + (float)a/b);  
		}
	}

}
