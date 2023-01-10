package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el tamaño del vector");
		int tam = teclado.nextInt();
		
		System.out.println("Introduce el vector 1");
		double vector1 [] = new double[tam];
		FuncionesVectores.pedirVector(vector1);
		
		System.out.println("Introduce el vector 2");
		double vector2 [] = new double[tam];
		FuncionesVectores.pedirVector(vector2);
		
		double res= FuncionesVectores.productoEscalar(vector1, vector2);
		
		System.out.println("El vector 1 es ");
		FuncionesVectores.mostrar_vector(vector1);
		
		System.out.println("El vector 2 es ");
		FuncionesVectores.mostrar_vector(vector2);
		
		System.out.println("El producto escalar de los dos vectores es "+res);
	}

}
