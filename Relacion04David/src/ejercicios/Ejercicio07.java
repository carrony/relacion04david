package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double v1[], v2[];
		
		int tam;
		System.out.println("Introduce el número de elementos de los vectores:");
		tam = teclado.nextInt();
		
		v1 = new double[tam];
		v2 = new double[tam];
		
		System.out.println("Introduce el vector 1");
		FuncionesVectores.pedirVector(v1);
		
		System.out.println("Introduce el vector 2");
		FuncionesVectores.pedirVector(v2);
		
		/*boolean paralelos=FuncionesVectores.sonParalelos(v1, v2);
		if (paralelos) {*/
		if(FuncionesVectores.sonParalelos(v1, v2)) {
			System.out.println("Son paralelos");
		} else {
			System.out.println("NO son paralelos");
		}

	}

}
