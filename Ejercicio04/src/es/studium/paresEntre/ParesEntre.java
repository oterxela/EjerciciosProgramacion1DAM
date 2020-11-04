package es.studium.paresEntre;
import java.util.Scanner;

public class ParesEntre {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int numero1, numero2, i;
		System.out.println("Introduce un número entero: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduce otro número entero: ");
		numero2 = teclado.nextInt();
		teclado.close();
		
		for (i=numero1; i<=numero2; i++) {
			
			if (i%2==0) {
				
				System.out.println(i);
			
			}
			
		}
	
	}

}
