package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numero de elementos del vector 1");
		int tam1 = teclado.nextInt();
		int vector1[] = new int[tam1];
		
		System.out.println("Introduce el vector 1");
		FuncionesVectores.pedirVector(vector1);
		
		System.out.println("Introduce el numero de elementos del vector 2");
		int tam2 = teclado.nextInt();
		int vector2[] = new int[tam2];
		
		System.out.println("Introduce el vector 2");
		FuncionesVectores.pedirVector(vector2);
		
		int resultado [] = FuncionesVectores.concatenar(vector1, vector2);
		System.out.println("El vector concatenado es ");
		FuncionesVectores.mostrar_vector(resultado);

//		System.out.println("Los dos vectores concatenado a la inversa son");
//		FuncionesVectores.mostrar_vector(
//				FuncionesVectores.concatenar(
//					FuncionesVectores.calcularInverso(vector1),
//					FuncionesVectores.calcularInverso(vector2)));
//		
		
		
		
		
		
	}

}
