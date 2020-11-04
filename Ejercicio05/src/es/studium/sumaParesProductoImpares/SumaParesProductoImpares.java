/*Realizar un programa en PSEUDOCÓDIGO que calcule la suma de los 20 primeros números pares y el producto 
 * de los 20 primeros números impares simultáneamente.*/
package es.studium.sumaParesProductoImpares;

public class SumaParesProductoImpares {

	public static void main(String[] args) {
		
			int i, suma, producto;
			
			suma = 0;
			producto = 1;
			
			for (i=1; i<=40; i++) {
			
			if (i%2==0) {
				
				suma = suma + i;
			
			}
			else {
				
				producto = producto * i;
				
			}
			
			
		}

		System.out.println("La suma de los 20 primeros pares es igual a " + suma);
		System.out.println("El producto de los 20 primeros impares es igual a " + producto);
	}

}
