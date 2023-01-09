package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Dado un array de enteros de tamaño N, rotar sus valores una posición
		   a la derecha, es decir, si tenemos un array como el siguiente: 
		   5 -1 -3 15 4, el resultado deberá ser el array rotado a la izquierda: 
		   4 5 -1 -3 15.
		 */
		int vector[];
		int tam;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el número de elementos del vector:");
		tam = teclado.nextInt();
		vector = new int[tam];
		
		System.out.println("Introduce el vector");
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("El vector es");
		FuncionesVectores.mostrar_vector(vector);

		FuncionesVectores.rotarDerecha(vector);
		
		System.out.println("El vector rotado es");
		FuncionesVectores.mostrar_vector(vector);

	}

}
