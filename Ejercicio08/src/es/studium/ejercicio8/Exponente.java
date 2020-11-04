/*8. Realizar un programa en PSEUDOCODIGO que calcule la potencia de un número leyendo por teclado el valor de 
 * su base y su exponente*/

package es.studium.ejercicio8;
import java.util.Scanner;

public class Exponente {

	public static void main(String[] args) {
		
		//Variables
		int base, exponente, i, potencia;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la base: ");
		base = teclado.nextInt();
		System.out.println("Introduce el exponente: ");
		exponente = teclado.nextInt();
		potencia = 1;
		teclado.close();
		
		for (i=1; i<=exponente; i++) {
			
			potencia = potencia * base;
			
		}
		System.out.println(" ");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("La potencia de " + base + " elevado a " + exponente + " es igual a " + potencia);
		System.out.println("--------------------------------------------------------------------------------");
	}

}
