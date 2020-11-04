/*Realizar un programa en PSEUDOCÓDIGO que lea dos números enteros 
  por teclado y muestre la suma de ambos.*/

package es.studium.suma;
import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		//Instancia de tipo Scanner
		Scanner teclado = new Scanner(System.in);
		//Variables
		int numero1, numero2;
		//Inicio
		//Escribir
		System.out.println("Dame un número entero: ");
		//Leer
		numero1 = teclado.nextInt();
		//Escribir
		System.out.println("Dame un número entero: ");
		//Leer
		numero2 = teclado.nextInt();
		//Cerrar teclado
		teclado.close();
		//Escribir
		System.out.println("La suma de " + numero1 + " + " + numero2 + " es igual a " + (numero1+numero2));

	}

}
