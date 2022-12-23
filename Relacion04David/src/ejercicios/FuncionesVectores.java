package ejercicios;

import java.util.Scanner;

public class FuncionesVectores {

	public static void pedirVector(double v[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el elemento "+i);
			v[i] = teclado.nextDouble();
		}
	}
	
	
	public static int [] pideVectorCompleto() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuántos elementos quieres?: ");
		int longitud = teclado.nextInt();
		
		int numeros []= new int[longitud];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el elemento "+i);
			numeros[i] = teclado.nextInt();
		}
		return numeros;
	}
	
	
	public static void pedirVector(int v[]) {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el elemento "+i);
			v[i] = teclado.nextInt();
		}
	}
	
	public static void mostrar_vector(double v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%.2f ", v[i]);
		}
		System.out.println();
	}

	public static void mostrar_vector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%d ", v[i]);
		}
		System.out.println();
	}
	
	public static void mostrarMenoresQue(int v[], int tope) {
		for(int i=0; i<v.length; i++) {
			if (v[i]<tope) {
				System.out.print(v[i]+" ");
			}
		}
	}
	
	public static int devuelveMenor(int v[]) {
		int menor = v[0];
		for (int i = 1; i<v.length; i++) {
			if (v[i]<menor) {
				menor = v[i];
			}
		}
		return menor;
	}
	
	
}
