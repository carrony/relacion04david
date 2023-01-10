package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño de los vectores: ");
		int tam = teclado.nextInt();
		
		System.out.println("Introduce el primer vector");
		int vector1[] = new int[tam];
		FuncionesVectores.pedirVector(vector1);
		
		System.out.println("Introduce el segundo vector");
		int vector2[] = new int[tam];
		FuncionesVectores.pedirVector(vector2);
		
		int resultado[] = FuncionesVectores.sumar(vector1, vector2);
		
		System.out.println("EL vector 1 es ");
		FuncionesVectores.mostrar_vector(vector1);
		
		System.out.println("EL vector 2 es ");
		FuncionesVectores.mostrar_vector(vector2);
		
		System.out.println("EL vector suma es ");
		FuncionesVectores.mostrar_vector(resultado);
		
		
	}
}
