package ejercicios;

import java.util.Scanner;

public class EjercicioMenor {

	public static void main(String[] args) {
		int numeros [];
		int longitud;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el numeros de elementos:");
		longitud = teclado.nextInt();
		
		numeros = new int[longitud];
		
		System.out.println("Introduce tus números:");
		FuncionesVectores.pedirVector(numeros);
		
		System.out.println("Tu vector es: ");
		FuncionesVectores.mostrar_vector(numeros);
		
		System.out.println("El menor elemento del vector es "+ 
						FuncionesVectores.devuelveMenor(numeros));
		//int menor = FuncionesVectores.devuelveMenor(numeros);
//		System.out.println("EL menor es "+ menor);
		
		

	}

}
