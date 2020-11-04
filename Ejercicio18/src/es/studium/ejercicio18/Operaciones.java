//18. Realizar un programa en PSEUDOCÓDIGO que lea dos números enteros por teclado y calcule su suma, su resta, 
//su producto y su cociente cuando fuera posible.

package es.studium.ejercicio18;
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
		
		System.out.println("La suma de ambos números es igual a " + (a+b));
		System.out.println("La resta de ambos números es igual a " + (a-b));
		System.out.println("El producto de ambos números es igual a " + (a*b));
		
		if (b == 0) {
			System.out.println("No se puede dividir entre 0"); 
		}
		else {
			System.out.println("El cociente de ambos números es igual a " + (float)a/b);  
		}
	}

}
