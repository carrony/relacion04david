package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el número de elementos");
		int tam = teclado.nextInt();
		
		int vector[] = new int [tam];
		System.out.println("Introduce el vector");
		FuncionesVectores.pedirVector(vector);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrar_vector(vector);
		
		int inverso [] = FuncionesVectores.calcularInverso(vector);
		System.out.println("EL vector inverso es ");
		FuncionesVectores.mostrar_vector(inverso);

	}

}
