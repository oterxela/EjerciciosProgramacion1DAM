package es.studium.ejercicio17;
import java.util.Scanner;

public class OrdenaNumeros {

	public static void main(String[] args) {

		int numero1, numero2, numero3;
		Scanner teclado = new Scanner (System.in);

		System.out.println("Introduce el primer número: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduce el segundo número: ");
		numero2 = teclado.nextInt();
		System.out.println("Introduce el tercer número: ");
		numero3 = teclado.nextInt();
		teclado.close();

		if ((numero1>=numero2) && (numero2>=numero3)) {

			System.out.println(numero1 + ", " + numero2 + ", " + numero3 );

		}

		else if ((numero1>=numero3) && (numero3>=numero2)) {

			System.out.println(numero1 + ", " + numero3 + ", " + numero2 );

		}

		else if ((numero2>=numero1) && (numero1>=numero3)) {

			System.out.println(numero2 + ", " + numero1 + ", " + numero3 );

		}

		else if ((numero2>=numero3) && (numero3>=numero1)) {

			System.out.println(numero2 + ", " + numero3 + ", " + numero1 );

		}

		else if ((numero3>=numero2 && numero2>=numero1)) {

			System.out.println(numero3 + ", " + numero2 + ", " + numero1 );

		}

		else if ((numero3>=numero1) && (numero1>=numero2)) {

			System.out.println(numero3 + ", " + numero1 + ", " + numero2 );

		}

	}

}
