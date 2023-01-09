package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuantos elementos quieres?");
		int tam = teclado.nextInt();
		
		System.out.println("Introoduce tu vector");
		int numeros[] = new int [tam];
		FuncionesVectores.pedirVector(numeros);
		
		System.out.println("Tu vector es ");
		FuncionesVectores.mostrar_vector(numeros);
		
		if (FuncionesVectores.esCapicua(numeros)) {
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}

	}

}
