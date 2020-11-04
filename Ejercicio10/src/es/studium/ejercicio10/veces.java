/*10. Realizar un programa en PSEUDOCÓDIGO que lea dos números enteros por teclado. 
 * El primero nos dirá el número de veces que debe escribirse el segundo */

package es.studium.ejercicio10;
import java.util.Scanner;

public class veces {

	public static void main(String[] args) {
		
		//Variables
		int veces, numero, i;
		Scanner teclado = new Scanner (System.in);
			
		System.out.println("Introduce la cantidad de veces que se repetirá el siguiente número: ");
		veces = teclado.nextInt();
		System.out.println("Introduce el número que se repetirá: ");
		numero = teclado.nextInt();
		teclado.close();
		
		for (i=1; i<=veces; i++) {
			
			System.out.println(i + ".- " + numero);;
				
		}
		
	}

}
