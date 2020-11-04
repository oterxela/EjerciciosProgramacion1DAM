package es.studium.ejercicio21;
import java.util.Scanner;

public class TiposTriangulos {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un n�mero entero: ");
		a = teclado.nextInt();
		System.out.println("Introduce otro n�mero entero: ");
		b = teclado.nextInt();
		System.out.println("Introduce un tercer n�mero entero: ");
		c = teclado.nextInt();
		teclado.close();
		
		if (a==b && b==c) {
			
			System.out.println("Son los lados de un tri�ngulo equilatero.");
			
		}
		else if ((a==b && b!=c) || (a==c && b!=c) || (b==c && a!=b)){
			
			System.out.println("Son los lados de un tri�ngulo is�sceles.");
			
		}
		else {
			
			System.out.println("Son los lados de un tri�ngulo escaleno.");
			
		}
		

	}

}
