package es.studium.ejercicio14;
import java.util.Scanner;

public class Potencia2 {

	public static void main(String[] args) {
		
		int base, exponente;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la base: ");
		base = teclado.nextInt();
		System.out.println("Introduce el exponente: ");
		exponente = teclado.nextInt();
		teclado.close();
		System.out.println(base + " elevado a " + exponente + " es igual a " + funcionPotencia(base, exponente));
		
	}

	public static int funcionPotencia(int a, int b) {
		
		int resultado, i;
		resultado=1;
		
		for (i=0; i<b; i++) {
			resultado = resultado * a;
		}
		
		return resultado;
		
	}
}
