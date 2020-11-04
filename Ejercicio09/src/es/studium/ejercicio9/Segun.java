/*9. Realizar un programa en PSEUDOCÓDIGO que lea dos números enteros a y b por teclado. 
 * Si a<b obtener su suma. Si a>=b, obtener su multiplicación.*/

package es.studium.ejercicio9;
import java.util.Scanner;

public class Segun {

	public static void main(String[] args) {

		//Variables
		int a, b;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero: ");
		a = teclado.nextInt();
		System.out.println("Introduce otro número entero: ");
		b = teclado.nextInt();
		teclado.close();
		
		if (a<b) {
			
			System.out.println(a + " + " + b + " = " + (a+b) );
			
		}
		else {
			
			System.out.println(a + " x " + b + " = " + (a*b));
			
		}

	}

}
