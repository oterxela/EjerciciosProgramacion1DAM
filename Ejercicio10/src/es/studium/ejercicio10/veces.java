/*10. Realizar un programa en PSEUDOC�DIGO que lea dos n�meros enteros por teclado. 
 * El primero nos dir� el n�mero de veces que debe escribirse el segundo */

package es.studium.ejercicio10;
import java.util.Scanner;

public class veces {

	public static void main(String[] args) {
		
		//Variables
		int veces, numero, i;
		Scanner teclado = new Scanner (System.in);
			
		System.out.println("Introduce la cantidad de veces que se repetir� el siguiente n�mero: ");
		veces = teclado.nextInt();
		System.out.println("Introduce el n�mero que se repetir�: ");
		numero = teclado.nextInt();
		teclado.close();
		
		for (i=1; i<=veces; i++) {
			
			System.out.println(i + ".- " + numero);;
				
		}
		
	}

}
