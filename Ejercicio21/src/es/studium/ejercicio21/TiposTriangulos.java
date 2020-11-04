package es.studium.ejercicio21;
import java.util.Scanner;

public class TiposTriangulos {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero: ");
		a = teclado.nextInt();
		System.out.println("Introduce otro número entero: ");
		b = teclado.nextInt();
		System.out.println("Introduce un tercer número entero: ");
		c = teclado.nextInt();
		teclado.close();
		
		if (a==b && b==c) {
			
			System.out.println("Son los lados de un triángulo equilatero.");
			
		}
		else if ((a==b && b!=c) || (a==c && b!=c) || (b==c && a!=b)){
			
			System.out.println("Son los lados de un triángulo isósceles.");
			
		}
		else {
			
			System.out.println("Son los lados de un triángulo escaleno.");
			
		}
		

	}

}
