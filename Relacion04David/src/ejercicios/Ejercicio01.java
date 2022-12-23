package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Pide un vector por teclado y lo muestra en pantalla

		int numeros[];
		int longitud;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		longitud = teclado.nextInt();
		
		// incializar el vector y asignarle memoria
		numeros = new int[longitud];
		
		System.out.println("Introduce los números:");
		FuncionesVectores.pedirVector(numeros);
		
		System.out.println("El vector es: ");
		FuncionesVectores.mostrar_vector(numeros);
	}

}
