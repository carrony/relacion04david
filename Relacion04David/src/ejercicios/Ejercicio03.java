package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double vector[];
		int num;
		
		System.out.println("¿Cuántos elementos quieres?: ");
		int tam = teclado.nextInt();
		vector = new double[tam];
		
		FuncionesVectores.pedirVector(vector);
		
		int a, b;
		
		System.out.println("Introduce el valor a del intervalo [a,b): ");
		a= teclado.nextInt();
		do {
			System.out.println("Introduce el valor b del intervalo [a,b)."
					+ " DEbe ser mayor que a: ");
			b= teclado.nextInt();
		} while (b<a);
		
		
		System.out.printf("Los elementos del vector en el intervalo "
				+ "[%d,%d) son: \n", a,b);
		FuncionesVectores.muestraEnIntervaloAB(vector, a, b);

	}

}
