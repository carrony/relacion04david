package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		/*
		 * Dado un array de enteros de tamaño N, se debe buscar el primer 
		 * elemento del array mayor que un número A, y a partir de él inclusive,
		 * visualizar todos los valores de los siguientes hasta el último 
		 * elemento del array.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos elementos quieres para el vector:");
		int tam = teclado.nextInt();
		
		System.out.println("Introduce el vector");
		int vector[] = new int[tam];
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Introduce el número a partir del cual"
				+ " quieres mostrar los valores");
		int mayor = teclado.nextInt();
		
		System.out.printf("Los valores a partir del numero mayor que %d son\n",
				mayor);
		FuncionesVectores.mostrarDesdeMayorA(vector, mayor);
		
		

	}

}
