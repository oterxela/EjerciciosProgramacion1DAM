/*7. Realizar un programa en PSEUDOCODIGO que lea dos números por teclado e indique si son iguales o cual 
 * es mayor de los dos.*/

package es.studium.ejercicio7;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {
		
		//variables
		int numero1, numero2;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduce un número entero: ");
		numero2 = teclado.nextInt();
		teclado.close();
		
		if (numero1>numero2){
			
			System.out.println("El primero número es mayor que el segundo.");
			
		}
		else if (numero1<numero2) {
			
			System.out.println("El primero número es menor que el segundo.");
			
		}
		else {
			
			System.out.println("El primero número es igual que el segundo.");
			
		}
		

	}

}
